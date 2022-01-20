import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam2 {
	public static void main(String[] args) {
		ServerSocket ss = null;		// ���� Ŭ����
		Socket socket = null;		// ��û ���� Ŭ����
		
		try {
			// ServerSocket(��Ʈ��ȣ)
			// => 1. ��û ��ٸ�  2. ��û�ޱ� 3. ��ûó�� 4. �����ϱ�
			ss= new ServerSocket(12345);
			System.out.println("Server Ready...");
		} catch (IOException e) {
			System.out.println("�ش� ��Ʈ�� ������Դϴ�.");
			return;		// �Լ� ���� ����
			//e.printStackTrace();
		}
		
		try {
			socket = ss.accept();	// Ŭ���̾�Ʈ�κ����� ��û�� �о���� �Լ�
			System.out.println("������ ���� : " + socket.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
}




