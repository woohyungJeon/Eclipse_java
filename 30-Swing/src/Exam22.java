import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

class Swing22 extends JFrame implements ActionListener, Runnable {
	Container container = getContentPane();
	// ����
	JLabel label = new JLabel("Progress Bar");
	JProgressBar progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);

	JButton buttonStart = new JButton("����");
	JButton buttonEnd = new JButton("����");
	JPanel panel = new JPanel();
	// ���� ���� ���� ����
	boolean progress = true;
	int num = 0; // 0~100

	public Swing22() {
		setTitle("swing22");
		setSize(300, 200);
		setLocationRelativeTo(null);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", label);
		container.add("Center", progressBar);
		container.add("South", panel);
		
		// panel ����
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel.add(buttonStart);
		panel.add(buttonEnd);
		
		// progressBar ����
		progressBar.setStringPainted(true);  // ���ڿ� ��� ����
		progressBar.setString("0%");
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// button �̺�Ʈ ����
		buttonStart.addActionListener(this);
		buttonEnd.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonStart) {	// ������ ���� ǥ��
			progress = true;
			buttonStart.setEnabled(false);
			buttonEnd.setEnabled(true);
			
			new Thread(this).start();  // ������ ����
			//Thread thread = new Thread(this);
			//thread.start();
		} else if(e.getSource() == buttonEnd) {	// ���� ���� ǥ��
			progress = false;
			buttonStart.setEnabled(true);
			buttonEnd.setEnabled(false);
		}
	}

	@Override
	public void run() {
		if(num == 100) num = 0;
		
		for(int i=num; i<=100; i++) {
			if(!progress) break;  // buttonEnd�� ������ thread ����
			
			// 50ms ����
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			num = i;
			progressBar.setValue(i);  // ���� ���� ǥ��
			progressBar.setString(i + "%");
		}
		
		buttonStart.setEnabled(true);
		buttonEnd.setEnabled(false);
	}
}

public class Exam22 {
	public static void main(String[] args) {
		Swing22 swing22 = new Swing22();
	}
}
