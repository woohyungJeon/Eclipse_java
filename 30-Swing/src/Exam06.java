import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class Swing06 extends JFrame implements ActionListener {
	Container container = getContentPane();
	// ����
	JRadioButton button1 = new JRadioButton("����", true);
	JRadioButton button2 = new JRadioButton("����");
	JRadioButton button3 = new JRadioButton("û�ҳ�");
	JRadioButton button4 = new JRadioButton("����", true);

	ButtonGroup buttonGroup1 = new ButtonGroup();
	ButtonGroup buttonGroup2 = new ButtonGroup();

	public Swing06() {
		setTitle("swing06");
		setSize(200, 100);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new GridLayout(2, 2, 5, 5));
		container.add(button1);
		container.add(button2);
		container.add(button3);
		container.add(button4);
		// �׷����� ����
		buttonGroup1.add(button1);
		buttonGroup1.add(button2);

		buttonGroup2.add(button3);
		buttonGroup2.add(button4);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// button �̺�Ʈ ����
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			if(button1.isSelected()) System.out.println("���� ����");
		} else if (e.getSource() == button2) {
			if(button2.isSelected()) System.out.println("���� ����");
		} else if (e.getSource() == button3) {
			if(button3.isSelected()) System.out.println("û�ҳ� ����");
		} else if (e.getSource() == button4) {
			if(button4.isSelected()) System.out.println("���� ����");
		}
	}
}

public class Exam06 {
	public static void main(String[] args) {
		Swing06 swing06 = new Swing06();
	}
}
