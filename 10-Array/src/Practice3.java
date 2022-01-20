import java.util.Scanner;

public class Practice3 {
   
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      // 선언
      int[] scrArr = new int[5];
      int[] rnkArr = new int[5];
      int rank;
      // 입력
      for (int i=0; i <scrArr.length; i++) {
         System.out.print((i+1) + "번 점수 입력 : ");
         scrArr[i] = sc.nextInt();
         rnkArr[i] = 1;
      }
      // 연산
      for (int i=0; i<scrArr.length; i++) { 	// 기준
         for (int j=0; j<scrArr.length; j++) {	// 비교
            if (scrArr[i] < scrArr[j]) {
               rnkArr[i]++;
            }            
         }
      }
      // 출력
      System.out.println("\n*** 결과 ***");

      for (int i=0; i<scrArr.length; i++) {
         System.out.println(scrArr[i] + "점 : " + rnkArr[i] + "등");
      }

   }

}

/*
public class Practice3 {
	   
	   public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);
	      // 선언
	      int[] scrArr = new int[5];
	      int[] rnkArr = new int[5];
	      int rank;
	      // 입력
	      for (int i=0; i <scrArr.length; i++) {
	         System.out.print((i+1) + "번 점수 입력 : ");
	         scrArr[i] = sc.nextInt();
	      }
	      // 연산
	      for (int i=0; i<scrArr.length; i++) { 	// 기준
	         rank = 1;
	         for (int j=0; j<scrArr.length; j++) {	// 비교
	            if (scrArr[i] < scrArr[j]) {
	               rank++;
	            }
	            rnkArr[i] = rank;
	         }
	      }
	      // 출력
	      System.out.println("\n*** 결과 ***");

	      for (int i=0; i<scrArr.length; i++) {
	         System.out.println(scrArr[i] + "점 : " + rnkArr[i] + "등");
	      }

	   }

	}
*/