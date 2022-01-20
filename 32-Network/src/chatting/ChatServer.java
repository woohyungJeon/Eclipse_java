package chatting;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
	ServerSocket serverSocket;
	Socket socket;
	List<Thread> list;	 // 채팅 참가자를 관리하는 thread 객체 저장
	
	public ChatServer() {
		list = new ArrayList<Thread>();
		System.out.println("서버가 시작되었습니다.");
	}
	
	public void giveAndTake() {
		try {
			serverSocket = new ServerSocket(5420);
			// serverSocket이 port를 바로 다시 사용한다는 설정
			serverSocket.setReuseAddress(true);  
			
			while(true) {
				socket = serverSocket.accept();  // 클라이언트의 소켓 정보를 저장
				// 금방 접속한 클라이언트를 담당할 쓰레드 생성
				ServerSocketThread thread = new ServerSocketThread(this, socket);
				addClient(thread);  // 리스트에 쓰레드 저장
				// 쓰레드 시작
				thread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 리스트에 쓰레드 저장
	// synchronized : 쓰레드들이 공유데이터를 함께 사용하지 못하도록 하는 것
	public synchronized void addClient(Thread thread) {
		list.add(thread);
		System.out.println("Client 1명 입장. 총 " + list.size() + "명");
	}
	
	// 리스트에서 쓰레드 제거
	public synchronized void removeClient(Thread thread) {
		list.remove(thread);
		System.out.println("Client 1명 퇴장. 총 " + list.size() + "명");
	}
	
	// 브로드캐스팅으로 메시지 전송
	public synchronized void broadCasting(String str) {
		for(int i=0; i<list.size(); i++) {
			ServerSocketThread thread = (ServerSocketThread)list.get(i);
			thread.sendMessage(str);
		}
	}
}







