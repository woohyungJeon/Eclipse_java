
public class Article {
	private int num;		// 글번호
	private String title;	// 제목
	
	public Article() {
		System.out.println("Article() 호출");
	}
	
	public Article(int num, String title) {
		super();
		this.num = num;
		this.title = title;
	}


	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}	
}
