// �ڹٺ���
public class Article5 {
	private int seq;		// �۹�ȣ
	private String subject;	// ������
	private String content;	// �۳���
	private String writer;	// �ۼ���
	private int hit;		// ��ȸ��
	private String regDate;	// �ۼ��Ͻ�
	
	// ����Ʈ ������
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
