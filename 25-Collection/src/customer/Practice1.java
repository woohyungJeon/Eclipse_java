package customer;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer cs = new CustomerImpl();
		
		int select_number;
		
		do {
			System.out.println();
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 고객번호검색");
			System.out.println("4. 이름검색");
			System.out.println("5. 전화번호검색");
			System.out.println("6. 이름 내림차순 정렬");
			System.out.println("7. 고개번호 오름차순 정렬");
			System.out.println("8. 종료");
			System.out.println("--------------------------");
			System.out.print("번호 : ");
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
				System.out.println("종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("1~8번 중에 선택하세요.");
				break;
			}
			
		}while(true);
	}

}
