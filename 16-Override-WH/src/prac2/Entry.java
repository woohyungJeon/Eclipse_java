package prac2;

public class Entry {
	String word; //약어저장
	
	public Entry() {
		super();
		System.out.println("----약어사정-----");
	}
	
	public Entry(String word) {
		this();
		this.word = word;
	}
	
	public void writeView() {
		System.out.println("약어 출력 : " + word);
	}

}
