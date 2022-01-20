class Article {
	int seq;		// 글번호
	String subject;	// 글제목
	String writer;	// 작성자
	
	Article() {		
	}
	
	Article(int seq, String subject, String writer) {
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	void print() {
		System.out.println(seq);
		System.out.println(subject);
		System.out.println(writer);
	}
}
public class Exam2 {
	public static void main(String[] args) {
		Article article1 = new Article(1, "자바연습입니다.", "자바학생");
		article1.print();
		
		Article article2 = new Article(2, "자바는 객체지향 언어입니다.", "자바강사");
		article2.print();
		////////////////////////////
		Article a3 = new Article();
	}
}
