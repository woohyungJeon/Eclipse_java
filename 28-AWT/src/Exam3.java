import java.awt.*;

class Form3 extends Frame {
	Button button = new Button("Ȯ��");
	
	public Form3() {
		// Frame ����
		setTitle("�⺻ ȭ��");
		setSize(300, 200);
		
		init(); 	// ȭ�鱸�� �޼ҵ�
		start();	// �̺�Ʈ ���� �޼ҵ�
		
		setVisible(true);
	}
	// ȭ�鱸��
	void init() {
		setLayout(null);
		button.setBackground(Color.YELLOW);
		button.setBounds(100, 100, 80, 30);
		add(button);
	}
	// �̺�Ʈ ����
	void start() {		
	}
}

public class Exam3 {
	public static void main(String[] args) {
		Form3 form3 = new Form3();
	}
}
