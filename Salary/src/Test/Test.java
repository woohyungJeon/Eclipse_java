package Test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee_Def eDef = new Employee_Def();
		
		int number;
		
		while(true) {
			System.out.println("--------------------");
			System.out.println("1. ��� : ");
			System.out.println("2. ��� : ");
			System.out.println("3. ���� : ");
			System.out.println("4. �˻� : ");
			System.out.println("5. ���� : ");
			System.out.println("--------------------");
			System.out.print("��ȣ �Է� : ");
			number = sc.nextInt();
			
			switch(number) {
			
			case 1:
				eDef.input(); break;
			case 2:
				eDef.output(); break;
			case 3:
				eDef.modify(); break;
			case 4:
				eDef.search(); break;
			case 5:
				eDef.end_System(); break;
			default:
				System.out.println("���� �޴��Դϴ�. �ٽ� �Է��ϼ��� (1~5)");
				break;
				
			}
			
		}
		
	}

}
