
public class Practice2 {
   public static void main(String[] args) {
      Score2[] score = new Score2[2];

      for (int i = 0; i < score.length; i++) {
         score[i] = new Score2();
         score[i].input();         
         System.out.println(); // 1�� �ѱ�
      }
      // Ÿ��Ʋ ���
      score[0].outputTitle();
      
      // ���
      for (int i = 0; i < score.length; i++) {
         score[i].outputCalc();
      }
   }
}
