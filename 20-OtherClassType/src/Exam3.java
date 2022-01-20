
public class Exam3 {
	public static void main(String[] args) {
		// 함수안에는 변수와 명령문만 존재할 수 있다.
		// 함수안에는 다른 함수가 존재할 수 없음
		// 함수안에 클래스는 존재할 수 있다.
		// => 즉, 함수안에는 변수, 명령문, 클래스가 존재할 수 있음
		
		int x = 30;
		
		// 이 함수안에서만 사용할 수 있는 클래스
		// => 그래서 실제로 사용되는 경우는 거의 없음
		class Inner3 {
			int y = 40;
			void output() {
				System.out.println("x = " + x);
				System.out.println("y = " + y);
			}
		}
		
		Inner3 inner3 = new Inner3();
		inner3.output();
	}
}
