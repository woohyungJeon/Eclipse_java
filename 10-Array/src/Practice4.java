import java.util.Scanner;

public class Practice4 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // ����      
      boolean[] park = new boolean[5]; 	// ���� ���� ����
      
      while(true) {
    	  int num = 0;						// �޴� ��ȣ ����
          int position = 0; 				// ��ġ ����
          
    	  System.out.println("�������� ���α׷�");
          System.out.println("*************");
          System.out.println("1. ����");
          System.out.println("2. ����");
          System.out.println("3. ����Ʈ");
          System.out.println("4. ����");
          System.out.println("*************");
          System.out.print("�޴� : ");
          num = sc.nextInt();
          System.out.println();  // 1�� �ѱ�
          
          if(num == 4) {
        	  System.out.println("�����մϴ�.");
        	  break;
          }
          
          switch(num) {
          case 1:	// ����
        	  do {
        		  System.out.print("��ġ �Է� [1~5] : ");
        		  position = sc.nextInt();
        	  } while(position<=0 || position>5);  // 1~5 ������ ������ ��츸 Ż����
        	  
        	  if(park[position-1]) {	// ������
        		  System.out.printf("%d��ġ�� ���� / �̹� �����Ǿ����ϴ�.\n", position);
        	  } else {					// �������
        		  System.out.printf("%d��ġ�� ���� / �����Ǿ����ϴ�.\n", position);
        		  park[position-1] = true;
        	  }
        	  break;
          case 2:	// ����
        	  do {
        		  System.out.print("��ġ �Է� [1~5] : ");
        		  position = sc.nextInt();
        	  } while(position<=0 || position>5);  // 1~5 ������ ������ ��츸 Ż����
        	  
        	  if(park[position-1]) {	// ������
        		  System.out.printf("%d��ġ�� ���� / �����Ǿ����ϴ�.\n", position);
        		  park[position-1] = false;
        	  } else {					// �������
        		  System.out.printf("%d��ġ�� ���� / �����Ǿ� �����ʽ��ϴ�.\n", position);
        	  }
        	  break;
          case 3:	// ����Ʈ
        	  System.out.println("--- ����Ʈ ---");
        	  for(int i=0; i<park.length; i++) {
        		  System.out.println((i+1) + "��ġ : " + park[i]);
        	  }
        	  break;
          }
          
          System.out.println();   // 1�� �ѱ�
      }  
   }
}