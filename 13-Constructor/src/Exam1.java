class Book {
	String subject;
	String content;
	
	// 생성자 함수
	// => 특수함수 : 클래스와 이름이 똑같은 함수
	// => 객체 생성후, 무조건 1번 자동 호출됨
	// => 사용자가 호출할 수 없는 함수
	// => 용도 : 멤버변수 초기화
	Book() {
		System.out.println("생성자 실행됨");
		this.subject = "JAVA 입문";
		this.content = "JAVA는 여러 방면에 사용됩니다.";
	}
	
	void read() {
		System.out.println("read() 실행됨");
		System.out.println(subject);
		System.out.println(content);
	}
}
public class Exam1 {
	public static void main(String[] args) {
		Book book = new Book();
		book.read();
		//book.Book();  // 에러, 생성자는 호출해서 사용할 수 없음
	}
}
