package helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

// 싱글톤 패턴
public class FileHelper {
	// 싱글톤 패턴 시작
	private static FileHelper instance = null;

	public static FileHelper getInstance() {
		if (instance == null)
			instance = new FileHelper();

		return instance;
	}

	private FileHelper() {
	}
	// 싱글톤 패턴 끝

	public boolean writeString(String filePath, String content, String encType) {
		// 순서 : 문자열 => 문자열을 byte 배열로 변환 => byte 배열을 파일로 저장
		boolean write_result = false; // 저장 성공 실패 결과 저장
		
		// 1) 문자열을 byte 배열로 변환
		byte[] buffer = null;
		try {
			buffer = content.getBytes(encType); // 영어,숫자 : 1byte, 한글: 3byte			
		} catch (UnsupportedEncodingException e) {
			System.out.println(encType + " 엔코딩 변환에 실패");
			//e.printStackTrace();
		}

		// byte 배열을 파일로 저장
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(filePath); // 1. 파일 만들기, 2. 파일 열기
			outputStream.write(buffer);	// 2) 파일에 데이터 저장
			// 여기까지 진행되었다는 것은 저장 성공을 의미함
			System.out.println("[INFO] 파일 저장됨");
			write_result = true;  // 성공
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 저장 경로를 찾을 수 없습니다.");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 저장에 실패했습니다.");
			// e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러가 발생했습니다.");
		} finally {
			try {
				// 파일 닫기
				if(outputStream != null) outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 결과 리턴 : 성공 true, 실패 false
		return write_result;
	}

	public String readString(String filePath, String encType) {
		// 순서 : byte 배열 만들기 => byte 배열에 파일 데이터저장 => byte 배열을 문자열로 변환
		byte[] data = null;				// byte 배열 선언
		String read_result = null;		// 문자열 변수 선언
		
		// 파일 읽기
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(filePath);	// 파일 열기
			// 1) byte 배열 만들기
			// inputStream.available() : 파일의 크기 읽어오기
			data = new byte[inputStream.available()];
			// 2) byte 배열에 파일 데이터저장
			inputStream.read(data);
			// 여기까지 진행했다면, 파일 읽기 성공
			System.out.println("[INFO] 파일 읽기 성공");
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 저장 경로를 찾을 수 없음 >> " + filePath);
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 읽기 실패 >> " + filePath);
			// e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러");
		} finally {
			try {
				// 파일 닫기
				if (inputStream != null) inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 3) byte 배열을 문자열로 변환
		if (data != null) {
			try {
				read_result = new String(data, encType); // byte배열로 문자열 생성
				//System.out.println(read_result);
			} catch (UnsupportedEncodingException e) {
				System.out.println("지원하지 않는 인코딩입니다.");
				//e.printStackTrace();
			}
		}
		// 문자열 리턴
		return read_result;
	}
}