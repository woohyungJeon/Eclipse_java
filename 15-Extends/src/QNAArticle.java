
public class QNAArticle extends Article{
	private String answer;	

	@Override
	public String toString() {
		return "����/�亯 [�亯=" + answer + ", ��ȣ=" + getNum() + ", ����=" + getTitle() + "]";
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
