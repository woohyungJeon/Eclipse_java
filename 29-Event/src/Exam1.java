import java.awt.*;
import java.awt.event.*;

// 이벤트 처리 방법1
class ActionDefine implements ActionListener {
	// 마우스 클릭, enter 키를 누르면 호출됨
	@Override
	public void actionPerformed(ActionEvent e) {
		// 프로그램 종료
		System.exit(0);
	}	
}
// 화면만들기 + 이벤트 설정
class Form1 extends Frame {
	// 선언
	Button button = new Button("확인");
	ActionDefine ad = new ActionDefine();
	
	public Form1() {
		// Frame 설정
		setTitle("Event");
		setSize(300, 200);
		init();		// 화면구성
		start();	// 이벤트 설정
		
		setVisible(true);
	}
	void init() {
		setLayout(null);
		button.setBackground(Color.YELLOW);
		button.setBounds(100, 100, 80, 30);
		add(button);
	}
	void start() {
		// 버튼을 클릭하면 동작될 이벤트 처리 객체 설정
		button.addActionListener(ad);
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Form1 form1 = new Form1();
	}
}
