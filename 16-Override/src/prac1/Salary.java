package prac1;

public class Salary {   
   String name;
   int salary;
   
   public Salary(String name, int salary) {
      this.name = name;
      this.salary = salary;
   }
   
   public void viewInformation() {
      System.out.println("¿Ã∏ß : " + name);
      System.out.println("ø¨∫¿ : " + salary);
   }
}
