package exam6;

public class DbtestDTO {
	private String name;      //-- �̸�
	private int age;          //-- ����
	private double height;    //-- Ű, (��ü�ڸ���, �Ҽ����ڸ���)
	private String logtime;    //-- ��ϳ�¥
	
	public DbtestDTO() {
		super();
	}

	public DbtestDTO(String name, int age, double height, String logtime) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.logtime = logtime;
	}	

	@Override
	public String toString() {
		String result = String.format("%s\t%s\t%s\t%s", name, age, height, logtime);
		return result;
	}

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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getLogtime() {
		return logtime;
	}

	public void setLogtime(String logtime) {
		this.logtime = logtime;
	}	
}
