import java.util.Scanner;

public class Practice1 {
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
      //����
      char x;
      
      //�Է�
      System.out.print("���� �Է� : ");
      x = sc.next().charAt(0);
      
      // ���� �� ���
      if(x>='A' && x<='Z') {  // �빮������ �˻�
         System.out.println(x + " -> " + (char)(x+32));
      } else {
         if(x>='a' && x<='z') {
        	 System.out.println(x + " -> " + (char)(x-32));
         } else {
        	System.out.println("���ڰ� �ƴմϴ�. ���ڸ� �Է����ּ���"); 
         }
      }
   }
}