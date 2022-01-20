import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;

class Form6 extends Frame implements ActionListener{
	// ����
	// Frame �� ������Ʈ
	BorderLayout borderLayout = new BorderLayout();
	
	// �г� �� �г� �� ������Ʈ
	Panel panel = new Panel();
	GridLayout gridLayout = new GridLayout(1, 2);
	Button button1 = new Button("��ư1");
	Button button2 = new Button("��ư2");
	
	public Form6() {
		// frame �⺻ ����
		setTitle("Layout6");
		setSize(300, 200);
		setLocation(700, 300);
		
		init();
		start();
		
		setVisible(true);
	}
	// ȭ�� ����
	private void init() {
		// frame ����
		setLayout(borderLayout);
		add("South", panel);
		
		// panel ����
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.GREEN);
		
		panel.setLayout(gridLayout);
		panel.add(button1);
		panel.add(button2);
	}
	// �̺�Ʈ ����
	private void start() {
		// x��ư 
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// ��ư �̺�Ʈ
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			System.out.println("��ư1");
		} else if(e.getSource() == button2) {
			System.out.println("��ư2");
		}
	}	
}

public class Exam6 {
	public static void main(String[] args) {
		Form6 form6 = new Form6();
	}
}
