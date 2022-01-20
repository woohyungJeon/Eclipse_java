package prac1;

public class CircleRound extends Circle {
	public CircleRound(int r) {
		super(r);
	}

	@Override
	public void compute() {
		double size = getR() * 2 * getPI();
		setSize(size);
	}

	@Override
	public void output() {
		System.out.println("원의 둘레 : " + getSize());
	}
}
