import java.util.Scanner;

public class Practice3 {
   public static void main(String[] args) {
      
      Scanner in = new Scanner(System.in);
      // 선언, 입력
      System.out.print("국어점수 입력 : ");
      int kor = in.nextInt();      // 국어점수 선언 및 입력
      System.out.print("영어점수 입력 : ");
      int eng = in.nextInt();      // 영어점수 선언 및 입력
      // 연산
      int total = kor + eng;         // 총점 연산
      double avg = (double)total / 2;   // 평균 연산
      
      // 출력
      System.out.printf("총점 = %d\n", total);
      System.out.printf("평균 = %.1f\n", avg);
      
      // 연산, 출력
      if(avg >= 90)   // 90점 이상
         System.out.println("학점 = A");
      else if(avg >= 80)   // 80점 이상
         System.out.println("학점 = B");
      else if(avg >= 70)   // 70점 이상
         System.out.println("학점 = C");
      else if(avg >= 60)   // 60점 이상
         System.out.println("학점 = D");
      else            // 60점 미만일 경우
         System.out.println("학점 = F");
   }
}