
public class Exam1 {
	public static void main(String[] args) {
		// 부모클래스만 사용
		CalcParent parent = new CalcParent();
		System.out.println(parent.multiply(5, 7));
		System.out.println(parent.divide(6, 2));
		System.out.println("-------------------");
		
		// 부모, 자식 클래스 같이 사용
		CalcChild child = new CalcChild();
		System.out.println(child.plus(5, 7));
		System.out.println(child.minus(5, 7));
		System.out.println(child.multiply(5, 7)); 
		System.out.println(child.divide(6, 2));
	}
}
