
public class Practice7 {
	public static void main(String[] args) {
		for(int a=1; a<=5; a++) {		// ��
			for(int b=5-a; b>0; b--) {	// ���鹮��
				System.out.print(" ");
			}
			for(int c=1; c<=a; c++) {	// * ����
				System.out.print("*");
			}
			System.out.println();  		// 1�� �ѱ�
		}
	}
}
