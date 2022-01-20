import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Swing220 extends JFrame implements ActionListener {
	Container container = getContentPane();

	// 선언
	JToolBar toolBar = new JToolBar(JToolBar.HORIZONTAL);
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);

	// Panel
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();

	// Tool Button
	JButton buttontool1 = new JButton("1번");
	JButton buttontool2 = new JButton(new ImageIcon("img/middle.gif"));
	JButton buttontool3 = new JButton("3번");
	JButton buttontool4 = new JButton("4번");

	public Swing220() {
		setTitle("swing");
		setSize(400, 300);
		setLocationRelativeTo(null);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		// JFrame 구성
		container.setLayout(new BorderLayout());
		container.add("North", toolBar);
		container.add("Center", tabbedPane);

		// ToolBar 구성
		toolBar.setRollover(true); // 마우스를 올렸을 때 활성화
		toolBar.add(buttontool1);
		toolBar.addSeparator();
		toolBar.add(buttontool2);
		toolBar.addSeparator();
		toolBar.add(buttontool3);
		toolBar.add(buttontool4);

		// TabbedPane 구성
		tabbedPane.add(panel1);
		tabbedPane.add(panel2);
		tabbedPane.add(panel3);
		tabbedPane.add(panel4);

		// PanelButton 색상 설정
		panel1.setBackground(Color.black);
		panel2.setBackground(Color.red);
		panel3.setBackground(Color.green);
		panel4.setBackground(Color.blue);

		// 첫번째 TabbedPane 설정
		tabbedPane.setTitleAt(0, "1번 패널");
		// 두번째 TabbedPane 설정
		tabbedPane.setTitleAt(1, "2번 패널");
		// 세번째 TabbedPane 설정
		tabbedPane.setTitleAt(2, "3번 패널");
		// 네번째 TabbedPane 설정
		tabbedPane.setTitleAt(3, "4번 패널");
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 버튼 이벤트 설정
		buttontool1.addActionListener(this);
		buttontool2.addActionListener(this);
		buttontool3.addActionListener(this);
		buttontool4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttontool1) {
			tabbedPane.setSelectedIndex(0);
		} else if(e.getSource() == buttontool2) {
			tabbedPane.setSelectedIndex(1);
		} else if(e.getSource() == buttontool3) {
			tabbedPane.setSelectedIndex(2);
		} else if(e.getSource() == buttontool4) {
			tabbedPane.setSelectedIndex(3);
		} 
	}
}

public class Practice2 {
	public static void main(String[] args) {
		Swing220 swing220 = new Swing220();
	}
}