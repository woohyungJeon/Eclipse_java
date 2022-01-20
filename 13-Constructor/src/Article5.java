// 자바빈즈
public class Article5 {
	private int seq;		// 글번호
	private String subject;	// 글제목
	private String content;	// 글내용
	private String writer;	// 작성자
	private int hit;		// 조회수
	private String regDate;	// 작성일시
	
	// 디폴트 생성자
	public Article5() {
	}	
	
	public Article5(int seq, String subject, String content, String writer, int hit, String regDate) {
		this.seq = seq;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.hit = hit;
		this.regDate = regDate;
	}

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}	
}
