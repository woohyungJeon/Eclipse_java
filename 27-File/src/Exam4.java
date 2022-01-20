import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class Exam4 {
	public static void main(String[] args) {
		// 파일 읽기
		// 순서 : 데이터를 저장할 byte 배열 만들기 
		//       => 파일을 읽어와서 byte 배열에 저장 
		//       => byte 배열을 String으로 변경
		
		String path = "test3.txt";	// 상대 경로
		// 읽은 내용이 저장될 byte배열
		byte[] data = null;
		// byte배열을 변환해 저장될 문자열변수
		String result = null;
		
		// 파일 읽기
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(path); // 파일 열기
			// 1) 데이터를 저장할 byte 배열 만들기
			// inputStream.available() : 파일의 크기 읽어오기
			data = new byte[inputStream.available()];
			// 2) 파일을 읽어와서 byte 배열에 저장
			inputStream.read(data);
			System.out.println("[INFO] 파일 읽기 성공");
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 저장 경로를 찾을 수 없음 >> " + path);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 읽기 실패 >> " + path);
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러");
		} finally {
			try {
				if(inputStream != null) inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 3) byte 배열에 저장된 데이터를 문자열로 변환
		if(data != null) {
			try {
				result = new String(data, "utf-8");
				System.out.println(result);
			} catch (UnsupportedEncodingException e) {
				System.out.println("지원하지 않는 인코딩입니다.");
				//e.printStackTrace();
			}
		}
	}
}
