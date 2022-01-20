import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Swing26 extends JFrame implements ActionListener{
	Container container = getContentPane();
	// ����
	JButton button1 = new JButton("��ư1");
	JButton button2 = new JButton("��ư2");
	
	public Swing26() {
		setTitle("swing26");
		setSize(300, 200);
		setLocationRelativeTo(null);
		init();
		start();
		setVisible(true);
	}
	
	private void init() {
		container.setLayout(new BorderLayout());
		container.add("Center", button1);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// �̺�Ʈ ����
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			container.remove(button1); 			// ���ֱ�
			container.invalidate(); 			// ��ȿȭ
			// button2�� ����
			container.add("Center", button2);	// �߰�
			container.revalidate(); 			// ��ȿȭ
			container.repaint(); 				// ȭ�� ����
		} else if(e.getSource() == button2) {
			container.remove(button2); 			// ���ֱ�
			container.invalidate(); 			// ��ȿȭ
			// button2�� ����
			container.add("Center", button1);	// �߰�
			container.revalidate(); 			// ��ȿȭ
			container.repaint(); 				// ȭ�� ����
		}
	}	
}

public class Exam26 {
	public static void main(String[] args) {
		Swing26 swing26 = new Swing26();
	}
}
