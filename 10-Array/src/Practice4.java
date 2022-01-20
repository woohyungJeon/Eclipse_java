import java.util.Scanner;

public class Practice4 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // 선언      
      boolean[] park = new boolean[5]; 	// 주차 상태 저장
      
      while(true) {
    	  int num = 0;						// 메뉴 번호 저장
          int position = 0; 				// 위치 저장
          
    	  System.out.println("주차관리 프로그램");
          System.out.println("*************");
          System.out.println("1. 입차");
          System.out.println("2. 출차");
          System.out.println("3. 리스트");
          System.out.println("4. 종료");
          System.out.println("*************");
          System.out.print("메뉴 : ");
          num = sc.nextInt();
          System.out.println();  // 1줄 넘김
          
          if(num == 4) {
        	  System.out.println("종료합니다.");
        	  break;
          }
          
          switch(num) {
          case 1:	// 입차
        	  do {
        		  System.out.print("위치 입력 [1~5] : ");
        		  position = sc.nextInt();
        	  } while(position<=0 || position>5);  // 1~5 사이의 숫자일 경우만 탈출함
        	  
        	  if(park[position-1]) {	// 주차중
        		  System.out.printf("%d위치에 입차 / 이미 주차되었습니다.\n", position);
        	  } else {					// 비어있음
        		  System.out.printf("%d위치에 입차 / 주차되었습니다.\n", position);
        		  park[position-1] = true;
        	  }
        	  break;
          case 2:	// 출차
        	  do {
        		  System.out.print("위치 입력 [1~5] : ");
        		  position = sc.nextInt();
        	  } while(position<=0 || position>5);  // 1~5 사이의 숫자일 경우만 탈출함
        	  
        	  if(park[position-1]) {	// 주차중
        		  System.out.printf("%d위치에 출차 / 출차되었습니다.\n", position);
        		  park[position-1] = false;
        	  } else {					// 비어있음
        		  System.out.printf("%d위치에 출차 / 주차되어 있지않습니다.\n", position);
        	  }
        	  break;
          case 3:	// 리스트
        	  System.out.println("--- 리스트 ---");
        	  for(int i=0; i<park.length; i++) {
        		  System.out.println((i+1) + "위치 : " + park[i]);
        	  }
        	  break;
          }
          
          System.out.println();   // 1줄 넘김
      }  
   }
}