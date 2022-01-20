import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.border.LineBorder;

class Swing07 extends JFrame {
	Container container = getContentPane();
	// 선언
	// 메뉴
	JMenuBar menuBar = new JMenuBar();
	// 파일 메뉴
	JMenu menuFile = new JMenu("파일");
	JMenuItem fNew = new JMenuItem("새파일");
	ImageIcon img1 = new ImageIcon("img/cat.gif");
	JMenuItem fOpen = new JMenuItem(img1);
	ImageIcon img2 = new ImageIcon("img/dog.gif");
	JMenuItem fExit = new JMenuItem("종료", img2);
	// 수정 메뉴
	JMenu menuEdit = new JMenu("수정");
	JMenu menuEditSize = new JMenu("크기");
	JRadioButtonMenuItem es10 = new JRadioButtonMenuItem("10");
	JRadioButtonMenuItem es20 = new JRadioButtonMenuItem("20");
	JRadioButtonMenuItem es30 = new JRadioButtonMenuItem("30");
	ButtonGroup buttonGroup = new ButtonGroup();
	
	JMenu menuEditColor = new JMenu("색상");
	JCheckBoxMenuItem ecRed = new JCheckBoxMenuItem("RED");
	JCheckBoxMenuItem ecGreen = new JCheckBoxMenuItem("GREEN");
	JCheckBoxMenuItem ecBlue = new JCheckBoxMenuItem("BLUE");
	
	// 도움말 메뉴
	JMenu menuHelp = new JMenu("도움말");
	
	public Swing07() {
		setTitle("swing07");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}
	private void init() {
		// JFrame에 메뉴바 추가하기
		setJMenuBar(menuBar);
		
		// 파일 메뉴 추가
		menuBar.add(menuFile);
		menuFile.add(fNew);
		menuFile.addSeparator();
		menuFile.add(fOpen);
		menuFile.addSeparator();
		menuFile.add(fExit);
		// 해당 메뉴가 열렸을 때, 자동으로 선택되는 위지 지정
		fExit.setArmed(true);
		
		// 수정 메뉴 추가
		menuBar.add(menuEdit);
		menuEdit.setBorder(new LineBorder(Color.RED, 3));
		
		menuEdit.add(menuEditSize);
		menuEdit.addSeparator();
		menuEdit.add(menuEditColor);
		
		// 크기에 항목 추가
		menuEditSize.add(es10);
		menuEditSize.add(es20);
		menuEditSize.add(es30);
		// 라디오버튼 묶기
		buttonGroup.add(es10);
		buttonGroup.add(es20);
		buttonGroup.add(es30);
		
		// 색상에 항목 추가
		menuEditColor.add(ecRed);
		menuEditColor.add(ecGreen);
		menuEditColor.add(ecBlue);
		
		// 도움말 메뉴 추가
		menuBar.add(menuHelp);
	}
	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// fExit 이벤트 설정
		fExit.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}

public class Exam07 {
	public static void main(String[] args) {
		Swing07 swing07 = new Swing07();
	}
}
