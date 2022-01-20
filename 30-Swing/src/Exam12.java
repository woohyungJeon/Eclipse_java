import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

class Swing12 extends JFrame {
	Container container = getContentPane();
	// ����
	String[] str = {"AAA", "BBB", "CCC", "DDD", "EEE"};
	JComboBox<String> comboBox = new JComboBox<String>(str);
	
	public Swing12() {
		setTitle("swing12");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new FlowLayout());
		container.add(comboBox);
		// combobox�� �׸� �߰�
		comboBox.addItem("FFF");
		// �׸� ���� ���� ����
		comboBox.setEditable(true);
		// �������� ���� �� ����
		comboBox.setMaximumRowCount(3);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// comboBox �̺�Ʈ ó��
		comboBox.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox.getSelectedItem());
			}
		});
	}
}

public class Exam12 {
	public static void main(String[] args) {
		Swing12 swing12 = new Swing12();
	}
}
