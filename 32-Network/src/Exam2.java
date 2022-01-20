import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam2 {
	public static void main(String[] args) {
		ServerSocket ss = null;		// 서버 클래스
		Socket socket = null;		// 요청 관리 클래스
		
		try {
			// ServerSocket(포트번호)
			// => 1. 요청 기다림  2. 요청받기 3. 요청처리 4. 응답하기
			ss= new ServerSocket(12345);
			System.out.println("Server Ready...");
		} catch (IOException e) {
			System.out.println("해당 포트가 사용중입니다.");
			return;		// 함수 강제 종료
			//e.printStackTrace();
		}
		
		try {
			socket = ss.accept();	// 클라이언트로부터의 요청을 읽어오는 함수
			System.out.println("접속자 정보 : " + socket.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
}




