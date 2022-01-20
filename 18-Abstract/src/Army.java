
public class Army extends Unit{
	public Army(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println(getName() + " >> 육상 공격");
	}
	@Override
	public void move() {
		System.out.println(getName() + " >> 육상 이동");
	}
}
