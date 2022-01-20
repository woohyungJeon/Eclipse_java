package prac1;

public class CircleArea extends Circle {
	public CircleArea(int r) {
		super(r);
	}

	@Override
	public void compute() {
		double size = getR() * getR() * getPI();
		setSize(size);
	}

	@Override
	public void output() {
		System.out.println("¿øÀÇ ³ÐÀÌ : " + getSize());
	}
}
