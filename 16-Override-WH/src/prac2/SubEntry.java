package prac2;

public class SubEntry extends Entry{
	private String definition;
	private int year;
	
	public SubEntry(String word) {
		super(word);
	}
	
	public SubEntry(String word, String definition, int year) {
		this(word);
		this.definition = definition;
		this.year = year;
	}
	
	public void printView() {
		System.out.println("원어 : " + definition);
		System.out.println("시기 : " + year);
	}
}
