package customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer cs = new CustomerImpl();
		ObjectInOut objectInOut = new ObjectInOut();
		// ���� �б�
		String path = "Data.txt";
		cs.read(path);

		int num;
		while (true) {
			do {
				System.out.println("*************");
				System.out.println("1. �Է�");
				System.out.println("2. ���");
				System.out.println("3. ����ȣ�˻�");
				System.out.println("4. �̸��˻�");
				System.out.println("5. ��ȭ��ȣ�˻�");
				System.out.println("6. �̸� ����");
				System.out.println("7. ����ȣ ����");
				System.out.println("8. ���� ����");
				System.out.println("9. ���� �б�");
				System.out.println("0. ����");
				System.out.println("*************");
				System.out.print("���� : ");
				num = sc.nextInt();
				System.out.println();
			} while (num < 0 || num > 9);

			switch (num) {
			case 1:
				cs.input();
				break;
			case 2:
				cs.output();
				break;
			case 3:
				cs.cnSearch();
				break;
			case 4:
				cs.nameSearch();
				break;
			case 5:
				cs.phoneSearch();
				break;
			case 6:
				cs.nameSort();
				break;
			case 7:
				cs.phoneSort();
				break;
			case 8:
				cs.write(path);
				break;
			case 9:
				cs.read(path);
				break;
			case 0:
				System.out.println("����");
				cs.write(path);
				System.exit(0);
			}
		}
	}
}