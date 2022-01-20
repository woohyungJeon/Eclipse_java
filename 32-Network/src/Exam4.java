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
			System.out.println("접속자 정보 : " + socket.toString());
			// 클라이언트의 요청 데이터를 관리할 객체 생성
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 데이터 읽기
			String str = in.readLine();
			System.out.println("전송된 내용 : " + str);
			
			in.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
