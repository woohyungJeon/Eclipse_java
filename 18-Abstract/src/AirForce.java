
public class AirForce extends Unit{

	public AirForce(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println(getName() + " >> ���� ����");
	}
	@Override
	public void move() {
		System.out.println(getName() + " >> ���� �̵�");
	}
}
