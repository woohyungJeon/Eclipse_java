import java.awt.*;
import java.awt.event.*;
//�̺�Ʈ ó�� ���4
class Form4 extends Frame {
	// ����
	Button button = new Button("Ȯ��");
	
	public Form4() {
		// Frame ����
		setTitle("Event4");
		setSize(300, 200);
		
		init();
		start();
		
		setVisible(true);
	}

	private void init() {
		setLayout(null);
		button.setBackground(Color.YELLOW);
		button.setBounds(100, 100, 80, 30);
		add(button);
	}

	private void start() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		// ������ â�� x��ư ���� ó�� : ������ ��ü�� �̺�Ʈ �߰�
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});			
	}
}

public class Exam4 {
	public static void main(String[] args) {
		Form4 form4 = new Form4();
	}
}
