
import java.util.Scanner;

public class Practice1 {
   public static void main(String[] args) {
	   Compute[] comp = new Compute[3];   //��ü �迭
	   	
	   // ��ü ����, �Է�, ����
	   for(int i=0; i<comp.length; i++) {
		   comp[i] = new Compute();
		   comp[i].input();
		   comp[i].getSum();
		   comp[i].getSub();
		   comp[i].getMul();
		   comp[i].getDiv();
		   System.out.println(); 	// 1�� �ѱ�
	   }
	   
	   // Ÿ��Ʋ ���
	   comp[0].outputTitle();
	   
	   for(int i=0; i<comp.length; i++) {
		   comp[i].outputCalc();
	   }
   }
}
