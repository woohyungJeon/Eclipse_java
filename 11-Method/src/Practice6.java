import java.util.Scanner;

public class Practice6 {
	static String input_name() { // ǰ�� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("ǰ���� �Է��Ͻÿ� : ");
		String a = sc.next();
		return a;
	}

	static int input_num() { // ���� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		return a;
	}

	static int input_money() { // �ܰ� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("�ܰ��� �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		return a;
	}

	static int compute(int a, int b) { // �Ѿ� ����
		int c = a * b;
		return c;
	}

	static void output(String a, int b, int c, int d) { // ���
		System.out.println("ǰ�� : " + a);
		System.out.println("���� : " + b);
		System.out.println("�ܰ� : " + c);
		System.out.println("�Ѿ� : " + d + "��");
	}

	public static void main(String[] args) {
		// ����
		String name; 	// ǰ��
		int num; 		// ����
		int money; 		// �ܰ�
		int tot; 		// �Ѿ�
		// �Է�
		name = input_name();
		num = input_num();
		money = input_money();

		// ����
		tot = compute(num, money);

		// ���
		output(name, num, money, tot);
	}
}
