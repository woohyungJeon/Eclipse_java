import java.util.Scanner;

public class Practice2 {
   public static void main(String[] args) {
      
      Scanner in = new Scanner(System.in);
      // ����, �Է�
      int[] days_number = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};   // �� ���� �´� �ϼ��� �ʱ�ȭ
      
      System.out.println("*** �ϼ� ���ϱ� ***");
      System.out.print("�� : ");
      int year = in.nextInt();   // �� ���� �� �Է�
      System.out.print("�� : ");
      int month = in.nextInt();   // �� ���� �� �Է�
      System.out.print("�� : ");
      int days = in.nextInt();   // �� ���� �� �Է�
      
      int total_days = 0;         // �� �ϼ� ����
      
      // ����
      if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)   // �Է� ������ �����ϰ��
         days_number[2] = 29;   // 2���� �ش��ϴ� �ε��� ���� 29�� ����
      
      for(int i=0; i<month; i++)   // �ݺ���
         total_days += days_number[i];   // ����
      
      total_days += days;         // �� �ϼ��� ���� �����ش�
      
      // ���
      System.out.printf("1�� 1�� ���� %d�� %d�ϱ����� %d�� �Դϴ�", month, days, total_days);
   }
}