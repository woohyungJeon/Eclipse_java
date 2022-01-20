import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

class Swing04 extends JFrame {
	Container container = getContentPane();
	// label
	JLabel ltop = new JLabel("BorderLayout");
	JLabel lbottom = new JLabel("");
	// panel
	JPanel pnorth = new JPanel();
	JPanel psouth = new JPanel();
	JPanel pwest = new JPanel();
	JPanel peast = new JPanel();
	JPanel pcenter = new JPanel();
	// button
	JButton bt1 = new JButton("Add");
	JButton bt2 = new JButton("인사과");
	JButton bt3 = new JButton("총무과");
	JButton bt4 = new JButton("사무과");
	JButton bt5 = new JButton("경리과");
	JButton bt6 = new JButton("컴퓨터");
	JButton bt7 = new JButton("핸드폰");
	JButton bt8 = new JButton("안경");
	
	public Swing04() {
		setTitle("Swing04");
		setSize(500, 300);
		setLocation(700, 300);

		init();
		start();

		setVisible(true);
	}

	private void init() {
		// jframe 구성
		setLayout(new BorderLayout());
		add("South", psouth);
		add("North", pnorth);
		add("West", pwest);
		add("East", peast);
		add("Center", pcenter);
		
		// south
		psouth.setBorder(new TitledBorder("South"));
		psouth.add(lbottom);

		// north
		pnorth.setBorder(new TitledBorder("Title Label"));
		pnorth.add(ltop);
		// font 설정
		ltop.setFont(new Font("굴림체", Font.BOLD, 20));

		// west
		pwest.setBorder(new TitledBorder("West"));
		pwest.add(bt1);
		
		// east
		peast.setBorder(new TitledBorder("East"));
		peast.setLayout(new GridLayout(3, 1));
		peast.add(bt6);
		peast.add(bt7);
		peast.add(bt8);
		
		// center
		pcenter.setBorder(new TitledBorder("Center"));
		pcenter.setLayout(new FlowLayout());
		pcenter.add(bt2);
		pcenter.add(bt3);
		pcenter.add(bt4);
		pcenter.add(bt5);
	}

	private void start() {
		// x버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam04 {
	public static void main(String[] args) {
		Swing04 s4 = new Swing04();
	}
}
