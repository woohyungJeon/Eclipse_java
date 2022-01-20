import java.awt.*;
import java.awt.event.*;
//이벤트 처리 방법3
class Form3 extends Frame {
	// 선언
	Button button = new Button("확인");
	
	public Form3() {
		// frame 설정
		setTitle("Event");
		setSize(300, 200);
		
		init();
		start();
		
		setVisible(true);
	}
	// 화면 구성
	private void init() {
		setLayout(null);
		button.setBackground(Color.YELLOW);
		button.setBounds(100, 100, 80, 30);
		add(button);
	}
	// 이벤트 설정
	private void start() {
		// 이벤트 처리 객체 생성
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		};
		// 버튼 이벤트 설정
		button.addActionListener(actionListener);
	}
}
public class Exam3 {
	public static void main(String[] args) {
		Form3 form3 = new Form3();
	}
}
