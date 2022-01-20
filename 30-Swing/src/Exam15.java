import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Swing15 extends JFrame implements ActionListener{
	Container container = getContentPane();
	// ����
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	
	public Swing15() {
		setTitle("swing15");
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
		container.add(button3);
		container.add(button4);
		container.add(button5);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// �̺�Ʈ ����
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			choose1();
		} else if(e.getSource() == button2) {
			choose2();
		} else if(e.getSource() == button3) {
			choose3();
		} else if(e.getSource() == button4) {
			choose4();
		} else if(e.getSource() == button5) {
			choose5();
		} 
	}

	private void choose1() {
		int result = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?",
				"����", JOptionPane.OK_CANCEL_OPTION, 
				JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("img/cat.gif"));
		System.out.println("result = " + result);
	}
	private void choose2() {
		String[] str = {"AAA", "BBB", "CCC"};
		String result = (String) JOptionPane.showInputDialog(this, 
				"���̵� ? ", "ID", JOptionPane.INFORMATION_MESSAGE,
				new ImageIcon("img/dog.gif"), str, "BBB");
		System.out.println("result = " + result);
	}
	private void choose3() {
		int result = JOptionPane.showInternalConfirmDialog(container, "�����Ͻðڽ��ϱ�?");
		System.out.println("result = " + result);
	}
	private void choose4() {
		String result = JOptionPane.showInternalInputDialog(container, "�̸� : ");
		System.out.println("result = " + result);
		
		// ������ Ȯ�� ����
		if(result != null) { 		// ��� ��ư�� �ƴϸ�
			if(result.equals("")) { // �Է°��� ������
				JOptionPane.showMessageDialog(this, "�Էµ� �̸��� �����ϴ�.", "����",
						JOptionPane.ERROR_MESSAGE);
			}			
		}
	}
	private void choose5() {
		String[] str = {"a", "b", "c", "d", "e", "f"};
		int result = JOptionPane.showOptionDialog(this, "�����ϼ���? ", 
				"���� ����", JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE, 
				new ImageIcon("img/pig.gif"), str, "a");
		System.out.println("result = " + result);
	}	
}
public class Exam15 {
	public static void main(String[] args) {
		Swing15 swing15 = new Swing15();
	}
}
