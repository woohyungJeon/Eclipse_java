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
		System.out.print("정수 입력 : ");
		int s1 = sc.nextInt();
		return s1;
	}

	static double input_dbl() {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수 입력 : ");
		double s2 = sc.nextDouble();
		return s2;
	}

	public static void main(String[] args) {
		int s1;
		double s2;

		s1 = input_int();
		s2 = input_dbl();

		System.out.println("정수 제곱 : " + square(s1)); // square(int)
		System.out.println("실수 제곱 : " + square(s2)); // square(double)
	}

}