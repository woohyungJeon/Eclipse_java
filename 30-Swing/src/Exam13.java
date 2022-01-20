import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.beans.PropertyVetoException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

class Swing13 extends JFrame {
	Container container = getContentPane();
	// ����
	// JInternalFrame(title, resizable, closable, maximizable, iconifiable)
	// title 		: the String to display in the title bar
	// resizable 	: if true, the internal frame can be resized
	// closable 	: if true, the internal frame can be closed
	// maximizable 	: if true, the internal frame can be maximized
	// iconifiable 	: if true, the internal frame can be iconified
	JInternalFrame internalFrame = new JInternalFrame("����", true, true, true, true);
	JPanel panel = new JPanel();
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	
	public Swing13() {
		setTitle("swing13");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("West", button1);
		container.add("Center", panel);
		container.add("South", button2);
		// panel ����
		panel.setLayout(new BorderLayout());
		panel.add("Center", internalFrame);
		// internalFrame ����
		Container interContainer = internalFrame.getContentPane();
		interContainer.setLayout(new FlowLayout());
		interContainer.add(new JButton("3"));
		interContainer.add(new JButton("4"));
		internalFrame.setFrameIcon(new ImageIcon("img/cat.gif"));
		
		try {
			internalFrame.setMaximum(true);	// �⺻������ �ִ� ũ��� ������ ����
		} catch (Exception e) {
			e.printStackTrace();
		}
		internalFrame.setIconifiable(true);		
		
		internalFrame.setVisible(true);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam13 {
	public static void main(String[] args) {
		Swing13 swing13 = new Swing13();
	}
}
