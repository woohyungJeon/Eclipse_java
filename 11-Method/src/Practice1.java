import java.util.Scanner;

public class Practice1 {
	static boolean doubleNum(int a, int b) {
		if (a % b == 0)
			return true;
		else
			return false;
	}

	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int a = sc.nextInt();
		return a;
	}

	static void output(int a, int b) { // ���
		if (doubleNum(a, b))
			System.out.println(a + "(��)��" + b + "�� ����Դϴ�.");
		else
			System.out.println(a + "(��)��" + b + "�� ����� �ƴմϴ�.");
	}

	public static void main(String[] args) {
		int a, b;
		// �Է�
		a = input();
		b = input();
		// ����, ���
		output(a, b);
	}
}