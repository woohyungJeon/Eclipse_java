import java.util.Scanner;

public class Test3 {
	// 전역 변수
	// => 함수 밖에 있는 변수
	// => 프로그램이 시작될 때, 메모리에 만들어지고
	//    프로그램이 종료될 때, 메모리에서 없어짐
	// => 모든 함수에서 사용 가능함
	static int d = 0;
	
	static Scanner sc = new Scanner(System.in);
	// 선언
	static int a, b, c;
	
	static void input() {
		System.out.print("정수 입력 : ");
		a = sc.nextInt();
		System.out.print("정수 입력 : ");
		b = sc.nextInt();
	}	
	static void plus() {
		c = a + b;
	}
	static void output() {
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// 입력
		input();
		// 연산
		plus();
		// 출력
		output();
		
		// 지역변수
		// => 함수안에 있는 변수
		// => 함수가 시작될 때, 메모리에 만들어 지고
		//    함수가 끝나면, 메모리에서 없어짐
		// => 자기가 속해있는 함수안에서만 사용 가능함
		int e = 0;	
	}
}
