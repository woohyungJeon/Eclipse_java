import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;

class Swing23 extends JFrame {
	Container container = getContentPane();
	// 선언
	JLabel label = new JLabel();
	JButton buttonUp = new JButton("위 버튼");
	JButton buttonDown = new JButton("아래 버튼");
	JButton buttonLeft = new JButton("좌측 버튼");
	
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
		
		// splitPane1의 아래를 변경
		JButton buttonDown2 = new JButton("아래 버튼2");
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
