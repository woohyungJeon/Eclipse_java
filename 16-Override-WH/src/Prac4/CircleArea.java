package Prac4;

public class CircleArea extends Circle{
	
	public CircleArea(int r) {
		super(r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void compute() {
		size = r * r * PI;
	}

	@Override
	public void output() {
		System.out.println("���� ���� = " + size);
	}
	
	

}
