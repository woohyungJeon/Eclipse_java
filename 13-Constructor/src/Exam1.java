class Book {
	String subject;
	String content;
	
	// ������ �Լ�
	// => Ư���Լ� : Ŭ������ �̸��� �Ȱ��� �Լ�
	// => ��ü ������, ������ 1�� �ڵ� ȣ���
	// => ����ڰ� ȣ���� �� ���� �Լ�
	// => �뵵 : ������� �ʱ�ȭ
	Book() {
		System.out.println("������ �����");
		this.subject = "JAVA �Թ�";
		this.content = "JAVA�� ���� ��鿡 ���˴ϴ�.";
	}
	
	void read() {
		System.out.println("read() �����");
		System.out.println(subject);
		System.out.println(content);
	}
}
public class Exam1 {
	public static void main(String[] args) {
		Book book = new Book();
		book.read();
		//book.Book();  // ����, �����ڴ� ȣ���ؼ� ����� �� ����
	}
}
