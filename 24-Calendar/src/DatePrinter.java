import java.util.Calendar;

// ����� Ŭ����
public class DatePrinter {
	public static void printDateTime(Calendar calendar) {
		// ��, ��, ��, ��, ��, �� => 24�ð���
		int yy = calendar.get(Calendar.YEAR);
		int mm = calendar.get(Calendar.MONTH) + 1;
		int dd = calendar.get(Calendar.DAY_OF_MONTH);
		int hh = calendar.get(Calendar.HOUR_OF_DAY);
		int mi = calendar.get(Calendar.MINUTE);
		int ss = calendar.get(Calendar.SECOND);
		
		String result = String.format("%d�� %02d�� %02d�� %02d�� %02d�� %02d��", 
										yy, mm, dd, hh, mi, ss);
		System.out.println(result);
	}
}
