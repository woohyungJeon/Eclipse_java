package prac1;

public class Pyramid extends DrawData {
   @Override
   void draw() {
      for(int i=0; i<height; i++) {			// ��
         for(int j=height-1; j>i; j--) {	// ���鹮�� ���
            System.out.print(" ");
         }
         for(int j=0; j<(2*i+1); j++) {		// ������ ���
            System.out.print(outchar);   
         }
         System.out.println();
      }
   }
}