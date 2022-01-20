
public class Exam2 {
	public static void main(String[] args) {
		FileArticle fileArticle = new FileArticle();
		fileArticle.setNum(1);
		fileArticle.setFileName("java.ppt");
		fileArticle.setTitle("첫번째 자료입니다.");
		System.out.println(fileArticle.toString());
		System.out.println("----------------");
		
		QNAArticle qnaArticle = new QNAArticle();
		qnaArticle.setNum(2);
		qnaArticle.setTitle("첫번째 질문입니다.");
		qnaArticle.setAnswer("첫번째 답변입니다.");
		System.out.println(qnaArticle.toString());
	}
}
