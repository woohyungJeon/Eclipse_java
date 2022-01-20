import java.util.Calendar;

public class Exam1 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		System.out.println(calendar);
		System.out.println(calendar.toString());
		System.out.println("-----------------");

		// ��, ��, ��, ��, ��, �� => 24�ð���
		int yy = calendar.get(Calendar.YEAR);
		int mm = calendar.get(Calendar.MONTH) + 1; // 1���� "0"
		int dd = calendar.get(Calendar.DAY_OF_MONTH);
		int hh = calendar.get(Calendar.HOUR_OF_DAY);
		int mi = calendar.get(Calendar.MINUTE);
		int ss = calendar.get(Calendar.SECOND);
		String result = String.format("%d�� %02d�� %02d�� %02d�� %02d�� %02d��", 
										yy, mm, dd, hh, mi, ss);
		System.out.println(result);
		System.out.println("-----------------");

		// ��, ��, ��, ��, ��, �� => 12�ð���
		hh = calendar.get(Calendar.HOUR);
		int ampm = calendar.get(Calendar.AM_PM); //���� : 0, ���� : 1
		String[] ampm_str = {"����", "����"};
		// %02d
		// %d : ����
		// 0 : ������� ä��� ����
		// 2 : �ڸ���
		result = String.format("%d�� %02d�� %02d�� %s %02d�� %02d�� %02d��", 
								yy, mm, dd, ampm_str[ampm], hh, mi, ss);
		System.out.println(result);
		System.out.println("-----------------");
		
		result = String.format("%d�� %2d�� %2d�� %s %2d�� %2d�� %2d��", 
								yy, mm, dd, ampm_str[ampm], hh, mi, ss);
		System.out.println(result);
		System.out.println("-----------------");
		
		// 20220104_173525
		hh = calendar.get(Calendar.HOUR_OF_DAY);
		result = String.format("%d%02d%02d_%02d%02d%02d", 
								yy, mm, dd, hh, mi, ss);
		System.out.println(result);
		System.out.println("-----------------");
	}
}
