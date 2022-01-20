import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 선언	
		int n = 0;
		int count = 0;
		
		// 입력
		System.out.print("1~100 사이의 배수를 구할 숫자 입력 : ");
		n = sc.nextInt();
		
		// 연산
		for(int i=1; i<=100; i++) {
			if(i%n == 0) {
				System.out.print(i + " ");
				count++;
			}
		} 
		// 결과
		System.out.println("\n1~100사이의 " + n + "의 배수 개수 = " + count);
	}
	
/*	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 선언		
		// 입력
		System.out.print("1~100 사이의 배수를 구할 숫자 입력 : ");
		int n = sc.nextInt();
		// 연산
		for(int i=1; i<=100; i++) {
			if(n * i <=100) {
				System.out.print(n * i + " ");
			}
		} 
		// 결과
		System.out.println("\n1~100사이의 " + n + "의 배수 개수 = " + 100/n);
	}
*/
}
