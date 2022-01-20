import java.util.Scanner;

public class Test2 {
	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		return a;
	}	
	static int plus(int a, int b) {
		return a + b;
	}
	static void output(int c) {
		System.out.println(c);
	}
	
	public static void main(String[] args) {		
		// 선언
		int a, b, c;
		// 입력
		a = input();
		b = input();
		
		// 연산
		c = plus(a, b);
		
		// 출력
		output(c);
	}
}
