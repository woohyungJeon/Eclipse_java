import java.util.Random;
import java.util.Scanner;
/*
 1) ���� Ƚ�� �Է�
 2) �ζǹ�ȣ 1��Ʈ ����
 3) �ζǹ�ȣ ����
 4) �ζǹ�ȣ 1��Ʈ ��� 
 */
public class Lotto {
	int[] m;		// �ζǹ�ȣ 1��Ʈ ����
	int buyNum;		// ����Ƚ�� ����
	
	public Lotto() {
		m = new int[6];
	}
	// ����Ƚ�� �Է�
	public void inputBuyNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� Ƚ���� �Է��ϼ��� : ");
		buyNum = sc.nextInt();
		System.out.println();  // ���� �ѱ�
	}
	// �ζǹ�ȣ 1��Ʈ ����
	// => 1~45 ������ ���� 6���� ����
	// => ���ڴ� �ߺ��Ǹ� �ȵ�   
	public void selectLotto() {
		boolean chk = false;	// �ߺ����� ����, true : �ߺ�, false : �ߺ�����
		Random random = new Random();
		// ù��° ���� ����
		m[0] = random.nextInt(45) + 1;	// 1~45 ������ ������ ������ 1��
		
		for(int a=1; a<6; ) {			// ���ذ�
			m[a] = random.nextInt(45) + 1;  // ���� ���� ����
			chk = false;
			// ��ȣ �ߺ� �˻�
			for(int b=0; b<a; b++) {	// �񱳰�
				if(m[a] == m[b]) {
					chk = true;
					break;
				}
			}
			
			if(!chk) a++;
		}
	}
	
	// �ζǹ�ȣ 1��Ʈ ���� (��������) - ���� ����
	public void sort() {
		for(int x=0; x<5; x++) {		// ����
			for(int y=x+1; y<6; y++) {	// ��
				if(m[x] > m[y]) {
					// �ΰ��� ��ȯ
					int temp = m[x];
					m[x] = m[y];
					m[y] = temp;
				}
			}
		}
	}
	// �ζǹ�ȣ 1��Ʈ ���
	public void outputResult() {
		for(int i=0; i<m.length; i++) {
			System.out.printf("%2d ", m[i]);
		}
		System.out.println();  // 1�� �ѱ�
	}
	// ��ü����
	public void doLotto() {
		inputBuyNum(); 	// ����Ƚ�� �Է�
		for(int i=0; i<buyNum; i++) {
			selectLotto();	// 1��Ʈ �ζǹ�ȣ ����
			sort();			// 1��Ʈ �ζǹ�ȣ �������� ����
			outputResult();	// 1��Ʈ ���
		}
	}
}





