
public class Bank {
	private String name;	// 고객명
	private double balance;	// 잔고
	private double rate;	// 변동이율
	// 생성자
	public Bank(String name, double balance, double rate) {
		this.name = name;
		this.balance = balance;
		this.rate = rate;
	}	
	// 출력
	public void print_account() {
		System.out.println(name + "\t" + balance + "원\t" + rate + "%");
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

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}	
}
