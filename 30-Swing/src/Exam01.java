import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

class Swing01 extends JFrame {
	// ����
	ImageIcon imageIcon = new ImageIcon("img/Bird.gif");
	
	public Swing01() {
		// JFrame �⺻ ����
		setTitle("swing01");
		setSize(300, 200);
		setIconImage(imageIcon.getImage());
		
		// �Ѱ���� ��ġ ����
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension1 = toolkit.getScreenSize();	// ����� ũ�� �о����
		Dimension dimension2 = getSize();
		int x = (int)(dimension1.getWidth()/2 - dimension2.getWidth()/2);
		int y = (int)(dimension1.getHeight()/2 - dimension2.getHeight()/2);
		setLocation(x, y);
		
		init();
		start();
		
		setVisible(true);
	}
	// ȭ�� ����
	private void init() {
		
	}
	// �̺�Ʈ ����
	private void start() {
		// x��ư ����
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
public class Exam01 {
	public static void main(String[] args) {
		Swing01 swing01 = new Swing01();
	}
}
