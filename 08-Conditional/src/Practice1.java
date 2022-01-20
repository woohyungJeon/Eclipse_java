import java.util.Scanner;

public class Practice1 {
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
      //선언
      char x;
      
      //입력
      System.out.print("문자 입력 : ");
      x = sc.next().charAt(0);
      
      // 연산 및 출력
      if(x>='A' && x<='Z') {  // 대문자인지 검사
         System.out.println(x + " -> " + (char)(x+32));
      } else {
         if(x>='a' && x<='z') {
        	 System.out.println(x + " -> " + (char)(x-32));
         } else {
        	System.out.println("문자가 아닙니다. 문자를 입력해주세요"); 
         }
      }
   }
}