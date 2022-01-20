package Test;
public class Employee {
	private String name; //이름
	private String position; //직급
	private int pay; //기본급
	private int benefit; //수당
	private double tax; //세율
	private int salary; //월급
	
	public Employee() {
		
	}
	
	public Employee(String name, String position, int pay, int benefit, double tax, int salary) {
		this.name = name;
		this.position = position;
		this.pay = pay;
		this.benefit = benefit;		
		this.tax = tax;
		this.salary = salary;
		
	}
	
	public void calc_Tax() {
		if(pay + benefit <= 2000000) {
			tax = 0.01;
		}else if(pay + benefit >2000000 && pay + benefit <= 4000000) {
			tax = 0.02;
		}else if(pay + benefit > 4000000 ){
			tax = 0.03;
		}
	}

	public void calc_Salary() {
		salary = (int) (pay + benefit - (pay + benefit) * tax); 
	}
	
	public String toString() {
		return name+"\t"+position+"\t"+pay+"\t"+benefit+"\t"+tax+"\t"+salary+"\t";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getBenefit() {
		return benefit;
	}
	public void setBenefit(int benefit) {
		this.benefit = benefit;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
