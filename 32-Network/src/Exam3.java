import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Exam3 {
	public static void main(String[] args) {
		InetAddress ia = null;
		Socket socket = null;
		
		try {
			ia = InetAddress.getLocalHost();
			// ��ü�� �����ǰ� ����, ������ ������ �õ���
			socket = new Socket(ia, 12345);
		} catch (UnknownHostException e) {
			System.out.println("�˼����� �������Դϴ�.");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� ����");
			//e.printStackTrace();
		}
				
	}
}
