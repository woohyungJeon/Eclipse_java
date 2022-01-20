import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

class Swing17 extends JFrame {
	Container container = getContentPane();
	// 선언
	JLabel label = new JLabel("이것은 탭 패인입니다.");
	JButton button1 = new JButton("확인");
	JButton button2 = new JButton("취소");
	JPanel panelButton = new JPanel();
	
	// 탭
	JPanel panel = new JPanel();
	// 탭 패인
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP,
									JTabbedPane.SCROLL_TAB_LAYOUT);
	JButton tBtn1 = new JButton("첫번째 Tab");
	JButton tBtn2 = new JButton("두번째 Tab");
	JButton tBtn3 = new JButton("세번째 Tab");
	JButton tBtn4 = new JButton("네번째 Tab");
	JButton tBtn5 = new JButton("다섯번째 Tab");
	
	public Swing17() {
		setTitle("swing17");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		// JFrame 구성
		container.setLayout(new BorderLayout());
		container.add("North", label);
		container.add("Center", panel);
		container.add("South", panelButton);
		
		// panelButton 구성
		panelButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panelButton.add(button1);
		panelButton.add(button2);
		
		// 탭 panel 구성
		panel.setLayout(new BorderLayout());
		panel.add("Center", tabbedPane);
		
		// tabbedPane 구성
		tabbedPane.add(tBtn1);
		tabbedPane.add(tBtn2);
		tabbedPane.add(tBtn3);
		tabbedPane.add("Title", tBtn4);
		tabbedPane.addTab("Title1", new ImageIcon("img/middle.gif"),
				tBtn5, "여긴 아이콘이 있습니다.");
		
		// 첫번째 탭 설정
		tabbedPane.setTitleAt(0, "Test");
		// 세번째 탭 설정 : 비활성화
		tabbedPane.setEnabledAt(2, false);
		tabbedPane.setBackgroundAt(2, Color.RED);
		
		// 네번째 탭 설정 : 단축키 설정 (Alt + 'A')
		tabbedPane.setMnemonicAt(3, (int)'A');
		
		// 다섯번째 탭 설정
		// 글자색을 파란색으로 설정
		tabbedPane.setForegroundAt(4, Color.BLUE);
		// 첫번째 글자에 밑줄긋기
		tabbedPane.setDisplayedMnemonicIndexAt(4, 0);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam17 {
	public static void main(String[] args) {
		Swing17 swing17 = new Swing17();
	}
}
