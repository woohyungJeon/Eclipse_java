
public class AirForce extends Unit {

	public AirForce(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		super.attack();
		System.out.println(getName() + " >> �̷�");
		System.out.println(getName() + " >> ���߰��� ������");
	}

	public void bombing() {
		System.out.println(getName() + " >> ����");
	}
}
