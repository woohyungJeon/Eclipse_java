
public class Exam10 {
	public static void main(String[] args) {
		// �������̽� ��� ���1 : �͸� Ŭ����
		Calculate calculate = new Calculate() {			
			@Override
			public int operation(int a, int b) {
				return a + b;
			}
		};
		System.out.println(calculate.operation(5, 7)); 
		System.out.println("-------------");
		
		// �������̽� ��� ���2 : ���� �Լ�1
		Calculate calculateAdd2 = (int a, int b) -> {return a+b;};
		
		System.out.println(calculateAdd2.operation(5, 7)); 
		System.out.println("-------------");
		
		// �������̽� ��� ���3 : ���� �Լ�2
		// => ���ϰ��� ���� ���, {}�� return�� ��������
		Calculate calculateAdd3 = (int a, int b) -> a+b;
		System.out.println(calculateAdd3.operation(5, 7)); 
		System.out.println("-------------");
		
		// �������̽� ��� ���4 : ���� �Լ�3
		Calculate calculateAdd4 = (a, b) -> a+b;
		System.out.println(calculateAdd4.operation(5, 7)); 
		System.out.println("-------------");
		
		// �������̽� ��� ���5 : ���� �Լ�4
		System.out.println(((Calculate)(a, b) -> a+b).operation(5, 7)); 
		System.out.println("-------------");
	}
}
