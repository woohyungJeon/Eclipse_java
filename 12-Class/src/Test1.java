import java.util.Scanner;

class AAA {
	Scanner sc = new Scanner(System.in);
	// 선언
	int a, b, c;
	
	void input() {
		System.out.print("정수 입력 : ");
		a = sc.nextInt();
		System.out.print("정수 입력 : ");
		b = sc.nextInt();
	}
	void plus() {
		c = a + b;
	}
	void output() {
		System.out.println(c);
	}
}

public class Test1 {	
	public static void main(String[] args) {	
		AAA aa = new AAA();
		// 입력
		aa.input();
		// 연산
		aa.plus();
		// 출력
		aa.output();
	}
}
