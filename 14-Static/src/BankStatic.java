
public class BankStatic {
	private String name;	// ����
	private double balance;	// �ܰ�
	private static double rate;	// ����
	
	// ������
	public BankStatic(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	// ���
	public void print_account() {
		System.out.println(name + "\t" + balance + "��\t" + BankStatic.rate + "%");
	}
	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getRate() {
		return BankStatic.rate;
	}

	public static void setRate(double rate) {
		BankStatic.rate = rate;
	}	
}
