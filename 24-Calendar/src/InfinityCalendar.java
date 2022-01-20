import java.util.Calendar;
import java.util.Scanner;

public class InfinityCalendar {
	// 선언
	Scanner sc = new Scanner(System.in);
	Calendar calendar = Calendar.getInstance();
	int year;		// 년
	int month;		// 월
	int dayNum;		// 요일수
	// 입력
	void input() {
		do {
			System.out.print("년도? ");
			year = sc.nextInt();
		} while(year < 1);
		
		do {
			System.out.print("월? ");
			month = sc.nextInt();
		} while(month < 1 || month > 12);
	}
	// 연산
	void setDate() {
		// 입력받은 년월과 1일로 설정
		calendar.set(year, month-1, 1);
		dayNum = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일수 : " + dayNum);
	}
	
	// 제목 출력
	void outputTitle() {
		System.out.println();
		System.out.printf("%s %2s%2s %2s%2s %2s%2s\n", 
						"일", "월", "화", "수", "목", "금", "토");
		System.out.println("----------------------");
	}
	// 달력 출력
	void output() {
		// 요일수 만큼 커서 옮기기
		for(int i=1; i<dayNum; i++) {
			System.out.print("   ");  // 공백문자3칸  
		}
		// 이번달의 총일수 구하기
		int daysOfMonth = calendar.getActualMaximum(Calendar.DATE);
		// 날짜 출력
		for(int i=1; i<=daysOfMonth; i++) {
			System.out.printf("%2d ", i);
			dayNum++;
			// 요일수값이 일요일인지 확인, 1줄넘김을 해야함
			if(dayNum % 7 == 1) {
				System.out.println();  // 1줄 넘김
			}
		}
	}
}





