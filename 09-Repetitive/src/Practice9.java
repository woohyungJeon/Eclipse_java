
import java.util.Scanner;

public class Practice9 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // ���� a=��ȣ, b=�ݾ�, c=�ܰ�
      int a = 0;
      int b = 0;
      int c = 0;
      // �Է�,����,���
      do {
         System.out.println("1.���� 2.��� 3.�ܰ� 4.����");
         System.out.print("��ȣ ����:");
         a = sc.nextInt();
         
         if (a == 4) {
            System.out.println("���α׷��� �����մϴ�.");
            break;
         }

         if (a == 1) {
            System.out.print("���ݾ��� �Է����ּ���:");
            b = sc.nextInt();
            c += b;
         } else if (a == 2) {
            System.out.print("��ݾ��� �Է����ּ���:");
            b = sc.nextInt();
            c -= b;
         } else if (a == 3) {
            System.out.println("�ܰ��: "+ c);
         } else {
            System.out.println("�߸��Է��ϼ̽��ϴ�. 1~4 �Է�");
         }
         System.out.println();
      } while (true);
   }
}
