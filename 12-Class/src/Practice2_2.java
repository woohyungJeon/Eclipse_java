import java.util.Scanner;

class Gugudan{
   Scanner sc = new Scanner(System.in);
   int start;
   int end;

   void setGugudan(int s, int e) {
      System.out.print("시작단 : ");
      start = sc.nextInt();
      System.out.print("끝단 : ");
      end = sc.nextInt();
   }
   
   void dispGugudan() {
      for(int i = start; i<=end; i++) {
         for(int j=1; j<10; j++) {
            System.out.printf("%d*%d=%d\n",i,j,(i*j));
         }
      }
   }
}
public class Practice2_2 {
   public static void main(String[] args) {
      Gugudan gl = new Gugudan();
       
      gl.setGugudan(gl.start, gl.end);
      gl.dispGugudan();
      
      
   }
}