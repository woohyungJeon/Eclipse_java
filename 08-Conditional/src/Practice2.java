import java.util.Scanner;

public class Practice2 {
   public static void main(String[] args) {      
      Scanner sc = new Scanner(System.in);
      // 선언, 입력
      System.out.print("국어 : ");
      int kor = sc.nextInt();
      System.out.print("영어 : ");
      int eng = sc.nextInt();
      System.out.print("수학 : ");
      int mat = sc.nextInt();
      
      // 연산, 출력
      int avg = (kor + eng + mat)/3;
      System.out.println("평균 : " + avg);
      
      if(avg>=60 && kor>=40 && eng>=40 && mat>=40) {
         System.out.println("합격입니다.");
      } 
      else { 
         System.out.println("불합격입니다.");
      }
   }
}