import java.util.Scanner;

public class Practice5 {
	static int input_num() { // 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("1.예금 2.출금 3.잔고 4.종료");
		System.out.print("번호 선택:");
		int num = sc.nextInt();
		return num;
	}

	static void end_pgm() { // 종료
		System.out.println("프로그램을 종료합니다.");
		System.exit(0); // 프로그램 종료 명령어
	}

	static int input_money(int c) { // 예금
		System.out.print("예금액을 입력해주세요:");
		Scanner sc = new Scanner(System.in);
		int money_in = sc.nextInt();
		return c + money_in;
	}

	static int output_money(int c) {// 출금
		System.out.print("출금액을 입력해주세요:");
		Scanner sc = new Scanner(System.in);
		int money_out = sc.nextInt();
		return c - money_out;
	}

	static void confirm_deposit(int total) { // 잔고
		System.out.print("잔고 : " + total);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 선언 a=번호, b=금액, c=잔고
		int a = 0, b = 0, c = 0;
		// 입력,연산,출력
		do {
			a = input_num();

			if (a == 4)	end_pgm();

			if (a == 1) c = input_money(c);
			else if (a == 2) c = output_money(c);
			else if (a == 3) confirm_deposit(c);
			else {
				System.out.println("잘못입력하셨습니다. 1~4 입력");
			}
			System.out.println();
		} while (true);
	}
}
