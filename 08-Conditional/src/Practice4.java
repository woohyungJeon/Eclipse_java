import java.util.Scanner;

public class Practice4 {
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("�ֹι�ȣ 7��° �ڸ��� �Է��ϼ��� : ");      
      int num = sc.nextInt();
      
      if(num == 1) {
         System.out.println("����� 1900���� �����̽ʴϴ�.");
      } else if(num == 2) {
         System.out.println("����� 1900���� �����̽ʴϴ�.");
      } else if(num == 3) {
         System.out.println("����� 2000���� �����̽ʴϴ�.");
      } else if(num == 4) {
         System.out.println("����� 2000���� �����̽ʴϴ�.");
      } else {
    	  System.out.println("���ڸ� �߸��Է��Ͽ����ϴ�. 1~4 �Է�");
      }
      
   }

}
