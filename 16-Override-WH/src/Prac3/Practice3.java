package Prac3;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Test3[] op  = new Test3[2];
		
		for(int i=0; i< op.length; i++) {
			op[i] = new Test3();
			op[i].input();
			op[i].setProcess();
			
			int cnt = op[i].getQty() + Sales.getCnt();
			
			Sales.setCnt(cnt);
			System.out.println();
		}
		
		System.out.print("���η� : ");
		Sales.setDiscount(sc.nextDouble());
		
		System.out.println("--�ǸŰ�--");
		for(int i=0; i<op.length; i++) {
			op[i].getDisplay();
		}
		
		System.out.println("�ǸŰǼ� : "+Sales.getCnt());
		
	}

}
