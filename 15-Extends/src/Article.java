
public class Article {
	private int num;		// �۹�ȣ
	private String title;	// ����
	
	public Article() {
		System.out.println("Article() ȣ��");
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
