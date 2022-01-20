package Pracc5;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		CustomerImpl csim = new CustomerImpl();
		int number;
		
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 이름검색");
			System.out.println("5. 종료");
			System.out.println("===========");
			System.out.print("번호 : ");
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
				System.out.println("잘못 입력 하셨습니다.");
			}			
		}
		
	}


}
