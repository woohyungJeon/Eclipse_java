import java.util.Scanner;

class AAA1 {
	Scanner sc = new Scanner(System.in);
	// ����
	private int a, b, c;
	
	// �⺻ ����Լ� : ������, getter/setter
	// ������ : ������� �ʱ�ȭ
	public AAA1() {
		this(10);	// // AAA1(int) ȣ��
		System.out.println("AAA1() ȣ��");
	}
	public AAA1(int a) {
		System.out.println("AAA1(int a) ȣ��");
	}
	public AAA1(int a, int b, int c) {
		this();   // AAA1() ȣ��
		System.out.println("AAA1(int a, int b, int c) ȣ��");
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

	// �Է�
	public void input() {
		System.out.print("���� �Է� : ");
		a = sc.nextInt();
		System.out.print("���� �Է� : ");
		b = sc.nextInt();
	}
	// ����
	public void plus() {
		c = a + b;
	}
	// ���
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
