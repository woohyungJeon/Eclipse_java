package prac2;

public class Practice2 {
	public static void main(String[] args) {
		// 规过1
		Circle circle;

		circle = new CircleArea(10);
		circle.compute();
		circle.output();

		circle = new CircleRound(10);
		circle.compute();
		circle.output();
		System.out.println("----------------");
		
		// 规过2 : 按眉 硅凯
		Circle[] circles = new Circle[2];
		circles[0] = new CircleArea(10);
		circles[1] = new CircleRound(10);
		
		for(int i=0; i<circles.length; i++) {
			circles[i].compute();
			circles[i].output();
		}
	}
}