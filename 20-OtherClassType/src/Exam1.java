
class Outer1 {
	int x = 10;
	Inner1 inner1 = new Inner1();
	
	void ex() {
		inner1.output();
	}
	
	// Outer1 Ŭ���������� ����� Ŭ����
	// => Outer1�� ��������� ���� ����� �� ����
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
		// inner Ŭ���� ����1
		Outer1 outer1 = new Outer1();
		outer1.ex();
	}
}
