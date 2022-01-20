import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

class Swing12 extends JFrame {
	Container container = getContentPane();
	// 선언
	String[] str = {"AAA", "BBB", "CCC", "DDD", "EEE"};
	JComboBox<String> comboBox = new JComboBox<String>(str);
	
	public Swing12() {
		setTitle("swing12");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new FlowLayout());
		container.add(comboBox);
		// combobox에 항목 추가
		comboBox.addItem("FFF");
		// 항목 수정 가능 설정
		comboBox.setEditable(true);
		// 펼쳐지는 행의 수 설정
		comboBox.setMaximumRowCount(3);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// comboBox 이벤트 처리
		comboBox.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox.getSelectedItem());
			}
		});
	}
}

public class Exam12 {
	public static void main(String[] args) {
		Swing12 swing12 = new Swing12();
	}
}
