import java.util.Scanner;

public class Practice3 {
   
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      // ����
      int[] scrArr = new int[5];
      int[] rnkArr = new int[5];
      int rank;
      // �Է�
      for (int i=0; i <scrArr.length; i++) {
         System.out.print((i+1) + "�� ���� �Է� : ");
         scrArr[i] = sc.nextInt();
         rnkArr[i] = 1;
      }
      // ����
      for (int i=0; i<scrArr.length; i++) { 	// ����
         for (int j=0; j<scrArr.length; j++) {	// ��
            if (scrArr[i] < scrArr[j]) {
               rnkArr[i]++;
            }            
         }
      }
      // ���
      System.out.println("\n*** ��� ***");

      for (int i=0; i<scrArr.length; i++) {
         System.out.println(scrArr[i] + "�� : " + rnkArr[i] + "��");
      }

   }

}

/*
public class Practice3 {
	   
	   public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);
	      // ����
	      int[] scrArr = new int[5];
	      int[] rnkArr = new int[5];
	      int rank;
	      // �Է�
	      for (int i=0; i <scrArr.length; i++) {
	         System.out.print((i+1) + "�� ���� �Է� : ");
	         scrArr[i] = sc.nextInt();
	      }
	      // ����
	      for (int i=0; i<scrArr.length; i++) { 	// ����
	         rank = 1;
	         for (int j=0; j<scrArr.length; j++) {	// ��
	            if (scrArr[i] < scrArr[j]) {
	               rank++;
	            }
	            rnkArr[i] = rank;
	         }
	      }
	      // ���
	      System.out.println("\n*** ��� ***");

	      for (int i=0; i<scrArr.length; i++) {
	         System.out.println(scrArr[i] + "�� : " + rnkArr[i] + "��");
	      }

	   }

	}
*/