class Triangle {
	int b, h;

	Triangle() {
		b = 0;
		h = 0;
	}
	
	Triangle(int b, int h) {
		this.b = b;
		this.h = h;
	}

	void setTriangle(int b, int h) {
		this.b = b;
		this.h = h;
	}

	double getArea() {
		return (double)(b * h) / 2;
	}	
}

public class Practice1 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.setTriangle(5, 12);
		System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ : " + t1.getArea());

		Triangle t2 = new Triangle(45, 7);
		System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ : " + t2.getArea());
	}
}
