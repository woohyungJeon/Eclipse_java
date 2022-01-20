package prac1;

import java.util.Scanner;
// 2. 부모 기준 사용법
public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int num=0;

		while (true) {
			Shape shape=null;
			
			System.out.println("1. 사각형");
			System.out.println("2. 원");
			System.out.println("2. 종료");
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
				System.out.println("프로그램 종료");
				System.exit(0);
			default :
				System.out.println("번호는 1~3으로 입력하세요");
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
// 1. 자식 기준 사용법
public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Circle c = new Circle();
		Rectangle r = new Rectangle();		
		int num;

		while (true) {
			System.out.println("1. 사각형");
			System.out.println("2. 원");
			System.out.println("2. 종료");
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
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			System.out.println();
		}

	}
}
*/