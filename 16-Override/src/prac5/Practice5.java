package prac5;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerImpl customerimpl = new CustomerImpl();
		int menuNum = 0;

		while (true) {
			System.out.println("1. �Է�");
			System.out.println("2. ���");
			System.out.println("3. ����");
			System.out.println("4. �̸��˻�");
			System.out.println("5. ����");
			System.out.println("--------");
			System.out.print("��ȣ : ");
			menuNum = sc.nextInt();
			System.out.println();

			switch (menuNum) {
			case 1:	// �Է�
				customerimpl.input();
				break;
			case 2:	// ���
				customerimpl.output();
				break;
			case 3:	// ����
				customerimpl.revise();
				break;
			case 4:	// �̸� �˻�
				customerimpl.findName();
				break;
			case 5:	// ����
				customerimpl.pgm_end();
			default:
				System.out.println("[1~5] �Է����ּ���");
				break;
			}
			System.out.println();
		}

	}

}