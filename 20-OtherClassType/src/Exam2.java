
class Outer2 {
	int x = 20;
	
	// 여러 특성의 클래스를 묶어서 관리하기 위해서
	static class Inner2 {
		int y = 30;
		
		void output() {
			System.out.println("y = " + y);
		}
	}
}
public class Exam2 {
	public static void main(String[] args) {
		Outer2.Inner2 inner2 = new Outer2.Inner2();
		inner2.output();
	}
}
