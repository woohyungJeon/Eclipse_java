package prac1;

public class Rectangle implements Shape {
	@Override
	public void onDraw() {
		System.out.println("�簢���� �׸���");
	}
	@Override
	public void onDelete() {
		System.out.println("�簢���� �����");
	}
}
