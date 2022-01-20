
public class Calc {
	// singleton 패턴 시작
	private static Calc instance = null;
	
	public static Calc getInstance() {
		if(instance == null) instance = new Calc();
		
		return instance;
	}
	
	// 디폴트 생성자
	// => private 이기 때문에, new로 객체 생성을 할 수 없다.
	private Calc() {}
	// singleton 패턴 끝
	
	public void plus(int x, int y) {
		System.out.println(x + " + " + y + " = " + (x+y));
	}
	public void minus(int x, int y) {
		System.out.println(x + " - " + y + " = " + (x-y));
	}
}
