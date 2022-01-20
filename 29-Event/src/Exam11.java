interface AAA {
	void ex();
}

public class Exam11 {
	public static void main(String[] args) {
		Calculate calculate = (a, b) -> a+b;
		System.out.println(calculate.operation(5, 7));
		
		AAA aa = () -> {System.out.println("test");};
		aa.ex();
	}
}
