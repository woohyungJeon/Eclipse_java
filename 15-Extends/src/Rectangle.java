
public class Rectangle extends Area {
	// Field

	// Constructor
	public Rectangle() {
	}

	public Rectangle(double base, double height) {
		super(base, height); // super�� �θ�Ŭ������ ������ ȣ��
	} 

	// Method
	// ���� ���ϴ� ��� �޼���
	public double getArea() {
		return getBase() * getHeight();
	} 

	public void output() {
		System.out.printf("�簢���� ���� : %s\n", getArea());
	}
}
