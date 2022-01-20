package prac2;

public class Circle {
	// singleton 패턴 시작
	private static Circle instance = null;

	public static Circle getInstance() {
		if (instance == null) instance = new Circle();
		
		return instance;
	}

	private Circle() {
	}
	// singleton 패턴 끝
	
	private int r;
	private double size;
	private final double PI = 3.141592;

	public void compute_area() {
		size = r * r * PI;
		//setSize(getR() * getR() * getPI());
	}

	public void compute_around() {
		setSize(getR() * 2 * getPI());
		// size = r * 2 * PI;
	}

	public void output_area() {
		System.out.println("원의 넓이 : " + getSize());
	}

	public void output_around() {
		System.out.println("원의 둘레 : " + getSize());
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