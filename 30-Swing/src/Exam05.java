import java.awt.Button;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

class Swing05 extends JFrame {
	Container container = getContentPane();
	// jToggleButton
	JToggleButton button1 = new JToggleButton("1", true);
	JToggleButton button2 = new JToggleButton("2", false);
	JToggleButton button3 = new JToggleButton("3", false);
	JToggleButton button4 = new JToggleButton("4", false);
	// JToggleButton을 묶어주는 클래스
	ButtonGroup buttonGroup = new ButtonGroup();
	
	public Swing05() {
		setTitle("swing05");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new GridLayout(2, 2, 2, 2));
		container.add(button1);
		container.add(button2);
		container.add(button3);
		container.add(button4);
		// 버튼을 그룹으로 묶기
		buttonGroup.add(button1);
		buttonGroup.add(button2);
		buttonGroup.add(button3);
		buttonGroup.add(button4);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// button1에 이벤트 설정
		button1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(button1.isSelected()) {
					System.out.println("button1 On");
				} else {
					System.out.println("button1 Off");
				}
			}
		});
	}
}
public class Exam05 {
	public static void main(String[] args) {
		Swing05 swing05 = new Swing05();
	}
}
