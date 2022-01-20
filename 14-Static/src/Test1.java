import java.util.Scanner;

// java beans
class BBB {
	private int a, b, c;

	public BBB() {
	}	
	public BBB(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public BBB(int a, int b, int c) {
		super();
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
}

class AAA {
	Scanner sc = new Scanner(System.in);
	// 선언
	BBB bb = new BBB();
	
	// 입력
	void input() {
		System.out.print("정수 입력 : ");
		bb.setA(sc.nextInt());
		System.out.print("정수 입력 : ");
		bb.setB(sc.nextInt());
	}
	
	void set(int a, int b) {
		bb.setA(a);
		bb.setB(b);
	}
	// 연산
	void plus() {
		bb.setC(bb.getA() + bb.getB());
	}
	// 출력
	void output() {
		System.out.println(bb.getC());
	}
}

public class Test1 {
	public static void main(String[] args) {
		AAA aa = new AAA();		// 클래스 레퍼런스 변수 (= 객체)
		aa.input();				
		aa.plus();
		aa.output();			
	}
}
