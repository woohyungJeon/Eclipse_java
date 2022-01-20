
public class Navy extends Unit{
	public Navy(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println(getName() + " >> 해상 공격");
	}
	@Override
	public void move() {
		System.out.println(getName() + " >> 해상 이동");
	}
}
