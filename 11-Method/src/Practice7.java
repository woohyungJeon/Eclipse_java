import java.util.Scanner;

public class Practice7 {
	static int menu() {
		Scanner in = new Scanner(System.in);
		System.out.println("\n상품 관리 프로그램");
		System.out.println("**************");
		System.out.println("1. 입고");
		System.out.println("2. 출고");
		System.out.println("3. 목록");
		System.out.println("4. 종료");
		System.out.println("**************");
		System.out.print("메뉴 : ");
		int input_num = in.nextInt();
		System.out.println();

		return input_num;
	}

	static void in_goods(String[] product, int[] quantity, int[] price, 
				         int[] total_price, int cnt) {
		Scanner in = new Scanner(System.in);

		System.out.print("품명 : ");
		product[cnt] = in.next();
		System.out.print("수량 : ");
		quantity[cnt] = in.nextInt();
		System.out.print("단가 : ");
		price[cnt] = in.nextInt();
		// 총액 저장
		total_price[cnt] = compute(quantity[cnt], price[cnt]);
	}

	static int compute(int quantity, int price) {
		return quantity * price;
	}

	static void out_goods(String[] product, int[] quantity, int[] price, 
						  int[] total_price, int cnt) {
		Scanner in = new Scanner(System.in);

		System.out.print("품명 : ");
		String out_product = in.next();
		System.out.print("수량 : ");
		int out_quantity = in.nextInt();
		System.out.println();

		int flag = -1; // 상태 저장, 0 : 품명 있음, -1 : 품명이 없음

		// 출력시 수량에서 빠져나가야 한다
		for (int i = 0; i < cnt; i++) {
			if (product[i].equals(out_product)) {  // 입력 품명과 저장된 품명이 일치되는 것이 있는지 검사
				int qty = quantity[i] - out_quantity;
				if (qty >= 0) { // 재고가 충분하면
					quantity[i] = qty;
					total_price[i] = compute(quantity[i], price[i]);
				} else { 		// 재고가 부족하면
					System.out.println("재고가 부족합니다. 현재 재고 : " + quantity[i]);
				}

				flag = 0; // 상품 있음
				break; // for문 탈출
			}
		}

		if (flag == -1)
			System.out.println(out_product + " 상품이 없습니다.");
	}

	static void output_list(String[] product, int[] quantity, int[] price, 
							int[] total_price, int cnt) {
		System.out.println("품명\t 수량\t 단가(원)\t 총액(원)");		// \t : 탭키
		
		for (int i = 0; i < cnt; i++) {			
			System.out.printf("%s\t %d\t %d\t %d\n", 
						product[i], quantity[i], price[i], total_price[i]);
		}
	}

	public static void main(String[] args) {
		// 선언
		String[] product = new String[20]; 	// 상품명
		int[] quantity = new int[20]; 		// 개수
		int[] price = new int[20]; 			// 단가
		int[] total_price = new int[20]; 	// 총합
		int cnt = 0; 						// 전체 상품 관리, 저장된 상품의 종류 갯수

		// 입력, 연산, 출력
		while (true) {
			// 메뉴
			int menu_num = menu();

			if (menu_num == 1) { // 입고
				if (cnt < 20) { // 상품의 개수는 20개 까지
					in_goods(product, quantity, price, total_price, cnt);
					cnt++;
				} else {
					System.out.println("20개 초과입니다. 상품 종류의 개수는 최대 20개입니다.");
				}
			} else if (menu_num == 2) { // 출고
				out_goods(product, quantity, price, total_price, cnt);
			} else if (menu_num == 3) { // 목록
				output_list(product, quantity, price, total_price, cnt);
			} else if (menu_num == 4) { // 종료
				System.out.println("종료를 선택하셨습니다. 프로그램을 종료합니다");
				break;
			} else {
				System.out.println("잘못된 입력입니다. 1~4");
			}

			System.out.println(); // 1줄 넘기
		}
	}
}
