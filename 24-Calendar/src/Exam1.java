import java.util.Calendar;

public class Exam1 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		System.out.println(calendar);
		System.out.println(calendar.toString());
		System.out.println("-----------------");

		// 년, 월, 일, 시, 분, 초 => 24시간제
		int yy = calendar.get(Calendar.YEAR);
		int mm = calendar.get(Calendar.MONTH) + 1; // 1월이 "0"
		int dd = calendar.get(Calendar.DAY_OF_MONTH);
		int hh = calendar.get(Calendar.HOUR_OF_DAY);
		int mi = calendar.get(Calendar.MINUTE);
		int ss = calendar.get(Calendar.SECOND);
		String result = String.format("%d년 %02d월 %02d일 %02d시 %02d분 %02d초", 
										yy, mm, dd, hh, mi, ss);
		System.out.println(result);
		System.out.println("-----------------");

		// 년, 월, 일, 시, 분, 초 => 12시간제
		hh = calendar.get(Calendar.HOUR);
		int ampm = calendar.get(Calendar.AM_PM); //오전 : 0, 오후 : 1
		String[] ampm_str = {"오전", "오후"};
		// %02d
		// %d : 정수
		// 0 : 빈공간을 채우는 숫자
		// 2 : 자리수
		result = String.format("%d년 %02d월 %02d일 %s %02d시 %02d분 %02d초", 
								yy, mm, dd, ampm_str[ampm], hh, mi, ss);
		System.out.println(result);
		System.out.println("-----------------");
		
		result = String.format("%d년 %2d월 %2d일 %s %2d시 %2d분 %2d초", 
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
