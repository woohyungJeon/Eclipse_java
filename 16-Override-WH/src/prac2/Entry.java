package prac2;

public class Entry {
	String word; //�������
	
	public Entry() {
		super();
		System.out.println("----������-----");
	}
	
	public Entry(String word) {
		this();
		this.word = word;
	}
	
	public void writeView() {
		System.out.println("��� ��� : " + word);
	}

}
