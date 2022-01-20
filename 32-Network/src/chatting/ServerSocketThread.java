package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerSocketThread extends Thread{
	Socket socket;
	ChatServer server;
	PrintWriter out;		// 데이터 출력 클래스
	BufferedReader in;		// 데이터 입력 클래스
	String name;			// 채팅명 저장
	String threadName = "Thread";
	
	public ServerSocketThread(ChatServer server, Socket socket) {
		this.server = server;
		this.socket = socket;
		threadName = getName();		// Thread 클래스의 이름을 얻어옴
		System.out.println(socket.getInetAddress() + "님이 입장하였습니다.");
		System.out.println("Thread Name : " + threadName);
	}
	
	// 브로드캐스팅 방식으로 대화내용 전송시 사용
	// => 클라이언트로 문자 전송
	public void sendMessage(String str) {
		out.println(str);
	}
	
	@Override
	public void run() {
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// true : autoFlush 설정
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
			
			sendMessage("대화자 이름을 넣으세요 : ");
			name = in.readLine();
			//System.out.println("name = " + name);
			// 브로드 캐스팅 방식으로 모든 참가자에게 문자 발송
			server.broadCasting("[" + name + "]님이 입장하였습니다.");			
			
			// 채팅 대화 처리
			while(true) {
				String str_in = in.readLine();
				// 브로드 캐스팅 방식으로 모든 참가자에게 문자 발송
				server.broadCasting("[" + name + "]" + str_in);
				System.out.println("str_in = " + str_in);
			}
		} catch (IOException e) {
			System.out.println(threadName + "퇴장했습니다.");
			server.removeClient(this);
			//e.printStackTrace();
		} finally {
			try {
				if(in != null) in.close();
				if(out != null) out.close();
				if(socket != null) socket.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
