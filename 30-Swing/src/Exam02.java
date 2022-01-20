import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

class Swing02 extends JFrame implements MouseListener {
	// contentPane ������ : ����� �г� ������
	Container container = getContentPane();
	// �̹��� ��ü
	ImageIcon imageIcon1 = new ImageIcon("img/cat.gif");
	ImageIcon imageIcon2 = new ImageIcon("img/pig.gif");
	ImageIcon imageIcon3 = new ImageIcon("img/dog.gif");
	// button
	JButton button1 = new JButton("String");
	JButton button2 = new JButton(imageIcon1);
	JButton button3 = new JButton("Str & Icon", imageIcon1);
	// dialog
	JDialog dialog = new JDialog(this);
	
	public Swing02() {
		// JFrame �⺻ ����
		setTitle("swing02");
		setSize(500, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}
	// ȭ�� ����
	private void init() {
		// jframe ����
		container.setLayout(new FlowLayout());
		container.add(button1);
		container.add(button2);
		container.add(button3);
		
		// button1 ��Ȱ��ȭ
		button1.setEnabled(false);
		// button2 ����Ű ���� (alt + 'a')
		button2.setMnemonic('a');
		// button3 ����
		// text ��ġ ����
		button3.setHorizontalTextPosition(SwingConstants.LEFT);
		button3.setVerticalTextPosition(SwingConstants.TOP);
		// ���콺�� ������ �� �̹��� ����
		button3.setPressedIcon(imageIcon2);
		// ���콺�� �÷��� �� �̹��� ����
		button3.setRolloverIcon(imageIcon3);
	}
	// �̺�Ʈ ����
	private void start() {
		// x��ư
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// button �̺�Ʈ ����
		button2.addMouseListener(this);
		button3.addMouseListener(this);
		// dialog x��ư ����
		dialog.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dialog.dispose(); // ȭ�鿡�� ������Ը� ��
			}
		});
	}

	@Override
	public void mouseClicked(MouseEvent e) { //	������ ���� �� ȣ��	
		if(e.getSource() == button2) {
			dialog.setTitle("��ư2");
			dialog.setLocation(800, 400);
			dialog.setVisible(true);
		} else if(e.getSource() == button3) {
			dialog.setTitle("��ư3 clicked");
			dialog.setLocation(900, 400);
			dialog.setVisible(true);
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {		
	}
	@Override
	public void mouseReleased(MouseEvent e) {		
	}
	@Override
	public void mouseEntered(MouseEvent e) {	
		if(e.getSource() == button3) {
			dialog.setTitle("��ư3 entered");
			dialog.setLocation(800, 500);
			dialog.setVisible(true);
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {		
	}	
}
public class Exam02 {
	public static void main(String[] args) {
		Swing02 swing02 = new Swing02();
	}
}
