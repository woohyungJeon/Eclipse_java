package prac1;

public class Circle {
	private int r;
	private double size;
	private final double PI = 3.141592;

	// »ý¼ºÀÚ
	public Circle() {
	}

	public Circle(int r) {
		this.r = r;
	}

	public void compute() {
	}

	public void output() {
	}

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