import java.util.Scanner;

public class Practice5 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("�߰���� ������ �Է��Ͻÿ� : ");
      int middle = sc.nextInt();
      System.out.print("�⸻��� ������ �Է��Ͻÿ� : ");
      int final1 = sc.nextInt();
      System.out.print("���� ������ �Է��Ͻÿ� : ");
      int hw = sc.nextInt();
      System.out.print("�⼮ ������ �Է��Ͻÿ� : ");
      int check = sc.nextInt();
      
      double a = (double)(middle + final1)/2;
      double b = (a * 0.6) + (hw * 0.2) + (check * 0.2);      
      System.out.printf("���� = %.2f\n", b);
      
      char grade = 0;
      
      if (b>=90) grade = 'A';
      else if (b>=80) grade = 'B';
      else if (b>=70) grade = 'C';
      else if (b>=60) grade = 'D';
      else grade = 'F';      
      System.out.println("���� = " + grade);
      
      if (grade=='A' || grade=='B') 
    	  System.out.println("�� = excellent");
      else if (grade=='C' || grade=='D') 
    	  System.out.println("�� = good");
      else 
    	  System.out.println("�� = poor");      
   }
}