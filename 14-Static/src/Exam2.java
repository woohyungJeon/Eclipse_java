
public class Exam2 {
	public static void main(String[] args) {
		System.out.println("-- 2010�� --");
		BankStatic.setRate(2.5);	// ���� ����
		BankStatic hong = new BankStatic("ȫ�浿", 10000);
		hong.print_account();
		System.out.println();
				
		System.out.println("-- 2015�� --");
		BankStatic.setRate(4.5);	// ���� ����
		BankStatic kim = new BankStatic("��ö��", 20000);
		hong.print_account();
		kim.print_account();
		System.out.println();
		
		System.out.println("-- 2020�� --");
		BankStatic.setRate(5.5);	// ���� ����
		BankStatic lee = new BankStatic("�̿���", 30000);
		hong.print_account();
		kim.print_account();
		lee.print_account();
	}
}
