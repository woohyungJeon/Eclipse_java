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
			// 객체가 생성되고 난후, 서버에 접속을 시도함
			socket = new Socket(ia, 12345);
		} catch (UnknownHostException e) {
			System.out.println("알수없는 도메인입니다.");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("접속 오류");
			//e.printStackTrace();
		}
				
	}
}
