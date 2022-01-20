
public abstract class Unit {
	private String name;
	
	public Unit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// �߻� �޼ҵ� ����
	public abstract void attack();
	public abstract void move();	
}
