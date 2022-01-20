import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 선언
		int n;
		String cont_ch;
		
		while (true) {
			System.out.print("몇단을 출력할지입력하시오:");
			n = sc.nextInt();

			for (int a = 1; a <= 9; a++)
				System.out.printf("%d*%d=%2d\n", n, a, n * a);
			
			System.out.print("계속할지 선택하세요(y계속):");
			cont_ch = sc.next(); 
			
			if(cont_ch.equals("y") || cont_ch.equals("Y")) {
				continue; 	// 조건식으로 이동
			} else {
				System.out.println("종료합니다.");
				break;		// while문 종료
			}
		}		
	}
}
/*
public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 선언
		int n;
		char cont_ch;
		
		while (true) {
			System.out.print("몇단을 출력할지입력하시오:");
			n = sc.nextInt();

			for (int a = 1; a <= 9; a++)
				System.out.printf("%d*%d=%2d\n", n, a, n * a);
			
			System.out.print("계속할지 선택하세요(y계속):");
			cont_ch = sc.next().charAt(0); 
			
			if(cont_ch == 'y' || cont_ch == 'Y' ) {
				continue; 	// 조건식으로 이동
			} else {
				System.out.println("종료합니다.");
				break;		// while문 종료
			}
		}		
	}
}
*/
