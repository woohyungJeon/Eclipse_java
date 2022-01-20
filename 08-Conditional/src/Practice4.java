import java.util.Scanner;

public class Practice4 {
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("주민번호 7번째 자리를 입력하세요 : ");      
      int num = sc.nextInt();
      
      if(num == 1) {
         System.out.println("당신은 1900년대생 남성이십니다.");
      } else if(num == 2) {
         System.out.println("당신은 1900년대생 여성이십니다.");
      } else if(num == 3) {
         System.out.println("당신은 2000년대생 남성이십니다.");
      } else if(num == 4) {
         System.out.println("당신은 2000년대생 여성이십니다.");
      } else {
    	  System.out.println("숫자를 잘못입력하였습니다. 1~4 입력");
      }
      
   }

}
