import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����
		int num1=0, num2=0;
		
		// �Է�
		System.out.print("���� �Է� : ");
		num1 = sc.nextInt();
		System.out.print("���� �Է� : ");
		num2 = sc.nextInt();
		
		// ����		
		// ���
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // ���ϱ� ������
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); // ���� ������
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); // ���ϱ� ������
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); // ������ ������
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)); // ������ ������
	}
}
