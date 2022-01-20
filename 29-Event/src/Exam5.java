import java.awt.*;
import java.awt.event.*;

class Form5 extends Frame implements ActionListener{
	// 선언
	Button button1 = new Button("버튼1");
	Button button2 = new Button("버튼2");
	Button button3 = new Button("버튼3");
	FlowLayout flowLayout = new FlowLayout();
	// GridLayout(행의 수, 열의 수, 가로 여백, 세로 여백)
	GridLayout gridLayout = new GridLayout(2, 2, 5, 5);
	BorderLayout borderLayout = new BorderLayout();
	
	public Form5() {
		setTitle("Layout5");
		setSize(300, 200);
		setLocation(700, 300);
		
		//init1();
		//init2();
		init3();
		start();
		
		setVisible(true);
	}
	// 화면 구성
	private void init1() {
		// 컴포넌트의 원래 크기대로 왼쪽에서 오른쪽으로 순서대로 배치함
		setLayout(flowLayout);
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.GREEN);
		button3.setBackground(Color.CYAN);
		
		add(button1);
		add(button2);
		add(button3);
	}
	private void init2() {
		// 격자모양으로 컴포넌트를 배치함
		setLayout(gridLayout);
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.GREEN);
		button3.setBackground(Color.CYAN);
		
		add(button1);
		add(button2);
		add(button3);
	}
	
	private void init3() {
		// 컴포넌트를 동서남북 중앙으로 배치시킴
		// East, West, South, North, Center
		setLayout(borderLayout);
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.GREEN);
		button3.setBackground(Color.CYAN);
		
		add("North", button1);
		add("Center", button2);
		add("South", button3);
	}
	// 이벤트 설정
	private void start() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		// x버튼 이벤트 처리
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Dialog dialog = new Dialog(this);
		dialog.setLocation(800, 400);
		dialog.setSize(100, 40);
		
		if(e.getSource() == button1) {
			dialog.setTitle("버튼1");
			dialog.setVisible(true);
		} else if(e.getSource() == button2) {
			dialog.setTitle("버튼2");
			dialog.setVisible(true);
		} else if(e.getSource() == button3) {
			dialog.setTitle("버튼3");
			dialog.setVisible(true);
		}
		// dialog의 x버튼 이베튼 처리
		dialog.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dialog.dispose(); 				
			}
		});
	}	
}

public class Exam5 {
	public static void main(String[] args) {
		Form5 form5 = new Form5();
	}
}
