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
	// 선언
	JLabel label = new JLabel("Progress Bar");
	JProgressBar progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);

	JButton buttonStart = new JButton("시작");
	JButton buttonEnd = new JButton("멈춤");
	JPanel panel = new JPanel();
	// 진행 상태 관리 변수
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
		
		// panel 구성
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel.add(buttonStart);
		panel.add(buttonEnd);
		
		// progressBar 설정
		progressBar.setStringPainted(true);  // 문자열 출력 설정
		progressBar.setString("0%");
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// button 이벤트 설정
		buttonStart.addActionListener(this);
		buttonEnd.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonStart) {	// 진행중 상태 표시
			progress = true;
			buttonStart.setEnabled(false);
			buttonEnd.setEnabled(true);
			
			new Thread(this).start();  // 쓰레드 구동
			//Thread thread = new Thread(this);
			//thread.start();
		} else if(e.getSource() == buttonEnd) {	// 멈춤 상태 표시
			progress = false;
			buttonStart.setEnabled(true);
			buttonEnd.setEnabled(false);
		}
	}

	@Override
	public void run() {
		if(num == 100) num = 0;
		
		for(int i=num; i<=100; i++) {
			if(!progress) break;  // buttonEnd을 누르면 thread 종료
			
			// 50ms 지연
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			num = i;
			progressBar.setValue(i);  // 진행 상태 표시
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
