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
				System.out.println("1. 도서 등록");
				System.out.println("2.도서 목록 출력");
				System.out.println("3.파일 저장");
				System.out.println("4.파일 읽기");
				System.out.println("5.종료");
				System.out.println("-----------------");
				System.out.print("번호 : ");
				num = sc.nextInt();
				System.out.println(); //개행				
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
				System.out.println("종료합니다.");
				book.fileSave(path);
				System.exit(0);
				break;
			}
		}
		
	}

}
