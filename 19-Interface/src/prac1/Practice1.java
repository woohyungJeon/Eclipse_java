package prac1;

import java.util.Scanner;
// 2. �θ� ���� ����
public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int num=0;

		while (true) {
			Shape shape=null;
			
			System.out.println("1. �簢��");
			System.out.println("2. ��");
			System.out.println("2. ����");
			System.out.printf("select(1-3) :");
			num = sc.nextInt();

			switch (num) {
			case 1:
				shape = new Rectangle();
				break;
			case 2:
				shape = new Circle();
				break;
			case 3:
				System.out.println("���α׷� ����");
				System.exit(0);
			default :
				System.out.println("��ȣ�� 1~3���� �Է��ϼ���");
			}			
			
			if(shape != null) {
				shape.onDraw();
				shape.onDelete();
			}
			System.out.println();
		}

	}
}
/*
// 1. �ڽ� ���� ����
public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Circle c = new Circle();
		Rectangle r = new Rectangle();		
		int num;

		while (true) {
			System.out.println("1. �簢��");
			System.out.println("2. ��");
			System.out.println("2. ����");
			System.out.printf("select(1-3) :");
			num = sc.nextInt();

			switch (num) {
			case 1:
				r.onDraw();
				r.onDelete();
				break;
			case 2:
				c.onDraw();
				c.onDelete();
				break;
			case 3:
				System.out.println("���α׷� ����");
				System.exit(0);
			}
			System.out.println();
		}

	}
}
*/