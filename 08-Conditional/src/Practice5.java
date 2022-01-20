import java.util.Scanner;

public class Practice5 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("중간고사 점수를 입력하시오 : ");
      int middle = sc.nextInt();
      System.out.print("기말고사 점수를 입력하시오 : ");
      int final1 = sc.nextInt();
      System.out.print("과제 점수를 입력하시오 : ");
      int hw = sc.nextInt();
      System.out.print("출석 점수를 입력하시오 : ");
      int check = sc.nextInt();
      
      double a = (double)(middle + final1)/2;
      double b = (a * 0.6) + (hw * 0.2) + (check * 0.2);      
      System.out.printf("성적 = %.2f\n", b);
      
      char grade = 0;
      
      if (b>=90) grade = 'A';
      else if (b>=80) grade = 'B';
      else if (b>=70) grade = 'C';
      else if (b>=60) grade = 'D';
      else grade = 'F';      
      System.out.println("학점 = " + grade);
      
      if (grade=='A' || grade=='B') 
    	  System.out.println("평가 = excellent");
      else if (grade=='C' || grade=='D') 
    	  System.out.println("평가 = good");
      else 
    	  System.out.println("평가 = poor");      
   }
}