import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class Swing11 extends JFrame {
	Container container = getContentPane();
	// 선언
	JLabel label = new JLabel("메모장", JLabel.CENTER);
	JButton button1 = new JButton("확인");
	JButton button2 = new JButton("취소");
	
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane(textArea);
	
	JPanel panelButton = new JPanel();
	
	public Swing11() {
		setTitle("swing11");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", label);
		container.add("Center", scrollPane);
		container.add("South", panelButton);
		// panelButton 구성
		panelButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panelButton.add(button1);
		panelButton.add(button2);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam11 {
	public static void main(String[] args) {
		Swing11 swing11 = new Swing11();
	}
}
