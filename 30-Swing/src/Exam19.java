import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

class Swing19 extends JFrame {
	Container container = getContentPane();
	// 선언
	JToolBar toolBar = new JToolBar(JToolBar.HORIZONTAL);
	JButton button1 = new JButton(new ImageIcon("img/img1.png"));
	JButton button2 = new JButton(new ImageIcon("img/img2.png"));
	
	public Swing19() {
		setTitle("swing19");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", toolBar);
		// toolBar 구성
		toolBar.setRollover(true);  // 마우스를 올렸을 때 활성화
		toolBar.add(button1);
		toolBar.addSeparator();
		toolBar.add(button2);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam19 {
	public static void main(String[] args) {
		Swing19 swing19 = new Swing19();
	}
}
