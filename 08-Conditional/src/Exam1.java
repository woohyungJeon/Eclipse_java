import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int jumsu = sc.nextInt();
		
		if(jumsu >= 90 && jumsu <= 100) {
			System.out.println("A���� �Դϴ�.");
		}
		if(jumsu >= 80 && jumsu < 90) {
			System.out.println("B���� �Դϴ�.");
		}
		if(jumsu >= 70 && jumsu < 80) {
			System.out.println("C���� �Դϴ�.");
		}
		if(jumsu >= 60 && jumsu < 70) {
			System.out.println("D���� �Դϴ�.");
		}
		if(jumsu >= 0 && jumsu < 60) {
			System.out.println("F���� �Դϴ�.");
		}
		
//		if(jumsu < 80 || jumsu >= 90) {
//			System.out.println("B������ �ƴմϴ�.");
//		}
	}
}
