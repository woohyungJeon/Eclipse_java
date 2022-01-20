import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

class Swing10 extends JFrame implements ActionListener{
	Container container = getContentPane();
	// ����
	JButton button1 = new JButton("�� ����");
	JButton button2 = new JButton("���� ����");
	JColorChooser colorChooser = new JColorChooser();
	JFileChooser fileChooser = new JFileChooser("D://");
	
	public Swing10() {
		setTitle("swing10");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new FlowLayout());
		container.add(button1);
		container.add(button2);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// �̺�Ʈ ����
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			execColorChooser();
		} else if(e.getSource() == button2) {
			execFileChooser();
		}
	}	
	// colorChooser ���� �� ����
	void execColorChooser() {
		Color color = colorChooser.showDialog(this, "���� ���� ����", Color.BLUE);
		System.out.println("������ ���� : " + color);
		colorChooser.setColor(color);  // �⺻ ���� ����, â�� ������ ���� ����
	}
	// fileChooser ���� �� ����
	void execFileChooser() {
		fileChooser.setDialogTitle("�ҷ�����");
		fileChooser.setMultiSelectionEnabled(true); // ���� ���� ���� ����
		fileChooser.showDialog(this, "����");
		
		File[] files = fileChooser.getSelectedFiles();
		for(int i=0; i<files.length; i++) {
			System.out.println("���ϸ� : " + files[i]);
		}
	}
}

public class Exam10 {
	public static void main(String[] args) {
		Swing10 swing10 = new Swing10();
	}
}
