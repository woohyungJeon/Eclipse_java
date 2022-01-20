import java.io.File;
import java.io.IOException;

public class Exam1 {
	public static void main(String[] args) {
		// 강사 컴퓨터 기준 절대 경로 
		// D:\aa_ycs\java_ycs\java\workspace\27-File\src\Main01.java
		File file1 = new File("src/Main01.java");
		System.out.println(file1);	
		System.out.println("--------------------");
		
		// 1) 절대 경로 표시
		System.out.println("절대 경로 : " + file1.getAbsolutePath());	
		System.out.println("--------------------");
		
		// 2) 저장된 경로가 파일인지 검사
		// => 존재하면 true, 없으면 false
		System.out.println("isFile : " + file1.isFile());
		System.out.println("--------------------");
		
		// 3) 저장된 경로가 폴더인지 검사
		// => 존재하면 true, 존재하지 않거나 폴더가 아니면 false
		System.out.println("isDirectory : " + file1.isDirectory());
		System.out.println("--------------------");
		
		// 4) 숨김 파일인 지 검사
		// => 없는 파일은 무조건 false
		System.out.println("isHidden : " + file1.isHidden());
		System.out.println("--------------------");
		
		// 5) 저장된 경로에 파일 또는 폴더가 존재하는 지 검사
		System.out.println("exists : " + file1.exists());
		System.out.println("--------------------");
		
		// 6) 파일 만들기
		try {
			file1.createNewFile();
		} catch (IOException e) {
			System.out.println("파일 생성에 실패했습니다.");
			//e.printStackTrace();
		}
		System.out.println("exists : " + file1.exists());
		System.out.println("--------------------");
		
		// 7) 파일 없애기
		file1.delete();
		System.out.println("exists : " + file1.exists());
		System.out.println("--------------------");
		
		// 폴더
		File file2 = new File("a/b/c/target");
		System.out.println("isFile : " + file2.isFile());
		System.out.println("isDirectory : " + file2.isDirectory());
		System.out.println("isHidden : " + file2.isHidden());
		System.out.println("exists : " + file2.exists());
		System.out.println("--------------------");
		
		// 8) 폴더 만들기
		file2.mkdirs();
		System.out.println("exists : " + file2.exists());
		System.out.println("--------------------");
		
		// 9) 마지막 폴더구분자 이후 단어를 얻기
		System.out.println("파일명 : " + file1.getName());
		System.out.println("폴더명 : " + file2.getName());
		System.out.println("--------------------");
		
		// 10) 처음부터 마지막 폴더구분자 직전까지 얻기
		System.out.println("폴더명 : " + file1.getParent());
		System.out.println("폴더명 : " + file2.getParent());
		System.out.println("--------------------");
		
		// 11) 폴더 삭제 : 마지막 폴더만 삭제됨
		file2.delete();
		System.out.println("exists : " + file2.exists());
		System.out.println("--------------------");
	}
}




