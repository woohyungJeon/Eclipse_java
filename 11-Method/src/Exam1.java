
public class Exam1 {
	static void star(int n) {
		for(int i=1; i<=n; i++) {
			System.out.print("*");
		}
		System.out.println();  // 1�� �ѱ�
	}
	
	public static void main(String[] args) {
		// 5�� ��ž ����ϱ� : for �̿�
		for(int i=1; i<=5; i++) {
			star(i);
		}
		
		/*
		star(1);
		star(2);
		star(3);
		star(4);
		star(5);
		*/
	}
}
