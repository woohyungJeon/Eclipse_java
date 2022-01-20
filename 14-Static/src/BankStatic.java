
public class BankStatic {
	private String name;	// 고객명
	private double balance;	// 잔고
	private static double rate;	// 이율
	
	// 생성자
	public BankStatic(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	// 출력
	public void print_account() {
		System.out.println(name + "\t" + balance + "원\t" + BankStatic.rate + "%");
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
