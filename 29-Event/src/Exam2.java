import java.awt.*;
import java.awt.event.*;

//�̺�Ʈ ó�� ���2
class Form2 extends Frame implements ActionListener {
	// ����
	Button button = new Button("Ȯ��");
	
	public Form2() {
		// Frame ����
		setTitle("Event");
		setSize(300, 200);
		
		init();
		start();
		
		setVisible(true);
	}
	// ȭ�� ����
	private void init() {
		setLayout(null);
		button.setBackground(Color.YELLOW);
		button.setBounds(100, 100, 80, 30);
		add(button);	// Frame�� �߰�
	}
	// �̺�Ʈ ����
	private void start() {
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}	
}
public class Exam2 {
	public static void main(String[] args) {
		Form2 form2 = new Form2();
	}
}
