import java.awt.*;

public class Exam2 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(300, 200);
		f.setTitle("기본화면");
		
		// Button 객체 생성
		Button button = new Button("확인");
		// 배경색 설정
		button.setBackground(Color.YELLOW);
		// 버튼의 위치와 크기 지정
		button.setBounds(100, 100, 80, 30);
		// 프레임에 추가
		f.setLayout(null);
		f.add(button);
		
		// 윈도우창 보이기
		f.setVisible(true);
	}
}
