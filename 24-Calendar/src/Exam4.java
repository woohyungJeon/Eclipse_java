import java.util.Calendar;

public class Exam4 {
	public static void main(String[] args) {
		// 만년달력은 그달의 1일이 무슨 요일인지, 그달이 몇일인지를 알면된다.
		Calendar calendar = Calendar.getInstance();
		
		// 요일수 : 요일에 대한 인덱스값 (일:1 ~토:7)
		int dayNum = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일수 : " + dayNum);
		System.out.println("-----------------");
		
		// 이번달은 몇일까지 있는가?
		int day_count = calendar.getActualMaximum(Calendar.DATE);
		System.out.println("이달의 일수 : " + day_count);
		System.out.println("-----------------");
		
		// 이번달 1일의 요일수 구하기
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		dayNum = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일수 : " + dayNum);
		System.out.println("-----------------");
		
		// 요일 출력
		String[] days = {"일","월", "화", "수","목","금","토"};
		System.out.println("1일은 " + days[dayNum-1] + "요일입니다.");
	}
}
