class Article {
	int seq;		// �۹�ȣ
	String subject;	// ������
	String writer;	// �ۼ���
	
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
		Article article1 = new Article(1, "�ڹٿ����Դϴ�.", "�ڹ��л�");
		article1.print();
		
		Article article2 = new Article(2, "�ڹٴ� ��ü���� ����Դϴ�.", "�ڹٰ���");
		article2.print();
		////////////////////////////
		Article a3 = new Article();
	}
}
