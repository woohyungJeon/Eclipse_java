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
	JLabel label = new JLabel("시간 출력", JLabel.CENTER);	

	public Clock() {
		setTitle("Clock");
		setSize(300, 100);
		setLocationRelativeTo(null);
		init();
		start();
		setVisible(true);
		
		// 쓰레드 구동
		Thread thread = new Thread(this);
		thread.start();
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("Center", label);		
		label.setFont(new Font("돋움체", Font.BOLD, 24));
		label.setForeground(Color.RED);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// 쓰레드로 동작
	@Override
	public void run() {				
		while(true) {
			Calendar calendar = Calendar.getInstance();
			int hh = calendar.get(calendar.HOUR_OF_DAY);
			int mi = calendar.get(calendar.MINUTE);
			int ss = calendar.get(calendar.SECOND);
			String result = String.format("%02d시 %02d분 %02d초", hh, mi, ss);
			label.setText(result);  // 라벨 객체의 문자열 변경
			
			// 1초 지연
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}




