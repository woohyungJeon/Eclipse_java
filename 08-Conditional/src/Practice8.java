import java.util.Scanner;
public class Practice8 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // 선언
      int mid, fin, rep, att;
      double tot;
      String grade = "";
      String eval = "";
      // 입력
      System.out.print("중간고사를 입력하세요 : ");
      mid = sc.nextInt();
      
      System.out.print("기말고사를 입력하세요 : ");
      fin = sc.nextInt();
      
      System.out.print("과제점수를 입력하세요 : ");
      rep = sc.nextInt();
      
      System.out.print("출석점수를 입력하세요 : ");
      att = sc.nextInt();
      // 연산
      tot = ((mid + fin) / 2 * 0.6) + (rep * 0.2) + (att * 0.2);      
      
      switch((int)(tot/10)) {
      case 10:
      case 9: grade = "A"; break;
      case 8: grade = "B"; break;
      case 7: grade = "C"; break;
      case 6: grade = "D"; break;
      default: grade = "F";      
      }
      
      switch(grade) {
      case "A":
      case "B": eval = "Excellent"; break;
      case "C":
      case "D": eval = "Good"; break;
      case "F": eval = "Poor";	  
      }
      // 출력
      System.out.printf("성적 = %.2f\n", tot);
      System.out.println("학점 = " + grade);
      System.out.println("평가 = " + eval);
   }
}

/*
public class Practice8 {
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      // 선언
	      int mid, fin, rep, att;
	      double tot;
	      String grade = "";
	      String eval = "";
	      // 입력
	      System.out.print("중간고사를 입력하세요 : ");
	      mid = sc.nextInt();
	      
	      System.out.print("기말고사를 입력하세요 : ");
	      fin = sc.nextInt();
	      
	      System.out.print("과제점수를 입력하세요 : ");
	      rep = sc.nextInt();
	      
	      System.out.print("출석점수를 입력하세요 : ");
	      att = sc.nextInt();
	      // 연산
	      tot = ((mid + fin) / 2 * 0.6) + (rep * 0.2) + (att * 0.2);      
	      
	      switch((int)(tot/10)) {
	      case 10:
	      case 9:
	         grade = "A"; eval = "Excellent";
	         break;
	      case 8:
	         grade = "B"; eval = "Excellent";
	         break;
	      case 7:
	         grade = "C"; eval = "Good";
	         break;
	      case 6:
	         grade = "D"; eval = "Good";
	         break;
	      default:
	         grade = "F"; eval = "Poor";
	      
	      }
	      // 출력
	      System.out.printf("성적 = %.2f\n", tot);
	      System.out.println("학점 = " + grade);
	      System.out.println("평가 = " + eval);
	   }

}
*/