import java.util.Scanner;

public class Practice2 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // 선언, 입력
      System.out.print("금액 입력 : ");
      int money = sc.nextInt();
      
      // 연산, 출력
      System.out.println("금액 :" + money + "원");
      
      // /, % 사용
      int namugy = 0;
      System.out.printf("천원 : %d장\n", money / 1000);
      namugy = money % 1000;
      System.out.printf("백원 : %d개\n", namugy / 100);
      namugy = namugy % 100;
      System.out.printf("십원 : %d개\n", namugy / 10);
      namugy = namugy % 10;
      System.out.printf("일원 : %d개\n", namugy);
      
      /*// -, * , / 사용
      int thousand = money / 1000;
      System.out.println("천원 :" + thousand);
      
      System.out.print("");
      int hundred = (money - thousand*1000) / 100;
      System.out.println("백원 :" + hundred);
      
      int ten = (money - (thousand*1000 + hundred*100)) /10;
      System.out.println("십원 :" + ten);
      
      int one = (money - ((thousand*1000 + hundred*100 + ten*10))) /1;
      System.out.println("일원 :" + one);
      */
   }

}