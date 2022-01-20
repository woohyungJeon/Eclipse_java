
import java.util.Scanner;

public class Compute {
	Scanner sc = new Scanner(System.in);
	private int x;
	private int y;
	private int sum;
	private int sub;
	private int mul;
	private double div;

	// ������
	
	public Compute() {
	}
	

	public Compute(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		// ������ ���߾� ���ڿ� 1�� ����
		String div_str = String.format("%.2f", div);
		return x + "\t" + y + "\t" + sum + "\t" + sub + "\t" + mul + "\t" + div_str;
	}

	// �Է�
	void input() {
		System.out.print("���� �Է� : ");
		x = sc.nextInt();
		System.out.print("���� �Է� : ");
		y = sc.nextInt();
	}

	// ���� ���
	void outputTitle() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "X", "Y", "SUM", "SUB", "MUL", "DIV");
	}

	// ���
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

	public int getSum() { // ��
		sum = x + y;
		return sum;
	}

	public int getSub() { // ��
		sub = x - y;
		return sub;
	}

	public int getMul() { // ��
		mul = x * y;
		return mul;
	}

	public double getDiv() { // ��
		div = (double) x / y;
		return div;
	}

}
