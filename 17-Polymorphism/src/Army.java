
public class Army extends Unit {

	public Army(String name) {
		super(name);
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println(getName() + " >> ���� ���� ������");
	}
	
	public void tank() {
		System.out.println(getName() + " >> ��ũ ����");
	}

}
