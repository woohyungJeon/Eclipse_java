import study.java.bbs.Article;

public class Exam3 {
	public static void main(String[] args) {
		Article.setCategory("�����Խ���");
		
		Article a1 = new Article(1, "ù��° �� �����Դϴ�.", "2022-01-01");
		Article a2 = new Article(2, "�ι�° �� �����Դϴ�.", "2022-01-02");
		Article a3 = new Article(3, "����° �� �����Դϴ�.", "2022-01-03");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println("----------------------");
		
		Article.setCategory("��������");
		
		Article a4 = new Article(1, "ù��° ���������Դϴ�.", "2022-01-01");
		Article a5 = new Article(2, "�ι�° ���������Դϴ�.", "2022-01-02");
		Article a6 = new Article(3, "����° ���������Դϴ�.", "2022-01-03");
		
		System.out.println(a4.toString());
		System.out.println(a5.toString());
		System.out.println(a6.toString());
	}
}
