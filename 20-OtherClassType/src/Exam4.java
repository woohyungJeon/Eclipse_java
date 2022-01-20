class Inner4 {
	int x = 50;
	int y = 60;
	public void disp() {
		System.out.println("x = " + x);
	}
}
// ���� ���
class Sub4 extends Inner4 {
	@Override
	public void disp() {
		System.out.println("y = " + y);
	}
}

public class Exam4 {
	public static void main(String[] args) {
		// ���� ��ӵ� �ڽ�Ŭ���� ���
		Sub4 sub4 = new Sub4();
		sub4.disp();
		// ��� ���
		Inner4 inner4 = new Inner4() {
			@Override
			public void disp() {
				System.out.println("���� : y = " + y);
			}
		};
		inner4.disp();
	}
}
