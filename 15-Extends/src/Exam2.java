
public class Exam2 {
	public static void main(String[] args) {
		FileArticle fileArticle = new FileArticle();
		fileArticle.setNum(1);
		fileArticle.setFileName("java.ppt");
		fileArticle.setTitle("ù��° �ڷ��Դϴ�.");
		System.out.println(fileArticle.toString());
		System.out.println("----------------");
		
		QNAArticle qnaArticle = new QNAArticle();
		qnaArticle.setNum(2);
		qnaArticle.setTitle("ù��° �����Դϴ�.");
		qnaArticle.setAnswer("ù��° �亯�Դϴ�.");
		System.out.println(qnaArticle.toString());
	}
}
