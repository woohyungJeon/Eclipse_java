
public class Exam10 {
	public static void main(String[] args) {
		// 인터페이스 사용 방법1 : 익명 클래스
		Calculate calculate = new Calculate() {			
			@Override
			public int operation(int a, int b) {
				return a + b;
			}
		};
		System.out.println(calculate.operation(5, 7)); 
		System.out.println("-------------");
		
		// 인터페이스 사용 방법2 : 람다 함수1
		Calculate calculateAdd2 = (int a, int b) -> {return a+b;};
		
		System.out.println(calculateAdd2.operation(5, 7)); 
		System.out.println("-------------");
		
		// 인터페이스 사용 방법3 : 람다 함수2
		// => 리턴값이 있을 경우, {}와 return은 생략가능
		Calculate calculateAdd3 = (int a, int b) -> a+b;
		System.out.println(calculateAdd3.operation(5, 7)); 
		System.out.println("-------------");
		
		// 인터페이스 사용 방법4 : 람다 함수3
		Calculate calculateAdd4 = (a, b) -> a+b;
		System.out.println(calculateAdd4.operation(5, 7)); 
		System.out.println("-------------");
		
		// 인터페이스 사용 방법5 : 람다 함수4
		System.out.println(((Calculate)(a, b) -> a+b).operation(5, 7)); 
		System.out.println("-------------");
	}
}
