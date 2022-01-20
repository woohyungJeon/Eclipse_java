import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

class Swing17 extends JFrame {
	Container container = getContentPane();
	// ����
	JLabel label = new JLabel("�̰��� �� �����Դϴ�.");
	JButton button1 = new JButton("Ȯ��");
	JButton button2 = new JButton("���");
	JPanel panelButton = new JPanel();
	
	// ��
	JPanel panel = new JPanel();
	// �� ����
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP,
									JTabbedPane.SCROLL_TAB_LAYOUT);
	JButton tBtn1 = new JButton("ù��° Tab");
	JButton tBtn2 = new JButton("�ι�° Tab");
	JButton tBtn3 = new JButton("����° Tab");
	JButton tBtn4 = new JButton("�׹�° Tab");
	JButton tBtn5 = new JButton("�ټ���° Tab");
	
	public Swing17() {
		setTitle("swing17");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		// JFrame ����
		container.setLayout(new BorderLayout());
		container.add("North", label);
		container.add("Center", panel);
		container.add("South", panelButton);
		
		// panelButton ����
		panelButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panelButton.add(button1);
		panelButton.add(button2);
		
		// �� panel ����
		panel.setLayout(new BorderLayout());
		panel.add("Center", tabbedPane);
		
		// tabbedPane ����
		tabbedPane.add(tBtn1);
		tabbedPane.add(tBtn2);
		tabbedPane.add(tBtn3);
		tabbedPane.add("Title", tBtn4);
		tabbedPane.addTab("Title1", new ImageIcon("img/middle.gif"),
				tBtn5, "���� �������� �ֽ��ϴ�.");
		
		// ù��° �� ����
		tabbedPane.setTitleAt(0, "Test");
		// ����° �� ���� : ��Ȱ��ȭ
		tabbedPane.setEnabledAt(2, false);
		tabbedPane.setBackgroundAt(2, Color.RED);
		
		// �׹�° �� ���� : ����Ű ���� (Alt + 'A')
		tabbedPane.setMnemonicAt(3, (int)'A');
		
		// �ټ���° �� ����
		// ���ڻ��� �Ķ������� ����
		tabbedPane.setForegroundAt(4, Color.BLUE);
		// ù��° ���ڿ� ���ٱ߱�
		tabbedPane.setDisplayedMnemonicIndexAt(4, 0);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam17 {
	public static void main(String[] args) {
		Swing17 swing17 = new Swing17();
	}
}
