import java.awt.*;
import java.awt.event.*;
//�̺�Ʈ ó�� ���3
class Form3 extends Frame {
	// ����
	Button button = new Button("Ȯ��");
	
	public Form3() {
		// frame ����
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
		add(button);
	}
	// �̺�Ʈ ����
	private void start() {
		// �̺�Ʈ ó�� ��ü ����
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		};
		// ��ư �̺�Ʈ ����
		button.addActionListener(actionListener);
	}
}
public class Exam3 {
	public static void main(String[] args) {
		Form3 form3 = new Form3();
	}
}
