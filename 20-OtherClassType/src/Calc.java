
public class Calc {
	// singleton ���� ����
	private static Calc instance = null;
	
	public static Calc getInstance() {
		if(instance == null) instance = new Calc();
		
		return instance;
	}
	
	// ����Ʈ ������
	// => private �̱� ������, new�� ��ü ������ �� �� ����.
	private Calc() {}
	// singleton ���� ��
	
	public void plus(int x, int y) {
		System.out.println(x + " + " + y + " = " + (x+y));
	}
	public void minus(int x, int y) {
		System.out.println(x + " - " + y + " = " + (x-y));
	}
}
