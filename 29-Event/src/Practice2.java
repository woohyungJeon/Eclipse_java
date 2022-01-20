import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Form7 extends Frame {
	Button button1 = new Button("버튼1");
	Button button2 = new Button("버튼2");

	public Form7() {
		setTitle("Event 클래스 이용");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();

		setVisible(true);
	}

	private void init() {
		setLayout(null);

		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.GREEN);

		button1.setBounds(45, 100, 100, 50);
		button2.setBounds(155, 100, 100, 50);

		add(button1);
		add(button2);
	}

	private void start() {
		/*
		// 방법1
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		button1.addActionListener(actionListener);
		button2.addActionListener(actionListener);
		*/
		
		// 방법2
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});		
	}
}

public class Practice2 {
	public static void main(String[] args) {
		Form7 form7 = new Form7();
	}
}
