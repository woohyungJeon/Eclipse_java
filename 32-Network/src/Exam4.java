import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam4 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		
		try {
			ss = new ServerSocket(12345);
			System.out.println("Server Ready...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			socket = ss.accept();
			System.out.println("������ ���� : " + socket.toString());
			// Ŭ���̾�Ʈ�� ��û �����͸� ������ ��ü ����
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// ������ �б�
			String str = in.readLine();
			System.out.println("���۵� ���� : " + str);
			
			in.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
