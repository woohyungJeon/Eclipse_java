import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����
		int n;
		String cont_ch;
		
		while (true) {
			System.out.print("����� ��������Է��Ͻÿ�:");
			n = sc.nextInt();

			for (int a = 1; a <= 9; a++)
				System.out.printf("%d*%d=%2d\n", n, a, n * a);
			
			System.out.print("������� �����ϼ���(y���):");
			cont_ch = sc.next(); 
			
			if(cont_ch.equals("y") || cont_ch.equals("Y")) {
				continue; 	// ���ǽ����� �̵�
			} else {
				System.out.println("�����մϴ�.");
				break;		// while�� ����
			}
		}		
	}
}
/*
public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����
		int n;
		char cont_ch;
		
		while (true) {
			System.out.print("����� ��������Է��Ͻÿ�:");
			n = sc.nextInt();

			for (int a = 1; a <= 9; a++)
				System.out.printf("%d*%d=%2d\n", n, a, n * a);
			
			System.out.print("������� �����ϼ���(y���):");
			cont_ch = sc.next().charAt(0); 
			
			if(cont_ch == 'y' || cont_ch == 'Y' ) {
				continue; 	// ���ǽ����� �̵�
			} else {
				System.out.println("�����մϴ�.");
				break;		// while�� ����
			}
		}		
	}
}
*/
