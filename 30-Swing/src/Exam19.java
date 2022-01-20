import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

class Swing19 extends JFrame {
	Container container = getContentPane();
	// ����
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
		// toolBar ����
		toolBar.setRollover(true);  // ���콺�� �÷��� �� Ȱ��ȭ
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
