import java.util.Scanner;

public class Practice6 {
	static String input_name() { // 품명 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("품명을 입력하시오 : ");
		String a = sc.next();
		return a;
	}

	static int input_num() { // 수량 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("수량을 입력하시오 : ");
		int a = sc.nextInt();
		return a;
	}

	static int input_money() { // 단가 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("단가를 입력하시오 : ");
		int a = sc.nextInt();
		return a;
	}

	static int compute(int a, int b) { // 총액 연산
		int c = a * b;
		return c;
	}

	static void output(String a, int b, int c, int d) { // 출력
		System.out.println("품명 : " + a);
		System.out.println("수량 : " + b);
		System.out.println("단가 : " + c);
		System.out.println("총액 : " + d + "원");
	}

	public static void main(String[] args) {
		// 선언
		String name; 	// 품명
		int num; 		// 수량
		int money; 		// 단가
		int tot; 		// 총액
		// 입력
		name = input_name();
		num = input_num();
		money = input_money();

		// 연산
		tot = compute(num, money);

		// 출력
		output(name, num, money, tot);
	}
}
