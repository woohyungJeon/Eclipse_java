package Pracc5;

import java.util.Scanner;

public class CustomerImpl {
	Scanner sc = new Scanner(System.in);	
	CustomerVO[] cvo = new CustomerVO[10];
	
	int cnt = 0;
	
	public void input() {
		cvo[cnt] = new CustomerVO();
		System.out.print("고객 번호 : ");
		cvo[cnt].setAno(sc.next());
		System.out.print("이름 : ");
		cvo[cnt].setName(sc.next());
		System.out.print("전화번호 : ");
		cvo[cnt].setTel(sc.next());	
		cnt++;
	}
	
	public void output() {
		System.out.println("고객번호\t이름\t전화번호");
		for(int i=0; i<cnt; i++) {
			System.out.print(cvo[i].getAno()+"\t");
			System.out.print(cvo[i].getName()+"\t");
			System.out.print(cvo[i].getTel()+"\n");
		}
	}
	
	public void modify() {
		String name;
		System.out.print("수정할 이름 ?");
		name = sc.next();
		
		for(int i=0; i<cnt; i++) {
			if(cvo[i].getName().equals(name)) {
				System.out.println("고객번호\t이름\t전화번호");
				System.out.print(cvo[i].getAno()+"\t");
				System.out.print(cvo[i].getName()+"\t");
				System.out.print(cvo[i].getTel()+"\n");
				
				cvo[i] = new CustomerVO();
				System.out.print("고객 번호 : ");
				cvo[i].setAno(sc.next());
				System.out.print("이름 : ");
				cvo[i].setName(sc.next());
				System.out.print("전화번호 : ");
				cvo[i].setTel(sc.next());	
				break;
			}else {
				break;
			}
		}System.out.println("없는 고객입니다.");
		
	}
	
	public void search() {
		String name;
		System.out.print("검색할 이름 ? ");
		name = sc.next();
		
		for(int i=0; i<cnt; i++) {
			if(cvo[i].getName().equals(name)) {
				System.out.println("고객번호\t이름\t전화번호");
				System.out.print(cvo[i].getAno()+"\t");
				System.out.print(cvo[i].getName()+"\t");
				System.out.print(cvo[i].getTel()+"\n");
				break;
			}else {
				System.out.println("없는 고객입니다.");
			}
		}
	}
	
	public void endsystem() {
		System.out.println("종료합니다.");
		System.exit(0);		
	}

}
