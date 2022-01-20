import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

class Swing18 extends JFrame {
	Container container = getContentPane();
	// 선언
	// North
	JLabel labelId = new JLabel("ID : ");
	JTextField textField = new JTextField();
	// Center
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane(textArea);
	// South
	JLabel labelPass = new JLabel("Password : ");
	JPasswordField passwordField = new JPasswordField();
	
	// panel
	JPanel panelNorth = new JPanel();
	JPanel panelSouth = new JPanel();
	
	public Swing18() {
		setTitle("swing18");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		// jFrame
		container.setLayout(new BorderLayout());
		container.add("North", panelNorth);
		container.add("Center", scrollPane);
		container.add("South", panelSouth);
		// panelNorth 구성
		panelNorth.setBorder(new BevelBorder(BevelBorder.RAISED));
		panelNorth.setLayout(new BorderLayout());
		panelNorth.add("West", labelId);
		panelNorth.add("Center", textField);
		// panelSouth 구성
		panelSouth.setLayout(new BorderLayout());
		panelSouth.add("West", labelPass);
		panelSouth.add("Center", passwordField);
		// passwordField에 표시되는 문자 설정, 기본값은 '*'
		passwordField.setEchoChar('%');
		
		// textArea 구성 : 편집 금지
		textArea.setEditable(false);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// passwordField 이베트 처리
		passwordField.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String result = passwordField.getText();
				textArea.setText(result);
			}
		});
	}
}

public class Exam18 {
	public static void main(String[] args) {
		Swing18 swing18 = new Swing18();
	}
}
