import java.net.InetAddress;
import java.net.UnknownHostException;

public class Exam1 {
	public static void main(String[] args) {
		InetAddress ia1 = null;
		InetAddress ia2 = null;
		
		try {
			ia1 = InetAddress.getByName("www.naver.com");
			ia2 = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			System.out.println("�ش� ����Ʈ�� ��ȿ���� �ʽ��ϴ�.");
			return;  // �Լ� ���� ����
			//e.printStackTrace();
		}
		
		System.out.println("ia1 = " + ia1);
		System.out.println("ia2 = " + ia2);
	}
}
