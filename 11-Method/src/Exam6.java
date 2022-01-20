
public class Exam6 {
	// µ¡¼À ±â´ÉÀÇ ÇÔ¼ö
	static int plus(int x, int y) {
		System.out.println("plus(int, int)");
		return x+y;
	}
	static double plus(int x, double y) {
		System.out.println("plus(int, double)");
		return x+y;
	}
	static double plus(double x, int y) {
		System.out.println("plus(double, int)");
		return x+y;
	}
	static double plus(double x, double y) {
		System.out.println("plus(double, double)");
		return x+y;
	}
	public static void main(String[] args) {
		System.out.println(plus(5, 7));		// plus(int, int)
		System.out.println(plus(5, 7.7));	// plus(int, double)
		System.out.println(plus(5.5, 7));	// plus(double, int)
		System.out.println(plus(5.5, 7.7));	// plus(double, double)
	}
}
