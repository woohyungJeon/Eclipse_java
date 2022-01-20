package java_test2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book book = new BookImpl();
		ObjectInout objectInout = new ObjectInout();
		
		String path = "BookData.txt";
		book.fileRead(path);
		
		int num;
		
		while(true) {
			do {
				System.out.println("-----------------");
				System.out.println("1. ���� ���");
				System.out.println("2.���� ��� ���");
				System.out.println("3.���� ����");
				System.out.println("4.���� �б�");
				System.out.println("5.����");
				System.out.println("-----------------");
				System.out.print("��ȣ : ");
				num = sc.nextInt();
				System.out.println(); //����				
			}while(num < 0 || num > 5);
			
			switch(num) {
			case 1:
				book.input();
				break;
			case 2:
				book.output();
				break;
			case 3:
				book.fileSave(path);
				break;
			case 4:
				book.fileRead(path);
				break;
			case 5:
				System.out.println("�����մϴ�.");
				book.fileSave(path);
				System.exit(0);
				break;
			}
		}
		
	}

}
