import java.util.Scanner;

public class Test2 {
	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
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
		// ����
		int a, b, c;
		// �Է�
		a = input();
		b = input();
		
		// ����
		c = plus(a, b);
		
		// ���
		output(c);
	}
}
