import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

class Swing02 extends JFrame implements MouseListener {
	// contentPane 얻어오기 : 사용할 패널 얻어오기
	Container container = getContentPane();
	// 이미지 객체
	ImageIcon imageIcon1 = new ImageIcon("img/cat.gif");
	ImageIcon imageIcon2 = new ImageIcon("img/pig.gif");
	ImageIcon imageIcon3 = new ImageIcon("img/dog.gif");
	// button
	JButton button1 = new JButton("String");
	JButton button2 = new JButton(imageIcon1);
	JButton button3 = new JButton("Str & Icon", imageIcon1);
	// dialog
	JDialog dialog = new JDialog(this);
	
	public Swing02() {
		// JFrame 기본 설정
		setTitle("swing02");
		setSize(500, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}
	// 화면 구성
	private void init() {
		// jframe 구성
		container.setLayout(new FlowLayout());
		container.add(button1);
		container.add(button2);
		container.add(button3);
		
		// button1 비활성화
		button1.setEnabled(false);
		// button2 단축키 지정 (alt + 'a')
		button2.setMnemonic('a');
		// button3 설정
		// text 위치 지정
		button3.setHorizontalTextPosition(SwingConstants.LEFT);
		button3.setVerticalTextPosition(SwingConstants.TOP);
		// 마우스로 눌렀을 때 이미지 설정
		button3.setPressedIcon(imageIcon2);
		// 마우스를 올렸을 때 이미지 설정
		button3.setRolloverIcon(imageIcon3);
	}
	// 이벤트 설정
	private void start() {
		// x버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// button 이벤트 설정
		button2.addMouseListener(this);
		button3.addMouseListener(this);
		// dialog x버튼 설정
		dialog.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dialog.dispose(); // 화면에서 사라지게만 함
			}
		});
	}

	@Override
	public void mouseClicked(MouseEvent e) { //	눌렀다 뗏을 때 호출	
		if(e.getSource() == button2) {
			dialog.setTitle("버튼2");
			dialog.setLocation(800, 400);
			dialog.setVisible(true);
		} else if(e.getSource() == button3) {
			dialog.setTitle("버튼3 clicked");
			dialog.setLocation(900, 400);
			dialog.setVisible(true);
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {		
	}
	@Override
	public void mouseReleased(MouseEvent e) {		
	}
	@Override
	public void mouseEntered(MouseEvent e) {	
		if(e.getSource() == button3) {
			dialog.setTitle("버튼3 entered");
			dialog.setLocation(800, 500);
			dialog.setVisible(true);
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {		
	}	
}
public class Exam02 {
	public static void main(String[] args) {
		Swing02 swing02 = new Swing02();
	}
}
