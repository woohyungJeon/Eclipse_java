
public class Exam1 {
	public static void main(String[] args) {
		System.out.println("-- 2010�� --");
		Bank hong = new Bank("ȫ�浿", 10000, 2.5);
		hong.print_account();
		System.out.println();
		
		System.out.println("-- 2015�� --");
		Bank kim = new Bank("��ö��", 20000, 4.5);
		hong.print_account();
		kim.print_account();
		System.out.println();
		
		System.out.println("-- 2020�� --");
		Bank lee = new Bank("�̿���", 30000, 5.5);
		hong.print_account();
		kim.print_account();
		lee.print_account();
	}
}
