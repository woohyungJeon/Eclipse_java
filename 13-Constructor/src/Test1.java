import java.util.Scanner;

class AAA1 {
	Scanner sc = new Scanner(System.in);
	// 선언
	private int a, b, c;
	
	// 기본 멤버함수 : 생성자, getter/setter
	// 생성자 : 멤버변수 초기화
	public AAA1() {
		this(10);	// // AAA1(int) 호출
		System.out.println("AAA1() 호출");
	}
	public AAA1(int a) {
		System.out.println("AAA1(int a) 호출");
	}
	public AAA1(int a, int b, int c) {
		this();   // AAA1() 호출
		System.out.println("AAA1(int a, int b, int c) 호출");
		this.a = a;
		this.b = b;
		this.c = c;		
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}

	// 입력
	public void input() {
		System.out.print("정수 입력 : ");
		a = sc.nextInt();
		System.out.print("정수 입력 : ");
		b = sc.nextInt();
	}
	// 연산
	public void plus() {
		c = a + b;
	}
	// 출력
	public void output() {
		System.out.println(c);
	}
}

public class Test1 {
	public static void main(String[] args) {
		AAA1 aa = new AAA1(1, 2, 3);
		aa.input();
		aa.plus();
		aa.output();
	}
}
