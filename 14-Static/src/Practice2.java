
public class Practice2 {
   public static void main(String[] args) {
      Score2[] score = new Score2[2];

      for (int i = 0; i < score.length; i++) {
         score[i] = new Score2();
         score[i].input();         
         System.out.println(); // 1줄 넘김
      }
      // 타이틀 출력
      score[0].outputTitle();
      
      // 출력
      for (int i = 0; i < score.length; i++) {
         score[i].outputCalc();
      }
   }
}
