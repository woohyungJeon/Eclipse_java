import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

class Swing01 extends JFrame {
	// 선언
	ImageIcon imageIcon = new ImageIcon("img/Bird.gif");
	
	public Swing01() {
		// JFrame 기본 설정
		setTitle("swing01");
		setSize(300, 200);
		setIconImage(imageIcon.getImage());
		
		// 한가운데로 위치 지정
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension1 = toolkit.getScreenSize();	// 모니터 크기 읽어오기
		Dimension dimension2 = getSize();
		int x = (int)(dimension1.getWidth()/2 - dimension2.getWidth()/2);
		int y = (int)(dimension1.getHeight()/2 - dimension2.getHeight()/2);
		setLocation(x, y);
		
		init();
		start();
		
		setVisible(true);
	}
	// 화면 구성
	private void init() {
		
	}
	// 이벤트 설정
	private void start() {
		// x버튼 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
public class Exam01 {
	public static void main(String[] args) {
		Swing01 swing01 = new Swing01();
	}
}
