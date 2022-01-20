import helper.FileHelper;

public class Exam5 {
	public static void main(String[] args) {
		String encType = "utf-8";
		String filePath = "myfile.txt";
		String content = "안녕하세요. 자바 프로그래밍";
		// 파일 저장
		boolean result = FileHelper.getInstance().writeString(filePath, content, encType);
		
		if(result) {
			System.out.println("파일 저장 성공");
		} else {
			System.out.println("파일 저장 실패");
		}
		
		// 파일 읽기
		String str_result = FileHelper.getInstance().readString(filePath, encType);
		if(str_result != null) {	// 읽기 성공
			System.out.println(str_result);
		} else {
			System.out.println("파일 읽기 실패");
		}
	}
}
