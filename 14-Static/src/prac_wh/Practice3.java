package prac_wh;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Controller ct = new Controller();
		int number;
		
		while(true) {
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.종료");
			System.out.println("-----");
			System.out.print("번호 입력 : ");
			number = sc.nextInt();
			
			if(number == 3) {
				break;
			}else if(number == 1) {
				ct.input();
			}else {
				ct.output();
			}
			
			
		}
	}

}
