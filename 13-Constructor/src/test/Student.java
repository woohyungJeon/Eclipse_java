package test;

public class Student {
	private String name;
	private int age;
	// private 멤버변수를 클래스 밖에서 사용하기 위해서는 
	// 반드시 getter와 setter를 이용한다.
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
}
