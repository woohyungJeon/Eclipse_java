
import java.util.Scanner;

public class Practice7 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // 선언, 입력
      System.out.print("국어점수 입력 :");
      int kor = sc.nextInt();
      
      System.out.print("영어점수 입력 :");
      int eng = sc.nextInt();
      // 선언, 연산
      int tot = kor+eng;
      double ave = (double)tot/2;
      String grade="";
            
      switch((int)(ave/10)) {
      case 10:
      case 9: grade="A"; break;
      case 8: grade="B"; break;
      case 7: grade="C"; break;
      case 6: grade="D"; break;
      default: grade="F";
      }
      
      // 출력
      System.out.println("총점 =" + tot);
      System.out.println("평균 =" + ave);
      System.out.println("학점 =" + grade);
   }
}

      
      