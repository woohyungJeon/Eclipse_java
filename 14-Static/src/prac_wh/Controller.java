package prac_wh;

import java.util.Scanner;

public class Controller {
	Scanner sc = new Scanner(System.in);
	EmpVO[] emp = new EmpVO[5];
	int i = 0;
	
	public void input() {
		if( i < 5) {
			emp[i] = new EmpVO();
			System.out.print("�̸� : ");
			emp[i].setName(sc.next());
			System.out.print("���� : ");
			emp[i].setSalary(sc.nextInt());
			System.out.print("�μ� : ");
			emp[i].setDepartment(sc.next());
			
			i++;			
		}else {
			System.out.println("���� 5���� ��� á���ϴ�.");
		}
	}
	
	public void output() {
		for(int i=0; i<emp.length; i++) {
			System.out.println(emp.toString());
		}
		
	}

}
