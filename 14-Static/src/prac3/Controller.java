package prac3;

import java.util.Scanner;

public class Controller {
   Scanner sc = new Scanner(System.in);
   EmpVO[] emp = new EmpVO[5];
   int a = 0;	// ������
   
   void input () {
      if(a < 5) {
         emp[a] = new EmpVO();
         System.out.print("�̸� : ");
         emp[a].setName(sc.next());
         System.out.print("���� : ");
         emp[a].setSalary(sc.nextInt());
         System.out.print("�μ� : ");
         emp[a].setDepartment(sc.next());
         
         a++;
      } else {
         System.out.println("�Է°����� �ο��� 5������Դϴ�.");
      }      
   }
   
   void output () {
      for(int i=0; i<a; i++) {
            System.out.println(emp[i].toString());
      }
   }
   
   void end_pgm() {
      System.out.println("���α׷� ����");
      System.exit(0); 
   }   
}
