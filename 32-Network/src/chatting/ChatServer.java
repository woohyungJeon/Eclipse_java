package chatting;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
	ServerSocket serverSocket;
	Socket socket;
	List<Thread> list;	 // ä�� �����ڸ� �����ϴ� thread ��ü ����
	
	public ChatServer() {
		list = new ArrayList<Thread>();
		System.out.println("������ ���۵Ǿ����ϴ�.");
	}
	
	public void giveAndTake() {
		try {
			serverSocket = new ServerSocket(5420);
			// serverSocket�� port�� �ٷ� �ٽ� ����Ѵٴ� ����
			serverSocket.setReuseAddress(true);  
			
			while(true) {
				socket = serverSocket.accept();  // Ŭ���̾�Ʈ�� ���� ������ ����
				// �ݹ� ������ Ŭ���̾�Ʈ�� ����� ������ ����
				ServerSocketThread thread = new ServerSocketThread(this, socket);
				addClient(thread);  // ����Ʈ�� ������ ����
				// ������ ����
				thread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// ����Ʈ�� ������ ����
	// synchronized : ��������� ���������͸� �Բ� ������� ���ϵ��� �ϴ� ��
	public synchronized void addClient(Thread thread) {
		list.add(thread);
		System.out.println("Client 1�� ����. �� " + list.size() + "��");
	}
	
	// ����Ʈ���� ������ ����
	public synchronized void removeClient(Thread thread) {
		list.remove(thread);
		System.out.println("Client 1�� ����. �� " + list.size() + "��");
	}
	
	// ��ε�ĳ�������� �޽��� ����
	public synchronized void broadCasting(String str) {
		for(int i=0; i<list.size(); i++) {
			ServerSocketThread thread = (ServerSocketThread)list.get(i);
			thread.sendMessage(str);
		}
	}
}







