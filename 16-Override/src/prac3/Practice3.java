package prac3;

import java.util.Iterator;
import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Test3[] op = new Test3[2];
		
		// ��ü ���� �� �Է�
		for (int i = 0; i < op.length; i++) {
			op[i] = new Test3();
			op[i].input();
			op[i].setProcess();
			// �� �ǸŰǼ� ���
			int cnt = op[i].getQty() + Sales.getCnt();
			// �� �ǸŰǼ� ����
			Sales.setCnt(cnt);
			System.out.println(); // 1�� �ѱ�
		}
		
		System.out.print("������ : ");
		Sales.setDiscount(sc.nextDouble());
		
		System.out.println("[[�ǸŰ�]]");
		for(int i=0; i<op.length; i++) {
			op[i].getDisplay();
		}
		
		System.out.println("�ǸŰǼ� : " + Sales.getCnt());
	}
}

