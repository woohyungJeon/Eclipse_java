package customer;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer cs = new CustomerImpl();
		
		int select_number;
		
		do {
			System.out.println();
			System.out.println("1. �Է�");
			System.out.println("2. ���");
			System.out.println("3. ����ȣ�˻�");
			System.out.println("4. �̸��˻�");
			System.out.println("5. ��ȭ��ȣ�˻�");
			System.out.println("6. �̸� �������� ����");
			System.out.println("7. ����ȣ �������� ����");
			System.out.println("8. ����");
			System.out.println("--------------------------");
			System.out.print("��ȣ : ");
			select_number = sc.nextInt();
			System.out.println();
			
			
			
			switch(select_number) {
			case 1:
				cs.input();
				break;
			case 2:
				cs.output();
				break;
			case 3:
				cs.number_Search();
				break;
			case 4:
				cs.name_Search();
				break;
			case 5:
				cs.phone_Search();
				break;
			case 6:
				cs.name_DesSort();
				break;
			case 7:
				cs.number_ascSort();
				break;
			case 8:
				System.out.println("�����մϴ�.");
				System.exit(0);
				break;
			default:
				System.out.println("1~8�� �߿� �����ϼ���.");
				break;
			}
			
		}while(true);
	}

}
