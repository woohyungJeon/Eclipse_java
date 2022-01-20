import java.util.Calendar;

public class Exam4 {
	public static void main(String[] args) {
		// ����޷��� �״��� 1���� ���� ��������, �״��� ���������� �˸�ȴ�.
		Calendar calendar = Calendar.getInstance();
		
		// ���ϼ� : ���Ͽ� ���� �ε����� (��:1 ~��:7)
		int dayNum = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("���ϼ� : " + dayNum);
		System.out.println("-----------------");
		
		// �̹����� ���ϱ��� �ִ°�?
		int day_count = calendar.getActualMaximum(Calendar.DATE);
		System.out.println("�̴��� �ϼ� : " + day_count);
		System.out.println("-----------------");
		
		// �̹��� 1���� ���ϼ� ���ϱ�
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		dayNum = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("���ϼ� : " + dayNum);
		System.out.println("-----------------");
		
		// ���� ���
		String[] days = {"��","��", "ȭ", "��","��","��","��"};
		System.out.println("1���� " + days[dayNum-1] + "�����Դϴ�.");
	}
}
