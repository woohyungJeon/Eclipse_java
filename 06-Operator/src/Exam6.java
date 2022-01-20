// 관계연산자
// true  : 표현식 참이면
// false : 표현식 거짓이면 
// => 제어문과 결합해서 사용함
public class Exam6 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 7;
		
		boolean r1 = num1 > num2;		// 왼쪽값이 오른쪽값보다 큰 지 검사
		boolean r2 = num1 >= num2;		// 왼쪽값이 오른쪽값보다 크거나 같은 지 검사
		boolean r3 = num1 < num2;		// 왼쪽값이 오른쪽값보다 작은 지 검사
		boolean r4 = num1 <= num2;		// 왼쪽값이 오른쪽값보다 작거나 같은 지 검사
		boolean r5 = num1 == num2;    	// 데이터가 같은 지 검사
		boolean r6 = num1 != num2;		// 데이터가 같지 않은 지 검사
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("--------------");
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		System.out.println("r5 = " + r5);
		System.out.println("r6 = " + r6);
	}
}
