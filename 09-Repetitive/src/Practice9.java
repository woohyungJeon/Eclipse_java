
import java.util.Scanner;

public class Practice9 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // 선언 a=번호, b=금액, c=잔고
      int a = 0;
      int b = 0;
      int c = 0;
      // 입력,연산,출력
      do {
         System.out.println("1.예금 2.출금 3.잔고 4.종료");
         System.out.print("번호 선택:");
         a = sc.nextInt();
         
         if (a == 4) {
            System.out.println("프로그램을 종료합니다.");
            break;
         }

         if (a == 1) {
            System.out.print("예금액을 입력해주세요:");
            b = sc.nextInt();
            c += b;
         } else if (a == 2) {
            System.out.print("출금액을 입력해주세요:");
            b = sc.nextInt();
            c -= b;
         } else if (a == 3) {
            System.out.println("잔고액: "+ c);
         } else {
            System.out.println("잘못입력하셨습니다. 1~4 입력");
         }
         System.out.println();
      } while (true);
   }
}
