import java.util.Scanner;


public class FinalResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =0;
		SalaryMenu salaryMenu = new SalaryMenu();
		
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 이름검색");
			System.out.println("5. 종료");
			System.out.println("---------");
			System.out.print("번호 : ");
			num = sc.nextInt();
			System.out.println();
			
			switch(num) {
			case 1:		// 입력
				salaryMenu.input();
				break;
			case 2:		// 출력
				salaryMenu.output();
				break;
			case 3:		// 수정
				salaryMenu.modify();
				break;
			case 4:		// 이름 검색
				salaryMenu.searchName();
				break;
			case 5:		// pgm 종료
				System.out.println("월급 프로그램을 종료합니다.");
				System.exit(0); 
 			}
			
			System.out.println();
		}
	}
}
