package prac1;

public class Practice1 {
	public static void main(String[] args) {
		// �ڽ� Ŭ���� ����
		CircleArea ca = new CircleArea(10);
		ca.compute();
		ca.output();

		CircleRound cr = new CircleRound(10);
		cr.compute();
		cr.output();
		System.out.println("--------------");

		// �θ� Ŭ���� ����
		Circle[] circle = new Circle[2];
		circle[0] = new CircleArea(10);
		circle[1] = new CircleRound(10);

		for (int i = 0; i < circle.length; i++) {
			circle[i].compute();
			circle[i].output();
		}

	}
}