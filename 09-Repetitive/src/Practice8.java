import java.util.Scanner;

public class Practice8 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // 선언
      int num;
      do {
         System.out.println("***************");
         System.out.println("1.입력");
         System.out.println("2.검색");
         System.out.println("3.삭제");
         System.out.println("4.종료");
         System.out.println("***************");
         System.out.print("번호 선택 :");
         num = sc.nextInt(); 
         
         System.out.println();  // 한줄 넘김
         
         if(num==4) {
        	 System.out.println("프로그램을 종료합니다.");
        	 break;
         }
         
         switch(num){
         case 1:
            System.out.println("입력을 선택하였습니다. "); break;
         case 2:
            System.out.println("검색을 선택하였습니다. ");break;
         case 3:
            System.out.println("삭제을 선택하였습니다. ");break;
         }    
         
         System.out.println();  // 한줄 넘김
      }while(true); 
   }
}