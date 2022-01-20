// 논리 연산자
// => 집합의 합집합, 교집합, 여집합을 명령어로 만든 것
// || : or 연산자,  && : and 연산자,  ! : not 연산자
// => 왼쪽값과 오른쪽값은 반드시 boolean 값이어야 함
// => 제어문과 결합해서 사용함
/* 진리표
x		y		x||y	x&&y	!x 
true	true	true	true 	false
ture	false	true	false	false
false	true	true	false	true
false 	false	false	false	true
*/
public class Exam7 {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int x = 5;
		int y = 3;
		
		boolean r1 = a>=b && x>=y;
		boolean r2 = a>=b || x>=y;
		boolean r3 = !r2;
		boolean r4 = !(a>=b || x>=y);  // () : 최우선 연산자, 소괄호 안을 제일 먼저 연산하라
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
	}
}
