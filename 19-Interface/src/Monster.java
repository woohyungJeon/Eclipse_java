
public class Monster implements Fight, Move{
	private String name;
	
	public Monster(String name) {
		this.name = name;
	}

	@Override
	public void walk() {
		System.out.println(name + " >> �Ƚ��ϴ�.");
	}
	@Override
	public void run() {
		System.out.println(name + " >> �ݴϴ�.");
	}
	@Override
	public void jump() {
		System.out.println(name + " >> ������ �մϴ�.");
	}
	@Override
	public void attack() {
		System.out.println(name + " >> �����߽��ϴ�.");
	}
	@Override
	public void shield() {
		System.out.println(name + " >> ����߽��ϴ�.");
	}	
}
