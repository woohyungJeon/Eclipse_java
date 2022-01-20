import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		Controller controller = new Controller();
		
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 종료");
			System.out.println("--------");
			System.out.print("번호 입력 : ");
			num = sc.nextInt();
			System.out.println();  // 1줄 넘김
			
			switch(num) {
			case 1: 
				controller.input();
				break;
			case 2: 
				controller.output();
				break;
			case 3:
				System.out.println("프로그램 종료");
				System.exit(0);  // 프로그램 강제 종료, 
								 // 0 : 시스템에게 무사히 프로그램이 끝났다는 의미
								 // -1, 1 : 시스템에게 프로그램이 문제가 있어서 종료시킨다는 의미
			}
			
			System.out.println();  // 1줄 넘김
		}
	}
}
