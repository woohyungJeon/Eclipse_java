import test.Student;

public class Exam3 {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.setName("ȫ�浿");
		student.setAge(25);
		System.out.println("�̸� : " + student.getName());
		System.out.println("���� : " + student.getAge());
		
		/* ��������� private�̹Ƿ� ���� �Ұ�
		student.name = "ȫ�浿";
		student.age = 25;
		System.out.println("�̸� : " + student.name);
		System.out.println("���� : " + student.age);
		*/
	}
}
