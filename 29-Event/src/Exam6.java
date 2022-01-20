import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;

class Form6 extends Frame implements ActionListener{
	// 선언
	// Frame 쪽 컴포넌트
	BorderLayout borderLayout = new BorderLayout();
	
	// 패널 및 패널 쪽 컴포넌트
	Panel panel = new Panel();
	GridLayout gridLayout = new GridLayout(1, 2);
	Button button1 = new Button("버튼1");
	Button button2 = new Button("버튼2");
	
	public Form6() {
		// frame 기본 설정
		setTitle("Layout6");
		setSize(300, 200);
		setLocation(700, 300);
		
		init();
		start();
		
		setVisible(true);
	}
	// 화면 구성
	private void init() {
		// frame 구성
		setLayout(borderLayout);
		add("South", panel);
		
		// panel 구성
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.GREEN);
		
		panel.setLayout(gridLayout);
		panel.add(button1);
		panel.add(button2);
	}
	// 이벤트 설정
	private void start() {
		// x버튼 
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// 버튼 이벤트
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			System.out.println("버튼1");
		} else if(e.getSource() == button2) {
			System.out.println("버튼2");
		}
	}	
}

public class Exam6 {
	public static void main(String[] args) {
		Form6 form6 = new Form6();
	}
}
