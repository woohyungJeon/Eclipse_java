import java.awt.*;
import java.awt.event.*;
//이벤트 처리 방법4
class Form4 extends Frame {
	// 선언
	Button button = new Button("확인");
	
	public Form4() {
		// Frame 설정
		setTitle("Event4");
		setSize(300, 200);
		
		init();
		start();
		
		setVisible(true);
	}

	private void init() {
		setLayout(null);
		button.setBackground(Color.YELLOW);
		button.setBounds(100, 100, 80, 30);
		add(button);
	}

	private void start() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		// 프레임 창의 x버튼 종료 처리 : 프레임 객체에 이벤트 추가
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});			
	}
}

public class Exam4 {
	public static void main(String[] args) {
		Form4 form4 = new Form4();
	}
}
