import java.util.Scanner;

public class Practice1 {
	static boolean doubleNum(int a, int b) {
		if (a % b == 0)
			return true;
		else
			return false;
	}

	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		return a;
	}

	static void output(int a, int b) { // 출력
		if (doubleNum(a, b))
			System.out.println(a + "(은)는" + b + "의 배수입니다.");
		else
			System.out.println(a + "(은)는" + b + "의 배수가 아닙니다.");
	}

	public static void main(String[] args) {
		int a, b;
		// 입력
		a = input();
		b = input();
		// 연산, 출력
		output(a, b);
	}
}