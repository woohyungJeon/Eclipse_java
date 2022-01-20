import java.util.Calendar;

public class Exam3 {
	public static void main(String[] args) {
		// 시작 시간 얻기
		Calendar calendar = Calendar.getInstance();
		long ms1 = calendar.getTimeInMillis();
		System.out.println("파일 복사 시작 >> " + ms1);
		
		// 프로그램 일시 정지
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		calendar = Calendar.getInstance();
		long ms2 = calendar.getTimeInMillis();
		System.out.println("파일 복사 끝 >> " + ms2);
		
		System.out.println((ms2-ms1) + "ms 지났음");
		System.out.println((ms2-ms1)/1000 + "초 지났음");
	}
}
