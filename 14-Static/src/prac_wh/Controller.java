package prac_wh;

import java.util.Scanner;

public class Controller {
	Scanner sc = new Scanner(System.in);
	EmpVO[] emp = new EmpVO[5];
	int i = 0;
	
	public void input() {
		if( i < 5) {
			emp[i] = new EmpVO();
			System.out.print("이름 : ");
			emp[i].setName(sc.next());
			System.out.print("연봉 : ");
			emp[i].setSalary(sc.nextInt());
			System.out.print("부서 : ");
			emp[i].setDepartment(sc.next());
			
			i++;			
		}else {
			System.out.println("직원 5명이 모두 찼습니다.");
		}
	}
	
	public void output() {
		for(int i=0; i<emp.length; i++) {
			System.out.println(emp.toString());
		}
		
	}

}
