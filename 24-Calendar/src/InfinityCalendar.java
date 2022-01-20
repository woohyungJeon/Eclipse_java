import java.util.Calendar;
import java.util.Scanner;

public class InfinityCalendar {
	// ����
	Scanner sc = new Scanner(System.in);
	Calendar calendar = Calendar.getInstance();
	int year;		// ��
	int month;		// ��
	int dayNum;		// ���ϼ�
	// �Է�
	void input() {
		do {
			System.out.print("�⵵? ");
			year = sc.nextInt();
		} while(year < 1);
		
		do {
			System.out.print("��? ");
			month = sc.nextInt();
		} while(month < 1 || month > 12);
	}
	// ����
	void setDate() {
		// �Է¹��� ����� 1�Ϸ� ����
		calendar.set(year, month-1, 1);
		dayNum = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("���ϼ� : " + dayNum);
	}
	
	// ���� ���
	void outputTitle() {
		System.out.println();
		System.out.printf("%s %2s%2s %2s%2s %2s%2s\n", 
						"��", "��", "ȭ", "��", "��", "��", "��");
		System.out.println("----------------------");
	}
	// �޷� ���
	void output() {
		// ���ϼ� ��ŭ Ŀ�� �ű��
		for(int i=1; i<dayNum; i++) {
			System.out.print("   ");  // ���鹮��3ĭ  
		}
		// �̹����� ���ϼ� ���ϱ�
		int daysOfMonth = calendar.getActualMaximum(Calendar.DATE);
		// ��¥ ���
		for(int i=1; i<=daysOfMonth; i++) {
			System.out.printf("%2d ", i);
			dayNum++;
			// ���ϼ����� �Ͽ������� Ȯ��, 1�ٳѱ��� �ؾ���
			if(dayNum % 7 == 1) {
				System.out.println();  // 1�� �ѱ�
			}
		}
	}
}





