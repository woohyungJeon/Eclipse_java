import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.border.LineBorder;

class Swing07 extends JFrame {
	Container container = getContentPane();
	// ����
	// �޴�
	JMenuBar menuBar = new JMenuBar();
	// ���� �޴�
	JMenu menuFile = new JMenu("����");
	JMenuItem fNew = new JMenuItem("������");
	ImageIcon img1 = new ImageIcon("img/cat.gif");
	JMenuItem fOpen = new JMenuItem(img1);
	ImageIcon img2 = new ImageIcon("img/dog.gif");
	JMenuItem fExit = new JMenuItem("����", img2);
	// ���� �޴�
	JMenu menuEdit = new JMenu("����");
	JMenu menuEditSize = new JMenu("ũ��");
	JRadioButtonMenuItem es10 = new JRadioButtonMenuItem("10");
	JRadioButtonMenuItem es20 = new JRadioButtonMenuItem("20");
	JRadioButtonMenuItem es30 = new JRadioButtonMenuItem("30");
	ButtonGroup buttonGroup = new ButtonGroup();
	
	JMenu menuEditColor = new JMenu("����");
	JCheckBoxMenuItem ecRed = new JCheckBoxMenuItem("RED");
	JCheckBoxMenuItem ecGreen = new JCheckBoxMenuItem("GREEN");
	JCheckBoxMenuItem ecBlue = new JCheckBoxMenuItem("BLUE");
	
	// ���� �޴�
	JMenu menuHelp = new JMenu("����");
	
	public Swing07() {
		setTitle("swing07");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}
	private void init() {
		// JFrame�� �޴��� �߰��ϱ�
		setJMenuBar(menuBar);
		
		// ���� �޴� �߰�
		menuBar.add(menuFile);
		menuFile.add(fNew);
		menuFile.addSeparator();
		menuFile.add(fOpen);
		menuFile.addSeparator();
		menuFile.add(fExit);
		// �ش� �޴��� ������ ��, �ڵ����� ���õǴ� ���� ����
		fExit.setArmed(true);
		
		// ���� �޴� �߰�
		menuBar.add(menuEdit);
		menuEdit.setBorder(new LineBorder(Color.RED, 3));
		
		menuEdit.add(menuEditSize);
		menuEdit.addSeparator();
		menuEdit.add(menuEditColor);
		
		// ũ�⿡ �׸� �߰�
		menuEditSize.add(es10);
		menuEditSize.add(es20);
		menuEditSize.add(es30);
		// ������ư ����
		buttonGroup.add(es10);
		buttonGroup.add(es20);
		buttonGroup.add(es30);
		
		// ���� �׸� �߰�
		menuEditColor.add(ecRed);
		menuEditColor.add(ecGreen);
		menuEditColor.add(ecBlue);
		
		// ���� �޴� �߰�
		menuBar.add(menuHelp);
	}
	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// fExit �̺�Ʈ ����
		fExit.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}

public class Exam07 {
	public static void main(String[] args) {
		Swing07 swing07 = new Swing07();
	}
}
