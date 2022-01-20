package Test;

import java.util.Scanner;

public class Employee_Def {
	Scanner sc = new Scanner(System.in);
	Employee[] emp = new Employee[20];
	
	int person = 0; //직원수 카운팅용
	
	//1번 메뉴 등록 메소드
	void input() {
		if(person < 21){
			emp[person] = new Employee();
			System.out.print("이름 입력 : ");
			emp[person].setName(sc.next());
			System.out.print("직급 입력 : ");
			emp[person].setPosition(sc.next());
			System.out.print("기본급 입력 : ");
			emp[person].setPay(sc.nextInt());
			System.out.print("수당 입력 : ");
			emp[person].setBenefit(sc.nextInt());
			emp[person].calc_Tax();
			emp[person].calc_Salary();
		}else {
			System.out.println("직원이 모두 찼습니다.");
		}
		
		person++;
	}	
	
	//그 출력시 나타내는 메뉴 형식
	void outputForm() {
		System.out.println("이름\t직급\t기본급\t수당\t세율\t월급");		
	}
	
	//2번 메뉴 출력 메소드
	void output() {
		outputForm();
		for(int i=0; i<person; i++) {
			System.out.println(emp[i].toString());
		}		
	}
	
	//3번 메뉴 수정 메소드
	void modify() {
		String name;
		int name_check = 0;
		System.out.print("수정할 사원 이름을 입력하세요 : ");
		name = sc.next();		
		
		for(int i=0; i<person; i++) {
			if(emp[i].getName().equals(name)) {
				System.out.print("직급 입력 : ");
				emp[i].setPosition(sc.next());
				System.out.print("기본급 입력 : ");
				emp[i].setPay(sc.nextInt());
				System.out.print("수당 입력 : ");
				emp[i].setBenefit(sc.nextInt());
				emp[i].calc_Tax();
				emp[i].calc_Salary();
				name_check = -1;	
				break;
			}else {
				name_check = 1;
			}
		}
		if(name_check == -1) {
			System.out.println("-------------수정 완료--------------");
		}else if(name_check == 1) {
			System.out.println("-------------없는 이름입니다.--------------");
		}
	
	}
	
	//4번 메뉴 검색
	void search() {
		String name;
		int name_check = 0;
		System.out.print("검색할 직원의 이름을 입력하세요 : ");
		name = sc.next();
		
		outputForm();		
		for(int i=0; i<person; i++) {
			if(emp[i].getName().equals(name)) {
				System.out.println(emp[i].toString());
				name_check = -1;
				break;
			}else {
				name_check = 1;
			}
		}
		if(name_check == -1) {
			System.out.println("-------------검색 완료--------------");
		}else if(name_check == 1) {
			System.out.println("-------------없는 이름입니다.--------------");
		}
	}
	
	void end_System() {
		System.out.println("System을 종료합니다.");
		System.exit(0);		
	}


}
