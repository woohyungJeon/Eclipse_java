package prac1;

public class Department extends Salary {
   String department;
   
   public Department(String name, int salary, String department) {
      super(name, salary);
      this.department = department;
   }
   
   @Override
   public void viewInformation() {
	   super.viewInformation();
	   System.out.println("ºÎ¼­ : " + department);
   }   
}
