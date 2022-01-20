
public class Exam2 {
	public static void main(String[] args) {
		System.out.println("-- 2010년 --");
		BankStatic.setRate(2.5);	// 이율 수정
		BankStatic hong = new BankStatic("홍길동", 10000);
		hong.print_account();
		System.out.println();
				
		System.out.println("-- 2015년 --");
		BankStatic.setRate(4.5);	// 이율 수정
		BankStatic kim = new BankStatic("김철수", 20000);
		hong.print_account();
		kim.print_account();
		System.out.println();
		
		System.out.println("-- 2020년 --");
		BankStatic.setRate(5.5);	// 이율 수정
		BankStatic lee = new BankStatic("이영희", 30000);
		hong.print_account();
		kim.print_account();
		lee.print_account();
	}
}
