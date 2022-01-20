import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

class Swing08 extends JFrame {
	Container container = getContentPane();
	// 선언
	JButton[] buttons = new JButton[6];
	// 세로축으로 컴포넌트를 추가하는 Box 객체 생성
	Box box1 = Box.createVerticalBox();
	// 가로축으로 컴포넌트를 추가하는 Box 객체 생성
	Box box2 = Box.createHorizontalBox();
	Box box3 = Box.createHorizontalBox();
	
	public Swing08() {
		setTitle("swing08");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new FlowLayout());
		container.add(box3);
		
		// box3에 box1, box2 추가
		box3.add(box1);
		box3.add(box2);
		
		// button 생성
		for(int i=0; i<buttons.length; i++) {
			buttons[i] = new JButton(String.valueOf(i+1));
		}
		
		// box1에 button 추가
		box1.add(Box.createVerticalStrut(10));
		for(int i=0; i<3; i++) {
			box1.add(buttons[i]);
			box1.add(Box.createVerticalStrut(10)); // 10pixel 간격추가
		}
		// box2에 button 추가
		box2.add(Box.createHorizontalStrut(10));
		for(int i=3; i<6; i++) {
			box2.add(buttons[i]);
			box2.add(Box.createHorizontalStrut(10));// 10pixel 간격추가
		}
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam08 {
	public static void main(String[] args) {
		Swing08 swing08 = new Swing08();
	}
}
