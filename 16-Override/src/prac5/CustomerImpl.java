package prac5;

import java.util.Scanner;

public class CustomerImpl extends Customer{
	Scanner sc = new Scanner(System.in);
	CustomerVO[] customer = new CustomerVO[10];	// 객체배열
	int cnt = 0;	// 고객수 저장
	// 입력
	@Override
	public void input() {
		customer[cnt] = new CustomerVO();
		System.out.print("고객번호 : ");
		customer[cnt].setAno(sc.next());
		System.out.print("이   름 : ");
		customer[cnt].setName(sc.next());
		System.out.print("전화번호 : ");
		customer[cnt].setTel(sc.next());

		cnt++;	// 고객수 증가
	}
	// 출력
	@Override
	public void outputTitle() {
		System.out.println("고객번호" + "\t" + "이름" + "\t" + "전화번호");
	}
	@Override
	public void output() {
		outputTitle();
		for (int i = 0; i < cnt; i++) {
			System.out.println(customer[i].toString());
		}
	}
	// 수정 기능
	@Override
	public void revise() {
		boolean chk_name = false; // ture : 있음, false : 없음
		System.out.print("수정할 이름? ");
		String name = sc.next();		

		for (int i = 0; i < cnt; i++) {
			if (customer[i].getName().equals(name)) {
				outputTitle();
				System.out.println(customer[i].toString());
				System.out.println();

				System.out.print("고객번호 : ");
				customer[i].setAno(sc.next());
				System.out.print("이   름 : ");
				customer[i].setName(sc.next());
				System.out.print("전화번호 : ");
				customer[i].setTel(sc.next());
				
				chk_name = true;	// 이름 있음
				break;
			} 
		}
		
		if(!chk_name) {
			System.out.println("등록된 이름이 없습니다.");
		}
		System.out.println();
	}
	// 이름 검색 기능
	@Override
	public void findName() {
		boolean chk_name = false; // ture : 있음, false : 없음
		System.out.print("검색할 이름? ");
		String name = sc.next();

		for (int i = 0; i < cnt; i++) {
			if (customer[i].getName().equals(name)) {
				outputTitle();
				System.out.println(customer[i].toString());
				chk_name = true;
				break;
			} 
		}
		
		if(!chk_name) {
			System.out.println("등록된 이름이 없습니다.");
		}
	}
	// 프로그램 종료
	@Override
	public void pgm_end() {
		System.out.println("종료합니다.");
		System.exit(0);
	}
}