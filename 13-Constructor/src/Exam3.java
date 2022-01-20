import test.Student;

public class Exam3 {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.setName("홍길동");
		student.setAge(25);
		System.out.println("이름 : " + student.getName());
		System.out.println("나이 : " + student.getAge());
		
		/* 멤버변수가 private이므로 접근 불가
		student.name = "홍길동";
		student.age = 25;
		System.out.println("이름 : " + student.name);
		System.out.println("나이 : " + student.age);
		*/
	}
}
