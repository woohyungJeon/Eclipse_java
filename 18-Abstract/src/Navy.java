
public class Navy extends Unit{
	public Navy(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println(getName() + " >> �ػ� ����");
	}
	@Override
	public void move() {
		System.out.println(getName() + " >> �ػ� �̵�");
	}
}
