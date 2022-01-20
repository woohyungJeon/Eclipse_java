import java.awt.*;
import java.awt.event.*;

//이벤트 처리 방법2
class Form2 extends Frame implements ActionListener {
	// 선언
	Button button = new Button("확인");
	
	public Form2() {
		// Frame 설정
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
		add(button);	// Frame에 추가
	}
	// 이벤트 설정
	private void start() {
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}	
}
public class Exam2 {
	public static void main(String[] args) {
		Form2 form2 = new Form2();
	}
}
