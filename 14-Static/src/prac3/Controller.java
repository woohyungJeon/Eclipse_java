package prac3;

import java.util.Scanner;

public class Controller {
   Scanner sc = new Scanner(System.in);
   EmpVO[] emp = new EmpVO[5];
   int a = 0;	// 직원수
   
   void input () {
      if(a < 5) {
         emp[a] = new EmpVO();
         System.out.print("이름 : ");
         emp[a].setName(sc.next());
         System.out.print("연봉 : ");
         emp[a].setSalary(sc.nextInt());
         System.out.print("부서 : ");
         emp[a].setDepartment(sc.next());
         
         a++;
      } else {
         System.out.println("입력가능한 인원은 5명까지입니다.");
      }      
   }
   
   void output () {
      for(int i=0; i<a; i++) {
            System.out.println(emp[i].toString());
      }
   }
   
   void end_pgm() {
      System.out.println("프로그램 종료");
      System.exit(0); 
   }   
}
