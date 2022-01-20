package study.java.model;
// java beans : �ּҷ� ������, 1�� ������ ����
public class People {
	private String name;
	private String phone;
	
	public People() {
		super();
	}

	public People(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "People [name=" + name + ", phone=" + phone + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}		
}
