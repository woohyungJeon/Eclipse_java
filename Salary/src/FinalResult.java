import java.util.Scanner;


public class FinalResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =0;
		SalaryMenu salaryMenu = new SalaryMenu();
		
		while(true) {
			System.out.println("1. �Է�");
			System.out.println("2. ���");
			System.out.println("3. ����");
			System.out.println("4. �̸��˻�");
			System.out.println("5. ����");
			System.out.println("---------");
			System.out.print("��ȣ : ");
			num = sc.nextInt();
			System.out.println();
			
			switch(num) {
			case 1:		// �Է�
				salaryMenu.input();
				break;
			case 2:		// ���
				salaryMenu.output();
				break;
			case 3:		// ����
				salaryMenu.modify();
				break;
			case 4:		// �̸� �˻�
				salaryMenu.searchName();
				break;
			case 5:		// pgm ����
				System.out.println("���� ���α׷��� �����մϴ�.");
				System.exit(0); 
 			}
			
			System.out.println();
		}
	}
}
