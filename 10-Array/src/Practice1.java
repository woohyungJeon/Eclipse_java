
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����
		int[] jumsu = new int[5];
		int sum = 0;
		double ave = 0;
		// �Է�
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print((i+1) + "�� �л��� ������ �Է� : ");
			jumsu[i] = sc.nextInt();
		}
		// ����
		// ����
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
		}
		// ���
		ave = (double) sum / jumsu.length;

		// ���
		System.out.print("���� = " + sum + ", ��� = " + ave);
	}
}

/*
 * public class Practice1 { public static void main(String[] args) { Scanner sc
 * = new Scanner(System.in); // ���� int[] jumsu = new int[5]; int sum=0; double
 * ave=0; // �Է� System.out.print("1�� �л��� ������ �Է� : "); jumsu[0]=sc.nextInt();
 * 
 * System.out.print("2�� �л��� ������ �Է� : "); jumsu[1]=sc.nextInt();
 * 
 * System.out.print("3�� �л��� ������ �Է� : "); jumsu[2]=sc.nextInt();
 * 
 * System.out.print("4�� �л��� ������ �Է� : "); jumsu[3]=sc.nextInt();
 * 
 * System.out.print("5�� �л��� ������ �Է� : "); jumsu[4]=sc.nextInt(); // ���� // ����
 * for(int i=0; i<jumsu.length; i++) { sum += jumsu[i]; } // ��� ave =
 * (double)sum / jumsu.length;
 * 
 * // ��� System.out.print("���� = " + sum + ", ��� = " + ave); } }
 */