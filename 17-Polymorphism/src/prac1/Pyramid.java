package prac1;

public class Pyramid extends DrawData {
   @Override
   void draw() {
      for(int i=0; i<height; i++) {			// 층
         for(int j=height-1; j>i; j--) {	// 공백문자 출력
            System.out.print(" ");
         }
         for(int j=0; j<(2*i+1); j++) {		// 별문자 출력
            System.out.print(outchar);   
         }
         System.out.println();
      }
   }
}