
public class Exam1 {
	static void star(int n) {
		for(int i=1; i<=n; i++) {
			System.out.print("*");
		}
		System.out.println();  // 1줄 넘김
	}
	
	public static void main(String[] args) {
		// 5층 별탑 출력하기 : for 이용
		for(int i=1; i<=5; i++) {
			star(i);
		}
		
		/*
		star(1);
		star(2);
		star(3);
		star(4);
		star(5);
		*/
	}
}
