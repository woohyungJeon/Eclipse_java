
public class Navy extends Unit{

	public Navy(String name) {
		super(name);
	}
	@Override
	public void attack() {
		super.attack();
		System.out.println(getName() + " >> ��ڹ߻�!!");
		System.out.println(getName() + " >> ���� ���");
	}
	
	public void nucleus() {
		System.out.println(getName() + " >> �ٹ̻���");
	}
}
