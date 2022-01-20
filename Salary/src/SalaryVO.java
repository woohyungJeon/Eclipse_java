
public class SalaryVO {
	private String name; 	// 이름
	private String rank; 	// 직급
	private int normal; 	// 기본급
	private int alw; 		// 수당
	private int salary; 	// 월급
	private double tariff; 	// 세율
	// 생성자
	public SalaryVO() {
	}
	public SalaryVO(String name, String rank, int normal, int alw) {
		super();
		this.name = name;
		this.rank = rank;
		this.normal = normal;
		this.alw = alw;
	}
	@Override
	public String toString() {
		return name + "\t" + rank + "\t" + normal + "\t" + alw + "\t" 
				+ getTariff() + "\t" + getSalary();
	}
	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int getNormal() {
		return normal;
	}
	public void setNormal(int normal) {
		this.normal = normal;
	}
	public int getAlw() {
		return alw;
	}
	public void setAlw(int alw) {
		this.alw = alw;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getTariff() {		
		return tariff;
	}
	public void setTariff(double tariff) {
		this.tariff = tariff;
	}
}
