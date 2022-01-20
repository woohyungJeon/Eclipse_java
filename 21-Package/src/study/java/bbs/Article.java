package study.java.bbs;

public class Article {
	// ��ü �Խù��� ���� ǥ���ϱ� ���� ����
	private static int count = 0;
	// �Խù��� �з��� �����ϱ� ���� ����
	private static String category;
	
	private int num;		// �۹�ȣ
	private String title;	// ������
	private String regDate;	// �ۼ��Ͻ�
	
	public Article(int num, String title, String regDate) {
		super();
		this.num = num;
		this.title = title;
		this.regDate = regDate;
		// �Խù��� ���� ��ϵ� ������, ��ü�� ���� ������Ŵ
		Article.count++;
	}	

	@Override
	public String toString() {
		return "�� �з�=" + Article.category + ", ��ü �� ��=" + Article.count
			 + " [num=" + num + ", title=" + title + ", regDate=" + regDate + "]";
	}

	// getter / setter
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Article.count = count;
	}

	public static String getCategory() {
		return category;
	}

	public static void setCategory(String category) {
		Article.category = category;
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

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
}
