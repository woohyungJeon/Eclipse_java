import java.util.Scanner;
public class Practice8 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // ����
      int mid, fin, rep, att;
      double tot;
      String grade = "";
      String eval = "";
      // �Է�
      System.out.print("�߰���縦 �Է��ϼ��� : ");
      mid = sc.nextInt();
      
      System.out.print("�⸻��縦 �Է��ϼ��� : ");
      fin = sc.nextInt();
      
      System.out.print("���������� �Է��ϼ��� : ");
      rep = sc.nextInt();
      
      System.out.print("�⼮������ �Է��ϼ��� : ");
      att = sc.nextInt();
      // ����
      tot = ((mid + fin) / 2 * 0.6) + (rep * 0.2) + (att * 0.2);      
      
      switch((int)(tot/10)) {
      case 10:
      case 9: grade = "A"; break;
      case 8: grade = "B"; break;
      case 7: grade = "C"; break;
      case 6: grade = "D"; break;
      default: grade = "F";      
      }
      
      switch(grade) {
      case "A":
      case "B": eval = "Excellent"; break;
      case "C":
      case "D": eval = "Good"; break;
      case "F": eval = "Poor";	  
      }
      // ���
      System.out.printf("���� = %.2f\n", tot);
      System.out.println("���� = " + grade);
      System.out.println("�� = " + eval);
   }
}

/*
public class Practice8 {
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      // ����
	      int mid, fin, rep, att;
	      double tot;
	      String grade = "";
	      String eval = "";
	      // �Է�
	      System.out.print("�߰���縦 �Է��ϼ��� : ");
	      mid = sc.nextInt();
	      
	      System.out.print("�⸻��縦 �Է��ϼ��� : ");
	      fin = sc.nextInt();
	      
	      System.out.print("���������� �Է��ϼ��� : ");
	      rep = sc.nextInt();
	      
	      System.out.print("�⼮������ �Է��ϼ��� : ");
	      att = sc.nextInt();
	      // ����
	      tot = ((mid + fin) / 2 * 0.6) + (rep * 0.2) + (att * 0.2);      
	      
	      switch((int)(tot/10)) {
	      case 10:
	      case 9:
	         grade = "A"; eval = "Excellent";
	         break;
	      case 8:
	         grade = "B"; eval = "Excellent";
	         break;
	      case 7:
	         grade = "C"; eval = "Good";
	         break;
	      case 6:
	         grade = "D"; eval = "Good";
	         break;
	      default:
	         grade = "F"; eval = "Poor";
	      
	      }
	      // ���
	      System.out.printf("���� = %.2f\n", tot);
	      System.out.println("���� = " + grade);
	      System.out.println("�� = " + eval);
	   }

}
*/