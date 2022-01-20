
import java.util.Scanner;

public class Compute {
	Scanner sc = new Scanner(System.in);
	private int x;
	private int y;
	private int sum;
	private int sub;
	private int mul;
	private double div;

	// 생성자
	
	public Compute() {
	}
	

	public Compute(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		// 서식을 맞추어 문자열 1개 생성
		String div_str = String.format("%.2f", div);
		return x + "\t" + y + "\t" + sum + "\t" + sub + "\t" + mul + "\t" + div_str;
	}

	// 입력
	void input() {
		System.out.print("정수 입력 : ");
		x = sc.nextInt();
		System.out.print("정수 입력 : ");
		y = sc.nextInt();
	}

	// 제목 출력
	void outputTitle() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "X", "Y", "SUM", "SUB", "MUL", "DIV");
	}

	// 출력
	void outputCalc() {
		System.out.println(toString());
	}

	// getter/setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSum() { // 합
		sum = x + y;
		return sum;
	}

	public int getSub() { // 차
		sub = x - y;
		return sub;
	}

	public int getMul() { // 곱
		mul = x * y;
		return mul;
	}

	public double getDiv() { // 몫
		div = (double) x / y;
		return div;
	}

}
