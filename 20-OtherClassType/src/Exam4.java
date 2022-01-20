class Inner4 {
	int x = 50;
	int y = 60;
	public void disp() {
		System.out.println("x = " + x);
	}
}
// 정식 상속
class Sub4 extends Inner4 {
	@Override
	public void disp() {
		System.out.println("y = " + y);
	}
}

public class Exam4 {
	public static void main(String[] args) {
		// 정식 상속된 자식클래스 사용
		Sub4 sub4 = new Sub4();
		sub4.disp();
		// 약식 상속
		Inner4 inner4 = new Inner4() {
			@Override
			public void disp() {
				System.out.println("무명 : y = " + y);
			}
		};
		inner4.disp();
	}
}
