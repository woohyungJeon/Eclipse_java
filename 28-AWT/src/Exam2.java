import java.awt.*;

public class Exam2 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(300, 200);
		f.setTitle("�⺻ȭ��");
		
		// Button ��ü ����
		Button button = new Button("Ȯ��");
		// ���� ����
		button.setBackground(Color.YELLOW);
		// ��ư�� ��ġ�� ũ�� ����
		button.setBounds(100, 100, 80, 30);
		// �����ӿ� �߰�
		f.setLayout(null);
		f.add(button);
		
		// ������â ���̱�
		f.setVisible(true);
	}
}
