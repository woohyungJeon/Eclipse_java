// ���迬����
// true  : ǥ���� ���̸�
// false : ǥ���� �����̸� 
// => ����� �����ؼ� �����
public class Exam6 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 7;
		
		boolean r1 = num1 > num2;		// ���ʰ��� �����ʰ����� ū �� �˻�
		boolean r2 = num1 >= num2;		// ���ʰ��� �����ʰ����� ũ�ų� ���� �� �˻�
		boolean r3 = num1 < num2;		// ���ʰ��� �����ʰ����� ���� �� �˻�
		boolean r4 = num1 <= num2;		// ���ʰ��� �����ʰ����� �۰ų� ���� �� �˻�
		boolean r5 = num1 == num2;    	// �����Ͱ� ���� �� �˻�
		boolean r6 = num1 != num2;		// �����Ͱ� ���� ���� �� �˻�
		
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
