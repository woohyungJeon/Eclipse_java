
public class Practice7 {
	public static void main(String[] args) {
		for(int a=1; a<=5; a++) {		// 층
			for(int b=5-a; b>0; b--) {	// 공백문자
				System.out.print(" ");
			}
			for(int c=1; c<=a; c++) {	// * 문자
				System.out.print("*");
			}
			System.out.println();  		// 1줄 넘김
		}
	}
}
