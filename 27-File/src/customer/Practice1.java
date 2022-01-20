package customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer cs = new CustomerImpl();
		ObjectInOut objectInOut = new ObjectInOut();
		// 파일 읽기
		String path = "Data.txt";
		cs.read(path);

		int num;
		while (true) {
			do {
				System.out.println("*************");
				System.out.println("1. 입력");
				System.out.println("2. 출력");
				System.out.println("3. 고객번호검색");
				System.out.println("4. 이름검색");
				System.out.println("5. 전화번호검색");
				System.out.println("6. 이름 정렬");
				System.out.println("7. 고객번호 정렬");
				System.out.println("8. 파일 저장");
				System.out.println("9. 파일 읽기");
				System.out.println("0. 종료");
				System.out.println("*************");
				System.out.print("선택 : ");
				num = sc.nextInt();
				System.out.println();
			} while (num < 0 || num > 9);

			switch (num) {
			case 1:
				cs.input();
				break;
			case 2:
				cs.output();
				break;
			case 3:
				cs.cnSearch();
				break;
			case 4:
				cs.nameSearch();
				break;
			case 5:
				cs.phoneSearch();
				break;
			case 6:
				cs.nameSort();
				break;
			case 7:
				cs.phoneSort();
				break;
			case 8:
				cs.write(path);
				break;
			case 9:
				cs.read(path);
				break;
			case 0:
				System.out.println("종료");
				cs.write(path);
				System.exit(0);
			}
		}
	}
}