
public class QNAArticle extends Article{
	private String answer;	

	@Override
	public String toString() {
		return "질문/답변 [답변=" + answer + ", 번호=" + getNum() + ", 제목=" + getTitle() + "]";
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
