import java.util.Scanner;

public class Practice6 {

   public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      // ����
      double a,b;
      char su;
      // �Է�
      System.out.print("ù ��° �� : ");
      a = sc.nextDouble();
      System.out.print("�� ��° �� : ");
      b = sc.nextDouble();
      System.out.print("������ : ");
      su = sc.next().charAt(0);
      // ����, ���
      switch(su) {
      case '+': System.out.printf("%s %s %s = %s", a, su, b, (a+b)); break;
      case '-': System.out.printf("%s %s %s = %s", a, su, b, (a-b)); break;
      case '*': System.out.printf("%s %s %s = %s", a, su, b, (a*b)); break;
      case '/': System.out.printf("%s %s %s = %s", a, su, b, (a/b)); break;
      default: System.out.println("������ �Է��� �߸��Ǿ����ϴ�. + - * / �Է�");
      }
      
   }

}