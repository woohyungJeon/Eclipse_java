
public class Exam2 {
	public static void main(String[] args) {
		// �������� ���η� ���
		for(int a=2; a<=9; a++) {		// ��
			for(int b=1; b<=9; b++) {	// 1~9
				System.out.printf("%d*%d=%2d ", a, b, a*b);
			}
			System.out.println();   // 1�� �ѱ�
		}
		
		System.out.println("-----------------------------");
		// �������� ���η� ���
		for(int b=1; b<=9; b++) {		// 1~9
			for(int a=2; a<=9; a++) {	// ��
				System.out.printf("%d*%d=%2d ", a, b, a*b);
			}
			System.out.println();   // 1�� �ѱ�
		}
	}
}
