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
	// ����
	JLabel label = new JLabel("ID : ", JLabel.RIGHT);
	JTextField textField = new JTextField(10);
	
	JDialog dialog = new JDialog(this, "Ȯ��");
	Container dialogContainer = dialog.getContentPane();
	JLabel dialogLabel = new JLabel("����� �� �ִ� ID �Դϴ�.", JLabel.CENTER);
	
	public Swing09() {
		setTitle("swing09");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		// jframe ����
		container.setLayout(new FlowLayout());
		container.add(label);
		container.add(textField);
		
		// jdialog ����
		dialog.setSize(250, 150);
		dialog.setLocation(700, 400);
		dialogContainer.setLayout(new BorderLayout());
		dialogContainer.add("Center", dialogLabel);
		dialogLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
	}

	private void start() {
		// x��ư
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// dialog x��ư
		dialog.setDefaultCloseOperation(HIDE_ON_CLOSE);
		// textField �̺�Ʈ ó��
		textField.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = textField.getText();
				dialogLabel.setText(id + "�� ����� �� �ִ� ID�Դϴ�.");
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
