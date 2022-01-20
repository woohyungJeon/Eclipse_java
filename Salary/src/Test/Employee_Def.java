package Test;

import java.util.Scanner;

public class Employee_Def {
	Scanner sc = new Scanner(System.in);
	Employee[] emp = new Employee[20];
	
	int person = 0; //������ ī���ÿ�
	
	//1�� �޴� ��� �޼ҵ�
	void input() {
		if(person < 21){
			emp[person] = new Employee();
			System.out.print("�̸� �Է� : ");
			emp[person].setName(sc.next());
			System.out.print("���� �Է� : ");
			emp[person].setPosition(sc.next());
			System.out.print("�⺻�� �Է� : ");
			emp[person].setPay(sc.nextInt());
			System.out.print("���� �Է� : ");
			emp[person].setBenefit(sc.nextInt());
			emp[person].calc_Tax();
			emp[person].calc_Salary();
		}else {
			System.out.println("������ ��� á���ϴ�.");
		}
		
		person++;
	}	
	
	//�� ��½� ��Ÿ���� �޴� ����
	void outputForm() {
		System.out.println("�̸�\t����\t�⺻��\t����\t����\t����");		
	}
	
	//2�� �޴� ��� �޼ҵ�
	void output() {
		outputForm();
		for(int i=0; i<person; i++) {
			System.out.println(emp[i].toString());
		}		
	}
	
	//3�� �޴� ���� �޼ҵ�
	void modify() {
		String name;
		int name_check = 0;
		System.out.print("������ ��� �̸��� �Է��ϼ��� : ");
		name = sc.next();		
		
		for(int i=0; i<person; i++) {
			if(emp[i].getName().equals(name)) {
				System.out.print("���� �Է� : ");
				emp[i].setPosition(sc.next());
				System.out.print("�⺻�� �Է� : ");
				emp[i].setPay(sc.nextInt());
				System.out.print("���� �Է� : ");
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
			System.out.println("-------------���� �Ϸ�--------------");
		}else if(name_check == 1) {
			System.out.println("-------------���� �̸��Դϴ�.--------------");
		}
	
	}
	
	//4�� �޴� �˻�
	void search() {
		String name;
		int name_check = 0;
		System.out.print("�˻��� ������ �̸��� �Է��ϼ��� : ");
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
			System.out.println("-------------�˻� �Ϸ�--------------");
		}else if(name_check == 1) {
			System.out.println("-------------���� �̸��Դϴ�.--------------");
		}
	}
	
	void end_System() {
		System.out.println("System�� �����մϴ�.");
		System.exit(0);		
	}


}
