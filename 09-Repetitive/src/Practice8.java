import java.util.Scanner;

public class Practice8 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // ����
      int num;
      do {
         System.out.println("***************");
         System.out.println("1.�Է�");
         System.out.println("2.�˻�");
         System.out.println("3.����");
         System.out.println("4.����");
         System.out.println("***************");
         System.out.print("��ȣ ���� :");
         num = sc.nextInt(); 
         
         System.out.println();  // ���� �ѱ�
         
         if(num==4) {
        	 System.out.println("���α׷��� �����մϴ�.");
        	 break;
         }
         
         switch(num){
         case 1:
            System.out.println("�Է��� �����Ͽ����ϴ�. "); break;
         case 2:
            System.out.println("�˻��� �����Ͽ����ϴ�. ");break;
         case 3:
            System.out.println("������ �����Ͽ����ϴ�. ");break;
         }    
         
         System.out.println();  // ���� �ѱ�
      }while(true); 
   }
}