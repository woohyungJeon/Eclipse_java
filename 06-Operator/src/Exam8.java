import java.util.Scanner;

// 삼항 연산자
// 조건식 ? 값1 : 값2
// 조건식이 true 이면 값1을 가짐
// 조건식이 false 이면 값2를 가짐
public class Exam8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 선언 : 변수 만들기
		int num1 = 0, num2 = 0;
		int result = 0;
		// 2. 입력 : 변수에 데이터 저장하기
		System.out.print("정수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("정수 입력 : ");
		num2 = sc.nextInt();
		
		// 3. 연산 : 데이터 가공하기
		result = (num1 > num2) ? num1 : num2;
		
		// 4. 출력 : 데이터 및 결과 출력
		System.out.println("큰 수 : " + result); 
	}
}
