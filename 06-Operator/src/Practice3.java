import java.util.Scanner;

public class Practice3 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      //1.����
      // x = ����
      char x;
      char result; 
      
      //2.�Է�
      System.out.print("���� �Է�: ");
      x = sc.next().charAt(0);
      //System.out.println(x + " : " + (int)x);
      
      //3.����      
      result = (x>='A' && x<='Z')? (char)(x+32):  
    	  	   (x>='a' && x<='z')? (char)(x-32): '0';
            
      //4.���
      System.out.println((result != '0')? (x + " -> " + result) : "���ڰ� �ƴմϴ�.");
   }
}