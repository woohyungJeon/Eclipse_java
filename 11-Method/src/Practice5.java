import java.util.Scanner;

public class Practice5 {
	static int input_num() { // �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("1.���� 2.��� 3.�ܰ� 4.����");
		System.out.print("��ȣ ����:");
		int num = sc.nextInt();
		return num;
	}

	static void end_pgm() { // ����
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0); // ���α׷� ���� ��ɾ�
	}

	static int input_money(int c) { // ����
		System.out.print("���ݾ��� �Է����ּ���:");
		Scanner sc = new Scanner(System.in);
		int money_in = sc.nextInt();
		return c + money_in;
	}

	static int output_money(int c) {// ���
		System.out.print("��ݾ��� �Է����ּ���:");
		Scanner sc = new Scanner(System.in);
		int money_out = sc.nextInt();
		return c - money_out;
	}

	static void confirm_deposit(int total) { // �ܰ�
		System.out.print("�ܰ� : " + total);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���� a=��ȣ, b=�ݾ�, c=�ܰ�
		int a = 0, b = 0, c = 0;
		// �Է�,����,���
		do {
			a = input_num();

			if (a == 4)	end_pgm();

			if (a == 1) c = input_money(c);
			else if (a == 2) c = output_money(c);
			else if (a == 3) confirm_deposit(c);
			else {
				System.out.println("�߸��Է��ϼ̽��ϴ�. 1~4 �Է�");
			}
			System.out.println();
		} while (true);
	}
}
