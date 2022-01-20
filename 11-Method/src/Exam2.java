
public class Exam2 {
	static void plus(int x, int y) {
		int r = x + y;
		System.out.println(x + " + " + y + " = " + r);
	}
	
	static void minus(int x, int y) {
		int r = x - y;
		System.out.println(x + " - " + y + " = " + r);
	}
	
	public static void main(String[] args) {
		plus(5, 7);
		minus(5, 7);
	}
}
