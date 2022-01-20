package Test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee_Def eDef = new Employee_Def();
		
		int number;
		
		while(true) {
			System.out.println("--------------------");
			System.out.println("1. 등록 : ");
			System.out.println("2. 출력 : ");
			System.out.println("3. 수정 : ");
			System.out.println("4. 검색 : ");
			System.out.println("5. 종료 : ");
			System.out.println("--------------------");
			System.out.print("번호 입력 : ");
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
				System.out.println("없는 메뉴입니다. 다시 입력하세요 (1~5)");
				break;
				
			}
			
		}
		
	}

}
