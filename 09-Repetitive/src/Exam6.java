
public class Exam6 {
	public static void main(String[] args) {
		// 1~10 ������ Ȧ���� ���ϱ�
		int sum = 0;
		
		// continue : for�ȿ����� ���������� �̵�
		//            while�ȿ����� ���ǽ����� �̵�
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) continue;
			sum += i;
		}
		
		System.out.println("sum = " + sum);
	}
}
