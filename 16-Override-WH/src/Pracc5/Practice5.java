package Pracc5;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		CustomerImpl csim = new CustomerImpl();
		int number;
		
		while(true) {
			System.out.println("1. �Է�");
			System.out.println("2. ���");
			System.out.println("3. ����");
			System.out.println("4. �̸��˻�");
			System.out.println("5. ����");
			System.out.println("===========");
			System.out.print("��ȣ : ");
			number = sc.nextInt();
			
			switch(number) {
			case 1:
				csim.input();
				break;
			case 2:
				csim.output();
				break;
			case 3:
				csim.modify();
				break;
			case 4:
				csim.search();
				break;
			case 5:
				csim.endsystem();
				break;
			default:
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			}			
		}
		
	}


}
