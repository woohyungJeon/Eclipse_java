import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

class Swing09 extends JFrame {
	Container container = getContentPane();
	// 선언
	JLabel label = new JLabel("ID : ", JLabel.RIGHT);
	JTextField textField = new JTextField(10);
	
	JDialog dialog = new JDialog(this, "확인");
	Container dialogContainer = dialog.getContentPane();
	JLabel dialogLabel = new JLabel("사용할 수 있는 ID 입니다.", JLabel.CENTER);
	
	public Swing09() {
		setTitle("swing09");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		// jframe 구성
		container.setLayout(new FlowLayout());
		container.add(label);
		container.add(textField);
		
		// jdialog 구성
		dialog.setSize(250, 150);
		dialog.setLocation(700, 400);
		dialogContainer.setLayout(new BorderLayout());
		dialogContainer.add("Center", dialogLabel);
		dialogLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
	}

	private void start() {
		// x버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// dialog x버튼
		dialog.setDefaultCloseOperation(HIDE_ON_CLOSE);
		// textField 이벤트 처리
		textField.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = textField.getText();
				dialogLabel.setText(id + "는 사용할 수 있는 ID입니다.");
				dialog.setVisible(true);
			}
		});
	}
}

public class Exam09 {
	public static void main(String[] args) {
		Swing09 swing09 = new Swing09();
	}
}
