import java.util.Scanner;

public class Test3 {
	// ���� ����
	// => �Լ� �ۿ� �ִ� ����
	// => ���α׷��� ���۵� ��, �޸𸮿� ���������
	//    ���α׷��� ����� ��, �޸𸮿��� ������
	// => ��� �Լ����� ��� ������
	static int d = 0;
	
	static Scanner sc = new Scanner(System.in);
	// ����
	static int a, b, c;
	
	static void input() {
		System.out.print("���� �Է� : ");
		a = sc.nextInt();
		System.out.print("���� �Է� : ");
		b = sc.nextInt();
	}	
	static void plus() {
		c = a + b;
	}
	static void output() {
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// �Է�
		input();
		// ����
		plus();
		// ���
		output();
		
		// ��������
		// => �Լ��ȿ� �ִ� ����
		// => �Լ��� ���۵� ��, �޸𸮿� ����� ����
		//    �Լ��� ������, �޸𸮿��� ������
		// => �ڱⰡ �����ִ� �Լ��ȿ����� ��� ������
		int e = 0;	
	}
}
