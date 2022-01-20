
class Test3 {
	int a1, b1;
	double a2, b2;
	char a3, b3;

	public Test3(int a1, int b1) {
		this.a1 = a1;
		this.b1 = b1;
	}

	public Test3(double a2, double b2) {
		this.a2 = a2;
		this.b2 = b2;
	}

	public Test3(char a3, char b3) {
		this.a3 = a3;
		this.b3 = b3;
	}

	void output() {	
		if(a1 != 0 && b1 != 0)
			System.out.println("max = " + (a1 > b1 ? a1 : b1));
		if(a2 != 0 && b2 != 0)
			System.out.println("max = " + (a2 > b2 ? a2 : b2));
		if(a3 != 0 && b3 != 0)
			System.out.println("max = " + (a3 > b3 ? a3 : b3));
	}
}

public class Practice3 {
	public static void main(String[] args) {
		Test3 ob1 = new Test3(10, 20);
		Test3 ob2 = new Test3(12.4, 9.45);
		Test3 ob3 = new Test3('Z', 'p');

		ob1.output();
		ob2.output();
		ob3.output();
	}

}
