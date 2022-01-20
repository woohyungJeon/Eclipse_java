
public class Exam6 {
										// 예외 전가
	public static void main(String[] args) throws Exception{
		AAA aa = new AAA();
		// 2. 예외 전가
		//aa.ex();
		
		// 1. try-catch
		try {
			aa.ex();
		} catch (NumberFormatException e) {
			System.out.println("문자열에 숫자가 아닌 문자가 있습니다.");
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("알 수 없는 에러 발생");
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
