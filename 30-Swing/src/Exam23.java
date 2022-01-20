import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;

class Swing23 extends JFrame {
	Container container = getContentPane();
	// ����
	JLabel label = new JLabel();
	JButton buttonUp = new JButton("�� ��ư");
	JButton buttonDown = new JButton("�Ʒ� ��ư");
	JButton buttonLeft = new JButton("���� ��ư");
	
	JSplitPane splitPane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
								true, buttonUp, buttonDown);
	JSplitPane splitPane2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
								true, buttonLeft, splitPane1);
	
	public Swing23() {
		setTitle("swing23");
		setSize(300, 200);
		setLocationRelativeTo(null);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", label);
		container.add("Center", splitPane2);
		
		// splitPane1�� �Ʒ��� ����
		JButton buttonDown2 = new JButton("�Ʒ� ��ư2");
		splitPane1.setBottomComponent(buttonDown2);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam23 {
	public static void main(String[] args) {
		Swing23 swing23 = new Swing23();
	}
}
