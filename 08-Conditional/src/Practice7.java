
import java.util.Scanner;

public class Practice7 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // ����, �Է�
      System.out.print("�������� �Է� :");
      int kor = sc.nextInt();
      
      System.out.print("�������� �Է� :");
      int eng = sc.nextInt();
      // ����, ����
      int tot = kor+eng;
      double ave = (double)tot/2;
      String grade="";
            
      switch((int)(ave/10)) {
      case 10:
      case 9: grade="A"; break;
      case 8: grade="B"; break;
      case 7: grade="C"; break;
      case 6: grade="D"; break;
      default: grade="F";
      }
      
      // ���
      System.out.println("���� =" + tot);
      System.out.println("��� =" + ave);
      System.out.println("���� =" + grade);
   }
}

      
      