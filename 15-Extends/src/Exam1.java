
public class Exam1 {
	public static void main(String[] args) {
		// �θ�Ŭ������ ���
		CalcParent parent = new CalcParent();
		System.out.println(parent.multiply(5, 7));
		System.out.println(parent.divide(6, 2));
		System.out.println("-------------------");
		
		// �θ�, �ڽ� Ŭ���� ���� ���
		CalcChild child = new CalcChild();
		System.out.println(child.plus(5, 7));
		System.out.println(child.minus(5, 7));
		System.out.println(child.multiply(5, 7)); 
		System.out.println(child.divide(6, 2));
	}
}
