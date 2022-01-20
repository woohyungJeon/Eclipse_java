import java.awt.Frame;

public class Exam1 {
	public static void main(String[] args) {
		// 윈도우 화면을 구성하는 클래스
		// => 화면의 틀
		Frame f = new Frame();
		// 화면의 크기 설정
		f.setSize(300, 200);
		// 타이틀 설정
		f.setTitle("Java");
		// 윈도우창 보이기 설정
		f.setVisible(true);
	}
}
