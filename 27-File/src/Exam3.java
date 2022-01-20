import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Exam3 {
	public static void main(String[] args) {
		// 순서 : 문자열 => 문자열을 byte 배열로 변경 => byte 배열을 파일에 출력
		// 파일 출력 : utf-8
		String str = "가나다라마바사abcdefg";
		String path = "test3.txt";	// 상대 경로
		
		// utf-8 인코딩 적용
		byte[] buffer = null;
		try {
			// 문자열을 byte 배열로 변경 
			buffer = str.getBytes("utf-8");	// 영어,숫자 : 1byte, 한글: 3byte
			//System.out.println(buffer.length);
		} catch (UnsupportedEncodingException e) {
			System.out.println("지원하지 않는 인코딩입니다.");
			//e.printStackTrace();
		}
		
		// 파일 저장
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(path);	// 1. 파일 만들기 2.파일 열기
			outputStream.write(buffer);		// 3. byte 배열을 파일에 출력
			System.out.println("[INFO] 파일 저장됨");
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 저장 경로를 찾을 수 없습니다.");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 저장에 실패했습니다.");
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알수 없는 에러가 발생하였습니다.");
		} finally {
			try {
				if(outputStream != null) outputStream.close();
			} catch (IOException e) {
				System.out.println("[ERROR] 파일을 닫는데 실패했습니다.");
				//e.printStackTrace();
			}
		}
	}
}
