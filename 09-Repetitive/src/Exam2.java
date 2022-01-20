
public class Exam2 {
	public static void main(String[] args) {
		// 구구단이 가로로 출력
		for(int a=2; a<=9; a++) {		// 단
			for(int b=1; b<=9; b++) {	// 1~9
				System.out.printf("%d*%d=%2d ", a, b, a*b);
			}
			System.out.println();   // 1줄 넘김
		}
		
		System.out.println("-----------------------------");
		// 구구단이 세로로 출력
		for(int b=1; b<=9; b++) {		// 1~9
			for(int a=2; a<=9; a++) {	// 단
				System.out.printf("%d*%d=%2d ", a, b, a*b);
			}
			System.out.println();   // 1줄 넘김
		}
	}
}
