import java.awt.*;
import java.awt.event.*;

class Form5 extends Frame implements ActionListener{
	// ����
	Button button1 = new Button("��ư1");
	Button button2 = new Button("��ư2");
	Button button3 = new Button("��ư3");
	FlowLayout flowLayout = new FlowLayout();
	// GridLayout(���� ��, ���� ��, ���� ����, ���� ����)
	GridLayout gridLayout = new GridLayout(2, 2, 5, 5);
	BorderLayout borderLayout = new BorderLayout();
	
	public Form5() {
		setTitle("Layout5");
		setSize(300, 200);
		setLocation(700, 300);
		
		//init1();
		//init2();
		init3();
		start();
		
		setVisible(true);
	}
	// ȭ�� ����
	private void init1() {
		// ������Ʈ�� ���� ũ���� ���ʿ��� ���������� ������� ��ġ��
		setLayout(flowLayout);
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.GREEN);
		button3.setBackground(Color.CYAN);
		
		add(button1);
		add(button2);
		add(button3);
	}
	private void init2() {
		// ���ڸ������ ������Ʈ�� ��ġ��
		setLayout(gridLayout);
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.GREEN);
		button3.setBackground(Color.CYAN);
		
		add(button1);
		add(button2);
		add(button3);
	}
	
	private void init3() {
		// ������Ʈ�� �������� �߾����� ��ġ��Ŵ
		// East, West, South, North, Center
		setLayout(borderLayout);
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.GREEN);
		button3.setBackground(Color.CYAN);
		
		add("North", button1);
		add("Center", button2);
		add("South", button3);
	}
	// �̺�Ʈ ����
	private void start() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		// x��ư �̺�Ʈ ó��
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Dialog dialog = new Dialog(this);
		dialog.setLocation(800, 400);
		dialog.setSize(100, 40);
		
		if(e.getSource() == button1) {
			dialog.setTitle("��ư1");
			dialog.setVisible(true);
		} else if(e.getSource() == button2) {
			dialog.setTitle("��ư2");
			dialog.setVisible(true);
		} else if(e.getSource() == button3) {
			dialog.setTitle("��ư3");
			dialog.setVisible(true);
		}
		// dialog�� x��ư �̺�ư ó��
		dialog.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dialog.dispose(); 				
			}
		});
	}	
}

public class Exam5 {
	public static void main(String[] args) {
		Form5 form5 = new Form5();
	}
}
