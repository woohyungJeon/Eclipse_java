import java.awt.*;
import java.awt.event.*;

// �̺�Ʈ ó�� ���1
class ActionDefine implements ActionListener {
	// ���콺 Ŭ��, enter Ű�� ������ ȣ���
	@Override
	public void actionPerformed(ActionEvent e) {
		// ���α׷� ����
		System.exit(0);
	}	
}
// ȭ�鸸��� + �̺�Ʈ ����
class Form1 extends Frame {
	// ����
	Button button = new Button("Ȯ��");
	ActionDefine ad = new ActionDefine();
	
	public Form1() {
		// Frame ����
		setTitle("Event");
		setSize(300, 200);
		init();		// ȭ�鱸��
		start();	// �̺�Ʈ ����
		
		setVisible(true);
	}
	void init() {
		setLayout(null);
		button.setBackground(Color.YELLOW);
		button.setBounds(100, 100, 80, 30);
		add(button);
	}
	void start() {
		// ��ư�� Ŭ���ϸ� ���۵� �̺�Ʈ ó�� ��ü ����
		button.addActionListener(ad);
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Form1 form1 = new Form1();
	}
}
