
public class Exam3 {
	static double plus(double x, double y) {
		return x + y;
	}
	
	static double minus(double x, double y) {
		return x - y;
	}

	public static void main(String[] args) {
		double x = 100.5, y=200.7;
		System.out.println(x + " + " + y + " = " + plus(x, y));		
		System.out.println(x + " - " + y + " = " + minus(x, y));
	}
}
