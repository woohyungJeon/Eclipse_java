import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����	
		int n = 0;
		int count = 0;
		
		// �Է�
		System.out.print("1~100 ������ ����� ���� ���� �Է� : ");
		n = sc.nextInt();
		
		// ����
		for(int i=1; i<=100; i++) {
			if(i%n == 0) {
				System.out.print(i + " ");
				count++;
			}
		} 
		// ���
		System.out.println("\n1~100������ " + n + "�� ��� ���� = " + count);
	}
	
/*	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����		
		// �Է�
		System.out.print("1~100 ������ ����� ���� ���� �Է� : ");
		int n = sc.nextInt();
		// ����
		for(int i=1; i<=100; i++) {
			if(n * i <=100) {
				System.out.print(n * i + " ");
			}
		} 
		// ���
		System.out.println("\n1~100������ " + n + "�� ��� ���� = " + 100/n);
	}
*/
}
