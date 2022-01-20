import java.util.Scanner;

public class Practice6 {

   public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      // 선언
      double a,b;
      char su;
      // 입력
      System.out.print("첫 번째 수 : ");
      a = sc.nextDouble();
      System.out.print("두 번째 수 : ");
      b = sc.nextDouble();
      System.out.print("연산자 : ");
      su = sc.next().charAt(0);
      // 연산, 출력
      switch(su) {
      case '+': System.out.printf("%s %s %s = %s", a, su, b, (a+b)); break;
      case '-': System.out.printf("%s %s %s = %s", a, su, b, (a-b)); break;
      case '*': System.out.printf("%s %s %s = %s", a, su, b, (a*b)); break;
      case '/': System.out.printf("%s %s %s = %s", a, su, b, (a/b)); break;
      default: System.out.println("연산자 입력이 잘못되었습니다. + - * / 입력");
      }
      
   }

}