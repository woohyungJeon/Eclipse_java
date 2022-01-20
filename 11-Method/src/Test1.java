
public class Test1 {
		// 결과자료형(=리턴자료형) : 리턴값이 있을 경우, 어떤 자료형 데이터가 돌아가는지 컴퓨터에 알려주는 것
	static int plus(int a, int b) { // 매개변수 : 다른 함수에서 전달된 데이터를 저장하는 변수
		return a + b;				// 그 즉시, 호출된 곳으로 되돌아가라는 명령어
	}       // 결과값(=리턴값)         // => 만일, 리턴값이 있으면 그값을 가지고 되돌아 감
	
	static void output(int cc) {
		System.out.println(cc);
		return;		// 마지막 줄의 리턴값 없는 return은 생략가능
	}
	public static void main(String[] args) {
		// 선언 : 변수만들기
		int c;
		// 입력 : 변수에 데이터 저장하기
		
		// 연산 : 변수에 저장된 데이터 가공하기
		c = plus(5, 7);			// 함수의 호출 : 함수의 사용법
		// 출력 : 가공된 결과값 또는 데이터 확인
		output(c);
	}
}
