import java.util.Random;

// Random Ŭ���� : ������ �����͸� ����� Ŭ����
public class Test2 {
	public static void main(String[] args) {
		Random random = new Random();
		//System.out.println(random.nextInt(5)); // 0~4������ ������ ����1���� ������
		
		// 1~5 ������ ������ ���� 1�� �����
		//int num = random.nextInt(5) + 1;
		//System.out.println(num);
		
		// 1~45 ������ ������ ����1�� �����
		int num2 = random.nextInt(45) + 1;  // 0~44 + 1 => 1~45
		System.out.println(num2);
	}
}
