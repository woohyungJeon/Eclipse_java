
import java.util.Scanner;

public class Practice1 {
   public static void main(String[] args) {
	   Compute[] comp = new Compute[3];   //객체 배열
	   	
	   // 객체 생성, 입력, 연산
	   for(int i=0; i<comp.length; i++) {
		   comp[i] = new Compute();
		   comp[i].input();
		   comp[i].getSum();
		   comp[i].getSub();
		   comp[i].getMul();
		   comp[i].getDiv();
		   System.out.println(); 	// 1줄 넘김
	   }
	   
	   // 타이틀 출력
	   comp[0].outputTitle();
	   
	   for(int i=0; i<comp.length; i++) {
		   comp[i].outputCalc();
	   }
   }
}
