
public class Exam5 {
	public static void main(String[] args) {
		Article5 article1 = new Article5();
		article1.setSeq(1);
		article1.setSubject("내일은");
		article1.setContent("웃으리...");
		article1.setWriter("홍길동");
		article1.setHit(0);
		article1.setRegDate("2021-12-24");
		
		System.out.println(article1.getSeq());
		System.out.println(article1.getSubject());
		System.out.println(article1.getContent());
		System.out.println(article1.getWriter());
		System.out.println(article1.getHit());
		System.out.println(article1.getRegDate());
		System.out.println("-------------------");
		
		Article5 article2 = new Article5(2, "오늘은", "크리스마스 이브네요...", "고길동", 0, "2021-12-24");
		System.out.println(article2.getSeq());
		System.out.println(article2.getSubject());
		System.out.println(article2.getContent());
		System.out.println(article2.getWriter());
		System.out.println(article2.getHit());
		System.out.println(article2.getRegDate());
	}
}
