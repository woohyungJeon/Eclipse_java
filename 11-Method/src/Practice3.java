import java.util.Scanner;

public class Practice3 {

	static int square(int s1) {
		return s1 * s1;
	}

	static double square(double s2) {
		return s2 * s2;
	}

	static int input_int() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int s1 = sc.nextInt();
		return s1;
	}

	static double input_dbl() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ǽ� �Է� : ");
		double s2 = sc.nextDouble();
		return s2;
	}

	public static void main(String[] args) {
		int s1;
		double s2;

		s1 = input_int();
		s2 = input_dbl();

		System.out.println("���� ���� : " + square(s1)); // square(int)
		System.out.println("�Ǽ� ���� : " + square(s2)); // square(double)
	}

}