package Pracc5;

import java.util.Scanner;

public class CustomerImpl {
	Scanner sc = new Scanner(System.in);	
	CustomerVO[] cvo = new CustomerVO[10];
	
	int cnt = 0;
	
	public void input() {
		cvo[cnt] = new CustomerVO();
		System.out.print("�� ��ȣ : ");
		cvo[cnt].setAno(sc.next());
		System.out.print("�̸� : ");
		cvo[cnt].setName(sc.next());
		System.out.print("��ȭ��ȣ : ");
		cvo[cnt].setTel(sc.next());	
		cnt++;
	}
	
	public void output() {
		System.out.println("����ȣ\t�̸�\t��ȭ��ȣ");
		for(int i=0; i<cnt; i++) {
			System.out.print(cvo[i].getAno()+"\t");
			System.out.print(cvo[i].getName()+"\t");
			System.out.print(cvo[i].getTel()+"\n");
		}
	}
	
	public void modify() {
		String name;
		System.out.print("������ �̸� ?");
		name = sc.next();
		
		for(int i=0; i<cnt; i++) {
			if(cvo[i].getName().equals(name)) {
				System.out.println("����ȣ\t�̸�\t��ȭ��ȣ");
				System.out.print(cvo[i].getAno()+"\t");
				System.out.print(cvo[i].getName()+"\t");
				System.out.print(cvo[i].getTel()+"\n");
				
				cvo[i] = new CustomerVO();
				System.out.print("�� ��ȣ : ");
				cvo[i].setAno(sc.next());
				System.out.print("�̸� : ");
				cvo[i].setName(sc.next());
				System.out.print("��ȭ��ȣ : ");
				cvo[i].setTel(sc.next());	
				break;
			}else {
				break;
			}
		}System.out.println("���� ���Դϴ�.");
		
	}
	
	public void search() {
		String name;
		System.out.print("�˻��� �̸� ? ");
		name = sc.next();
		
		for(int i=0; i<cnt; i++) {
			if(cvo[i].getName().equals(name)) {
				System.out.println("����ȣ\t�̸�\t��ȭ��ȣ");
				System.out.print(cvo[i].getAno()+"\t");
				System.out.print(cvo[i].getName()+"\t");
				System.out.print(cvo[i].getTel()+"\n");
				break;
			}else {
				System.out.println("���� ���Դϴ�.");
			}
		}
	}
	
	public void endsystem() {
		System.out.println("�����մϴ�.");
		System.exit(0);		
	}

}
