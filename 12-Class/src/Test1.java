import java.util.Scanner;

class AAA {
	Scanner sc = new Scanner(System.in);
	// ����
	int a, b, c;
	
	void input() {
		System.out.print("���� �Է� : ");
		a = sc.nextInt();
		System.out.print("���� �Է� : ");
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
		// �Է�
		aa.input();
		// ����
		aa.plus();
		// ���
		aa.output();
	}
}
