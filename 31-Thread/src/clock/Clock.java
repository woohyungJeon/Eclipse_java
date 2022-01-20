package clock;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Clock extends JFrame implements Runnable{
	Container container = getContentPane();
	JLabel label = new JLabel("�ð� ���", JLabel.CENTER);	

	public Clock() {
		setTitle("Clock");
		setSize(300, 100);
		setLocationRelativeTo(null);
		init();
		start();
		setVisible(true);
		
		// ������ ����
		Thread thread = new Thread(this);
		thread.start();
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("Center", label);		
		label.setFont(new Font("����ü", Font.BOLD, 24));
		label.setForeground(Color.RED);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// ������� ����
	@Override
	public void run() {				
		while(true) {
			Calendar calendar = Calendar.getInstance();
			int hh = calendar.get(calendar.HOUR_OF_DAY);
			int mi = calendar.get(calendar.MINUTE);
			int ss = calendar.get(calendar.SECOND);
			String result = String.format("%02d�� %02d�� %02d��", hh, mi, ss);
			label.setText(result);  // �� ��ü�� ���ڿ� ����
			
			// 1�� ����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}




