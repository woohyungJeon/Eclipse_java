
public class Exam2 {
	public static void main(String[] args) {
		Army army = new Army("����");
		Navy navy = new Navy("�ر�");
		AirForce af = new AirForce("����");
		
		army.attack();
		army.tank();
		
		navy.attack();
		navy.nucleus();
		
		af.attack();
		af.bombing();
	}
}
