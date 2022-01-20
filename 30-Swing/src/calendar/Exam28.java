package calendar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Swing28 extends JFrame implements ActionListener {
	Container container = getContentPane();
	// ����
	JPanel panel1 = new JPanel();  	// North
	JPanel panel2 = new JPanel();	// Center
	
	JButton buttonBefore = new JButton("Before");
	JButton buttonAfter = new JButton("After");
	JLabel label = new JLabel("���");
	
	JButton[] buttons = new JButton[49];
	String[] dayNames = {"��", "��", "ȭ", "��", "��", "��", "��"};
	// HCalendar ��ü ����
	HCalendar hCalendar = new HCalendar(buttons);
	
	public Swing28() {
		setTitle("����޷�");
		setSize(550, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		init();
		start();
		setVisible(true);
	}
	
	private void init() {
        container.setLayout(new BorderLayout());
        container.add("North", panel1);
        container.add("Center", panel2);
        // North : panel1
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel1.add(buttonBefore);
        panel1.add(label);        
        panel1.add(buttonAfter);
        
        label.setFont(new Font("Gothic", Font.BOLD, 20));
        buttonBefore.setFont(new Font("Gothic", Font.BOLD, 20));
        buttonAfter.setFont(new Font("Gothic", Font.BOLD, 20));

        // Center : panel2
        panel2.setLayout(new GridLayout(7, 7, 5, 5));
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            panel2.add(buttons[i]);
            buttons[i].setFont(new Font("Gothic", Font.BOLD, 24));
            buttons[i].setBackground(Color.WHITE);
            
            if(i<7) {
            	buttons[i].setText(dayNames[i]);
            }
            
            if (i % 7 == 0) {			// �Ͽ��� ����            
                buttons[i].setForeground(Color.red);
            } else if (i % 7 == 6) {	// ����� ����            
                buttons[i].setForeground(Color.blue);
            }
        } 
        
        // ��¥ ���
        label.setText(hCalendar.getCalText());
        hCalendar.calSet();
    }


	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// �̺�Ʈ ����
		buttonBefore.addActionListener(this);
		buttonAfter.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonBefore) {			// 1����
			hCalendar.allInit(-1);
			label.setText(hCalendar.getCalText());
		} else if(e.getSource() == buttonAfter) {	// 1����
			hCalendar.allInit(1);
			label.setText(hCalendar.getCalText());
		}
	}	
}
public class Exam28 {
	public static void main(String[] args) {
		Swing28 swing28 = new Swing28();
	}
}
