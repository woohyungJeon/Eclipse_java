import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int jumsu = sc.nextInt();
		
		if(jumsu >= 90 && jumsu <= 100) {
			System.out.println("A학점 입니다.");
		}
		if(jumsu >= 80 && jumsu < 90) {
			System.out.println("B학점 입니다.");
		}
		if(jumsu >= 70 && jumsu < 80) {
			System.out.println("C학점 입니다.");
		}
		if(jumsu >= 60 && jumsu < 70) {
			System.out.println("D학점 입니다.");
		}
		if(jumsu >= 0 && jumsu < 60) {
			System.out.println("F학점 입니다.");
		}
		
//		if(jumsu < 80 || jumsu >= 90) {
//			System.out.println("B학점이 아닙니다.");
//		}
	}
}
