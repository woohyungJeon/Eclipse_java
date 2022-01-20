
public class Rectangle extends Area {
	// Field

	// Constructor
	public Rectangle() {
	}

	public Rectangle(double base, double height) {
		super(base, height); // super로 부모클래스의 생성자 호출
	} 

	// Method
	// 넓이 구하는 멤버 메서드
	public double getArea() {
		return getBase() * getHeight();
	} 

	public void output() {
		System.out.printf("사각형의 넓이 : %s\n", getArea());
	}
}
