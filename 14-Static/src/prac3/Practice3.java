package prac3;

import java.util.Scanner;

public class Practice3 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Controller controller = new Controller();
      int num = 0;
      
      while(true) {
         System.out.println("1. �Է�");
         System.out.println("2. ���");
         System.out.println("3. ����");
         System.out.println("--------");
         System.out.print("��ȣ �Է� : ");
         num = sc.nextInt();
         System.out.println();
         
         switch(num) {
         case 1:
            controller.input();
            break;
         case 2:
            controller.output();
            break;
         case 3:
            controller.end_pgm();
         }
         System.out.println();
      }
   }
}