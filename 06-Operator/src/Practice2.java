import java.util.Scanner;

public class Practice2 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // ����, �Է�
      System.out.print("�ݾ� �Է� : ");
      int money = sc.nextInt();
      
      // ����, ���
      System.out.println("�ݾ� :" + money + "��");
      
      // /, % ���
      int namugy = 0;
      System.out.printf("õ�� : %d��\n", money / 1000);
      namugy = money % 1000;
      System.out.printf("��� : %d��\n", namugy / 100);
      namugy = namugy % 100;
      System.out.printf("�ʿ� : %d��\n", namugy / 10);
      namugy = namugy % 10;
      System.out.printf("�Ͽ� : %d��\n", namugy);
      
      /*// -, * , / ���
      int thousand = money / 1000;
      System.out.println("õ�� :" + thousand);
      
      System.out.print("");
      int hundred = (money - thousand*1000) / 100;
      System.out.println("��� :" + hundred);
      
      int ten = (money - (thousand*1000 + hundred*100)) /10;
      System.out.println("�ʿ� :" + ten);
      
      int one = (money - ((thousand*1000 + hundred*100 + ten*10))) /1;
      System.out.println("�Ͽ� :" + one);
      */
   }

}