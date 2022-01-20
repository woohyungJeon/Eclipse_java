import java.util.Scanner;

public class Exam5 {
	static void inputNum(int[] m ) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<m.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			m[i] = sc.nextInt();
		}
	}
	static void outputNum(int[] m) {
		System.out.println();
		System.out.println("--- 출력 ---");
		
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i] + "  ");
		}
	}
	public static void main(String[] args) {
		int[] n = new int[5];		
		inputNum(n);
		outputNum(n);
	}
}
