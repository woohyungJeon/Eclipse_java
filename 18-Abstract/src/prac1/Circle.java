package prac1;

public abstract class Circle {
	int r;
	double size;
	final double PI = 3.141592;
	// ������
	public Circle(int r) {
		this.r = r;
	}
	// �߻� �޼ҵ�
	public abstract void compute();
	public abstract void output();

	// getter / setter
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getPI() {
		return PI;
	}
}