package prac3;

import java.util.Iterator;
import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Test3[] op = new Test3[2];
		
		// 객체 생성 및 입력
		for (int i = 0; i < op.length; i++) {
			op[i] = new Test3();
			op[i].input();
			op[i].setProcess();
			// 총 판매건수 계산
			int cnt = op[i].getQty() + Sales.getCnt();
			// 총 판매건수 저장
			Sales.setCnt(cnt);
			System.out.println(); // 1줄 넘김
		}
		
		System.out.print("할인율 : ");
		Sales.setDiscount(sc.nextDouble());
		
		System.out.println("[[판매가]]");
		for(int i=0; i<op.length; i++) {
			op[i].getDisplay();
		}
		
		System.out.println("판매건수 : " + Sales.getCnt());
	}
}

