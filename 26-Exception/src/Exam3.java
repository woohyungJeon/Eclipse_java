
public class Exam3 {
	public static void main(String[] args) {
		String year1 = "1995";
		int age1 = 2022 - Integer.parseInt(year1) + 1;
		System.out.println(age1 + "살 입니다.");
		System.out.println("-----------------");
		
		try {
			String year2 = "뭘까요";
			int age2 = 2022 - Integer.parseInt(year2) + 1;
			System.out.println(age2 + "살 입니다.");
		} catch(Exception e) {
			System.out.println("에러 발생 : " + e.getMessage());
		} finally { 
			// 생략 가능
			// 예외가 발생하든 지, 발생하지 않든지 동작시킬 코드 작성
			System.out.println("finally");
		}
		
		System.out.println("프로그램을 종료합니다.");		
	}
}
