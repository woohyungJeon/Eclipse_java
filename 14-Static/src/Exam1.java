
public class Exam1 {
	public static void main(String[] args) {
		System.out.println("-- 2010³â --");
		Bank hong = new Bank("È«±æµ¿", 10000, 2.5);
		hong.print_account();
		System.out.println();
		
		System.out.println("-- 2015³â --");
		Bank kim = new Bank("±èÃ¶¼ö", 20000, 4.5);
		hong.print_account();
		kim.print_account();
		System.out.println();
		
		System.out.println("-- 2020³â --");
		Bank lee = new Bank("ÀÌ¿µÈñ", 30000, 5.5);
		hong.print_account();
		kim.print_account();
		lee.print_account();
	}
}
