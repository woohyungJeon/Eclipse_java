import java.util.Scanner;

// ���� ������
// ���ǽ� ? ��1 : ��2
// ���ǽ��� true �̸� ��1�� ����
// ���ǽ��� false �̸� ��2�� ����
public class Exam8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. ���� : ���� �����
		int num1 = 0, num2 = 0;
		int result = 0;
		// 2. �Է� : ������ ������ �����ϱ�
		System.out.print("���� �Է� : ");
		num1 = sc.nextInt();
		System.out.print("���� �Է� : ");
		num2 = sc.nextInt();
		
		// 3. ���� : ������ �����ϱ�
		result = (num1 > num2) ? num1 : num2;
		
		// 4. ��� : ������ �� ��� ���
		System.out.println("ū �� : " + result); 
	}
}
