import java.util.Scanner;

public class Practice3 {
   public static void main(String[] args) {
      
      Scanner in = new Scanner(System.in);
      // ����, �Է�
      System.out.print("�������� �Է� : ");
      int kor = in.nextInt();      // �������� ���� �� �Է�
      System.out.print("�������� �Է� : ");
      int eng = in.nextInt();      // �������� ���� �� �Է�
      // ����
      int total = kor + eng;         // ���� ����
      double avg = (double)total / 2;   // ��� ����
      
      // ���
      System.out.printf("���� = %d\n", total);
      System.out.printf("��� = %.1f\n", avg);
      
      // ����, ���
      if(avg >= 90)   // 90�� �̻�
         System.out.println("���� = A");
      else if(avg >= 80)   // 80�� �̻�
         System.out.println("���� = B");
      else if(avg >= 70)   // 70�� �̻�
         System.out.println("���� = C");
      else if(avg >= 60)   // 60�� �̻�
         System.out.println("���� = D");
      else            // 60�� �̸��� ���
         System.out.println("���� = F");
   }
}