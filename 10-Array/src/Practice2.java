import java.util.Scanner;

public class Practice2 {
   public static void main(String[] args) {
      
      Scanner in = new Scanner(System.in);
      // 선언, 입력
      int[] days_number = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};   // 각 월에 맞는 일수로 초기화
      
      System.out.println("*** 일수 구하기 ***");
      System.out.print("년 : ");
      int year = in.nextInt();   // 년 선언 및 입력
      System.out.print("월 : ");
      int month = in.nextInt();   // 월 선언 및 입력
      System.out.print("일 : ");
      int days = in.nextInt();   // 일 선언 및 입력
      
      int total_days = 0;         // 총 일수 선언
      
      // 연산
      if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)   // 입력 연도가 윤년일경우
         days_number[2] = 29;   // 2월에 해당하는 인덱스 값을 29로 변경
      
      for(int i=0; i<month; i++)   // 반복문
         total_days += days_number[i];   // 연산
      
      total_days += days;         // 총 일수에 일을 더해준다
      
      // 출력
      System.out.printf("1월 1일 부터 %d월 %d일까지는 %d일 입니다", month, days, total_days);
   }
}