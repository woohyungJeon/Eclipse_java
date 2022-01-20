package prac5;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerImpl customerimpl = new CustomerImpl();
		int menuNum = 0;

		while (true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 이름검색");
			System.out.println("5. 종료");
			System.out.println("--------");
			System.out.print("번호 : ");
			menuNum = sc.nextInt();
			System.out.println();

			switch (menuNum) {
			case 1:	// 입력
				customerimpl.input();
				break;
			case 2:	// 출력
				customerimpl.output();
				break;
			case 3:	// 수정
				customerimpl.revise();
				break;
			case 4:	// 이름 검색
				customerimpl.findName();
				break;
			case 5:	// 종료
				customerimpl.pgm_end();
			default:
				System.out.println("[1~5] 입력해주세요");
				break;
			}
			System.out.println();
		}

	}

}