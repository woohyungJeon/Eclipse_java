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
	PrintWriter out;		// ������ ��� Ŭ����
	BufferedReader in;		// ������ �Է� Ŭ����
	String name;			// ä�ø� ����
	String threadName = "Thread";
	
	public ServerSocketThread(ChatServer server, Socket socket) {
		this.server = server;
		this.socket = socket;
		threadName = getName();		// Thread Ŭ������ �̸��� ����
		System.out.println(socket.getInetAddress() + "���� �����Ͽ����ϴ�.");
		System.out.println("Thread Name : " + threadName);
	}
	
	// ��ε�ĳ���� ������� ��ȭ���� ���۽� ���
	// => Ŭ���̾�Ʈ�� ���� ����
	public void sendMessage(String str) {
		out.println(str);
	}
	
	@Override
	public void run() {
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// true : autoFlush ����
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
			
			sendMessage("��ȭ�� �̸��� �������� : ");
			name = in.readLine();
			//System.out.println("name = " + name);
			// ��ε� ĳ���� ������� ��� �����ڿ��� ���� �߼�
			server.broadCasting("[" + name + "]���� �����Ͽ����ϴ�.");			
			
			// ä�� ��ȭ ó��
			while(true) {
				String str_in = in.readLine();
				// ��ε� ĳ���� ������� ��� �����ڿ��� ���� �߼�
				server.broadCasting("[" + name + "]" + str_in);
				System.out.println("str_in = " + str_in);
			}
		} catch (IOException e) {
			System.out.println(threadName + "�����߽��ϴ�.");
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
