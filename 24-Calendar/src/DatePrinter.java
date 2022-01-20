import java.util.Calendar;

// 도우미 클래스
public class DatePrinter {
	public static void printDateTime(Calendar calendar) {
		// 년, 월, 일, 시, 분, 초 => 24시간제
		int yy = calendar.get(Calendar.YEAR);
		int mm = calendar.get(Calendar.MONTH) + 1;
		int dd = calendar.get(Calendar.DAY_OF_MONTH);
		int hh = calendar.get(Calendar.HOUR_OF_DAY);
		int mi = calendar.get(Calendar.MINUTE);
		int ss = calendar.get(Calendar.SECOND);
		
		String result = String.format("%d년 %02d월 %02d일 %02d시 %02d분 %02d초", 
										yy, mm, dd, hh, mi, ss);
		System.out.println(result);
	}
}
