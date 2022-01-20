package prac1;

public class Department extends Salary{
	
	String departement;

	public Department(String name, int salary, String departement) {
		super(name, salary);
		this.departement = departement;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void viewInformation() {
		// TODO Auto-generated method stub
		super.viewInformation();
		System.out.println("ºÎ¼­ : " + departement);
	}
	


}
