
public class Exam5 {
	public static void main(String[] args) {
		// ���� ���� : �켱������ ����
		int a1 = 100;
		int x1 = 1;
		int y1 = a1 + x1++;
		//int y1 = a1 + x1;
		//x1++;
		System.out.println("x1 = " + x1);
		System.out.println("y1 = " + y1);
		System.out.println("----------");
		
		// ���� ���� : �켱������ 2����
		int a2 = 100;
		int x2 = 1;
		int y2 = a2 + ++x2;
		//++x2;
		//int y2 = a2 + x2;
		System.out.println("x2 = " + x2);
		System.out.println("y2 = " + y2);		
	}
}
