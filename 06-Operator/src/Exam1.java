import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 선언
		int num1=0, num2=0;
		
		// 입력
		System.out.print("정수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("정수 입력 : ");
		num2 = sc.nextInt();
		
		// 연산		
		// 출력
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // 더하기 연산자
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); // 빼기 연산자
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); // 곱하기 연산자
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); // 나누기 연산자
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)); // 나머지 연산자
	}
}
