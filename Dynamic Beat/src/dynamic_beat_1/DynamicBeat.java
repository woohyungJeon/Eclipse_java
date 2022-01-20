package dynamic_beat_1;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import javax.swing.JFrame;
import com.sun.tools.javac.Main;

public class DynamicBeat extends JFrame{
	
	private Image screenImage;  //������۸� �̹��� �߰�
	private Graphics screenGraphic; //������۸� �̹��� �߰�	
	
	private Image introBackground; //������ �̹����� ���� ��ü	
	
	public DynamicBeat() {
		setTitle("Dynamic Beat"); //title����
		setSize(dynamic_beat_1.Main.SCREEN_WIDTH, dynamic_beat_1.Main.SCREEN_HEIGHT); //������ ����
		setResizable(false); // ����ڰ� ���Ƿ� ũ�� ���� �Ұ���
		setLocationRelativeTo(null); // â�� �� �߾ӿ� ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�ݵ�� �ʿ��� ����â ���������� ���α׷��� ��ü ����
		setVisible(true); //�츮 ���� ���������� ����ϰ� ���� �⺻���� false
		
		introBackground = new ImageIcon(dynamic_beat_1.Main.class.getResource("../images/introBackground.jpg")).getImage(); //�̹����� �����ͼ� �װ��� �̹��� �ν��Ͻ��� introbackgounrd�� �ʱ�ȭ
	}
	
	//�̰� ���� ��ӵ� �޼ҵ�
	public void paint(Graphics g) {
		screenImage = createImage(dynamic_beat_1.Main.SCREEN_WIDTH, dynamic_beat_1.Main.SCREEN_HEIGHT); //1280x720��ŭ�� �̹����� ���� ��ũ�� �̹����� ����
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic); // ��ũ�� �׷��ȿ� � �̹����� �׷���
		g.drawImage(screenImage, 0, 0, null); //��ũ�� �̹��� 0,0�� �׷���		
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}

}
