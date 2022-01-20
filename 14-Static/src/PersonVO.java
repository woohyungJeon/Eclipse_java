// java beans
// => ~VO	(Value Object)
// => ~DTO  (Data Transfer Object)
public class PersonVO {
	private String name;
	private int age;
	private String tel;
	// ������
	public PersonVO() {
	}

	public PersonVO(String name, int age, String tel) {		
		this.name = name;
		this.age = age;
		this.tel = tel;
	}
	// toString
	// => ��� ����������� Ȯ���� ��, ���
	@Override
	public String toString() {
		return "PersonVO [name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}
	
	// getter / setter
	public String getName() {
		return name;
	}	

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}	
}
