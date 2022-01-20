package dynamic_beat_1;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import javax.swing.JFrame;
import com.sun.tools.javac.Main;

public class DynamicBeat extends JFrame{
	
	private Image screenImage;  //더블버퍼링 이미지 추가
	private Graphics screenGraphic; //더블버퍼링 이미지 추가	
	
	private Image introBackground; //가져온 이미지를 담을 객체	
	
	public DynamicBeat() {
		setTitle("Dynamic Beat"); //title설정
		setSize(dynamic_beat_1.Main.SCREEN_WIDTH, dynamic_beat_1.Main.SCREEN_HEIGHT); //사이즈 설정
		setResizable(false); // 사용자가 임의로 크기 변경 불가능
		setLocationRelativeTo(null); // 창이 정 중앙에 뜸
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //반드시 필요함 게임창 종료했을때 프로그램이 전체 종료
		setVisible(true); //우리 눈에 정상적으로 출력하게 만듬 기본값은 false
		
		introBackground = new ImageIcon(dynamic_beat_1.Main.class.getResource("../images/introBackground.jpg")).getImage(); //이미지를 가져와서 그것의 이미지 인스턴스를 introbackgounrd에 초기화
	}
	
	//이건 보통 약속된 메소드
	public void paint(Graphics g) {
		screenImage = createImage(dynamic_beat_1.Main.SCREEN_WIDTH, dynamic_beat_1.Main.SCREEN_HEIGHT); //1280x720만큼의 이미지를 만들어서 스크린 이미제어 넣음
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic); // 스크린 그래픽에 어떤 이미지를 그려줌
		g.drawImage(screenImage, 0, 0, null); //스크린 이미즐 0,0에 그려줌		
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}

}
