package prac1;

public class Circle implements Shape {

	@Override
	public void onDraw() {
		System.out.println("���� �׸���");
	}

	@Override
	public void onDelete() {
		System.out.println("���� �����");
	}
}
