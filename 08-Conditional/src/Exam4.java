import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jumsu=0;
		char grade=0;
		
		System.out.print("점수 입력 : ");
		jumsu = sc.nextInt();
		
		switch(jumsu/10) {
		case 10:
		case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		default: grade='F';
		}
		
		System.out.println(jumsu + "점, " + grade + "등급");
	}
}
