import java.util.Scanner;

public class Practice2 {
   public static void main(String[] args) {      
      Scanner sc = new Scanner(System.in);
      // ����, �Է�
      System.out.print("���� : ");
      int kor = sc.nextInt();
      System.out.print("���� : ");
      int eng = sc.nextInt();
      System.out.print("���� : ");
      int mat = sc.nextInt();
      
      // ����, ���
      int avg = (kor + eng + mat)/3;
      System.out.println("��� : " + avg);
      
      if(avg>=60 && kor>=40 && eng>=40 && mat>=40) {
         System.out.println("�հ��Դϴ�.");
      } 
      else { 
         System.out.println("���հ��Դϴ�.");
      }
   }
}