import java.util.Scanner;

public class Practice3 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      //1.선언
      // x = 문자
      char x;
      char result; 
      
      //2.입력
      System.out.print("문자 입력: ");
      x = sc.next().charAt(0);
      //System.out.println(x + " : " + (int)x);
      
      //3.연산      
      result = (x>='A' && x<='Z')? (char)(x+32):  
    	  	   (x>='a' && x<='z')? (char)(x-32): '0';
            
      //4.출력
      System.out.println((result != '0')? (x + " -> " + result) : "문자가 아닙니다.");
   }
}