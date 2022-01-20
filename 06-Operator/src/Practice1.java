import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   // 선언
	   String name = "";// 이름
	   int base = 0;	// 기본급
	   int tax = 0;		// 세금
	   int salary =  0;	// 월급
	   
	   // 입력
	   System.out.print("이름 입력 : ");
	   name = sc.next();
	   System.out.print("기본급 입력 : ");
	   base = sc.nextInt();
	   
	   // 연산
	   tax = (int)(base * 0.033);
	   salary = base - tax;
	   
	   // 출력
	   System.out.printf("*** %s의 월급 ***\n", name);
	   System.out.println("기본급 : " + base + "원");
	   System.out.println("세금   : " + tax + "원");
	   System.out.println("월급   : " + salary + "원");
	}
}