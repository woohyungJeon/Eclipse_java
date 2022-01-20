import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class Swing16 extends JFrame {
	Container container = getContentPane();
	// ����
	JLabel label = new JLabel("�޸� �Ͻʽÿ�.");
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane(textArea);
	// �˾�â
	JPopupMenu popupMenu = new JPopupMenu();
	JMenuItem menuItem1 = new JMenuItem("����");
	JMenuItem menuItem2 = new JMenuItem("�ٿ��ֱ�");
	JMenuItem menuItem3 = new JMenuItem("�߶󳻱�");
	
	public Swing16() {
		setTitle("swing16");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", label);
		container.add("Center", scrollPane);
		// �˾�â ����
		popupMenu.add(menuItem1);
		popupMenu.addSeparator();
		popupMenu.add(menuItem2);
		popupMenu.addSeparator();
		popupMenu.add(menuItem3);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// textarea �̺�Ʈ ���� : ������ ���콺 ��ư Ŭ�� �̺�Ʈ ó��
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(e.isPopupTrigger()) {
					popupMenu.show(textArea, e.getX(), e.getY());
				}
			}
		});
		// �˾� �޴� �̺�Ʈ ó��
		menuItem1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.copy();  // �����ϱ�
			}
		});
		
		menuItem2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.paste();	// �ٿ��ֱ�
			}
		});
		
		menuItem3.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.cut();		// �߶󳻱�
			}
		});
	}
}

public class Exam16 {
	public static void main(String[] args) {
		Swing16 swing16 = new Swing16();
	}
}
