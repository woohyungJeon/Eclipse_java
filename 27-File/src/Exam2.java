import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exam2 {
	public static void main(String[] args) {
		String str = "가나다라마바사abcdefg";
		// D:\aa_ycs\java_ycs\java\workspace\27-File\test2.txt
		String path = "test2.txt";		// 상대 경로
		// 파일 출력
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(path); // 1. 파일 만들기 2. 파일 열기
			fileWriter.write(str);	// 3. 파일에 데이터 저장
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fileWriter != null) fileWriter.close();		// 파일 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 파일 입력
		FileReader fileReader = null;	
		System.out.println((char)0xac00);
		try {
			fileReader = new FileReader(path);	// 파일 열기
			String result = "";
			while(true) {
				int data = fileReader.read();  // 유니코드로 문자1개씩 읽어옴, 
				if(data == -1) break;	// -1 : EOF (End of File)
				result += (char)data;
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}









