
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Form extends Frame implements ActionListener {
	// 선언
	Button button1 = new Button("버튼1");
	Button button2 = new Button("버튼2");
	//FlowLayout flowLayout = new FlowLayout();

	public Form() {
		// Frame 설정
		setTitle("Event 클래스 이용");
		setSize(300, 200);
		setLocation(700, 300);

		init();
		start();

		setVisible(true);
	}

	// 화면 구성
	private void init() {
		setLayout(null);
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.GREEN);
		button1.setBounds(45, 100, 100, 50);
		button2.setBounds(155, 100, 100, 50);

		add(button1); // Frame에 추가
		add(button2); // Frame에 추가
	}

	// 이벤트 설정
	private void start() {
		button1.addActionListener(this);
		button2.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			System.exit(0);
		} else if (e.getSource() == button2) {
			System.exit(0);
		}
	}
}

public class Practice1 {
	public static void main(String[] args) {
		Form form = new Form();
	}
}
