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
	// ����
	BBB bb = new BBB();
	
	// �Է�
	void input() {
		System.out.print("���� �Է� : ");
		bb.setA(sc.nextInt());
		System.out.print("���� �Է� : ");
		bb.setB(sc.nextInt());
	}
	
	void set(int a, int b) {
		bb.setA(a);
		bb.setB(b);
	}
	// ����
	void plus() {
		bb.setC(bb.getA() + bb.getB());
	}
	// ���
	void output() {
		System.out.println(bb.getC());
	}
}

public class Test1 {
	public static void main(String[] args) {
		AAA aa = new AAA();		// Ŭ���� ���۷��� ���� (= ��ü)
		aa.input();				
		aa.plus();
		aa.output();			
	}
}
