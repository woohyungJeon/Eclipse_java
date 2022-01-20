package prac1;

public class Practice1 {
	public static void main(String[] args) {
		// 자식 클래스 기준
		CircleArea ca = new CircleArea(10);
		ca.compute();
		ca.output();

		CircleRound cr = new CircleRound(10);
		cr.compute();
		cr.output();
		System.out.println("--------------");

		// 부모 클래스 기준
		Circle[] circle = new Circle[2];
		circle[0] = new CircleArea(10);
		circle[1] = new CircleRound(10);

		for (int i = 0; i < circle.length; i++) {
			circle[i].compute();
			circle[i].output();
		}

	}
}