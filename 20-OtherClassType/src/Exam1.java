
class Outer1 {
	int x = 10;
	Inner1 inner1 = new Inner1();
	
	void ex() {
		inner1.output();
	}
	
	// Outer1 클래스에서만 사용할 클래스
	// => Outer1의 멤버변수를 같이 사용할 수 있음
	class Inner1{
		int y = 20;
		
		void output() {
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
	}
}
public class Exam1 {
	public static void main(String[] args) {
		// inner 클래스 사용법1
		Outer1 outer1 = new Outer1();
		outer1.ex();
	}
}
