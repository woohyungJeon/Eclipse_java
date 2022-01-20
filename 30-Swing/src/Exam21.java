import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Swing21 extends JFrame implements ChangeListener{
	Container container = getContentPane();
	// 선언
	JLabel labelRGB = new JLabel("RGB(0, 0, 0)", JLabel.CENTER);
	JLabel labelRed = new JLabel("RED");
	JLabel labelGreen = new JLabel("GREEN");
	JLabel labelBlue = new JLabel("BLUE");
	
	// jslide
	// JSlider(int orientation, min, max, value)
	JSlider sliderRed = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider sliderGreen = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider sliderBlue = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	
	// panel
	JPanel panel1 = new JPanel();	// 색깔 보여주기 패널
	JPanel panel2 = new JPanel();
	JPanel panelWest = new JPanel();
	JPanel panelCenter = new JPanel();
	
	// 색상 관리 변수
	int r=0, g=0, b=0;
	
	public Swing21() {
		setTitle("swing21");
		setSize(400, 250);
		setLocationRelativeTo(null);
		init();
		start();
		setVisible(true);
	}
	
	private void init() {
		// jframe 구성
		container.setLayout(new BorderLayout());
		container.add("North", labelRGB);
		container.add("Center", panel1);
		container.add("South", panel2);
		
		// labelRGB 설정
		labelRGB.setFont(new Font("돋움체", Font.BOLD, 24));
		// panel1 설정
		panel1.setBackground(Color.BLACK);
		
		// panem2 구성
		panel2.setLayout(new BorderLayout());
		panel2.add("West", panelWest);
		panel2.add("Center", panelCenter);
		
		// panelWest 구성
		panelWest.setLayout(new GridLayout(3, 1));
		panelWest.add(labelRed);
		panelWest.add(labelGreen);
		panelWest.add(labelBlue);
		
		// 글자색 변경
		labelRed.setForeground(Color.RED);
		labelGreen.setForeground(Color.GREEN);
		labelBlue.setForeground(Color.BLUE);
		
		// panelCenter 구성
		panelCenter.setLayout(new GridLayout(3, 1));
		panelCenter.add(sliderRed);
		panelCenter.add(sliderGreen);
		panelCenter.add(sliderBlue);
		
		// slider 설정
		sliderRed.setMajorTickSpacing(50); // 주눈금 간격 지정
		sliderRed.setMinorTickSpacing(5);  // 보조눈금 간격 지정
		sliderRed.setPaintTicks(true); 		// 눈금 보이기
		sliderRed.setPaintLabels(true); 	// 숫자 보이기
		
		sliderGreen.setMajorTickSpacing(50); // 주눈금 간격 지정
		sliderGreen.setMinorTickSpacing(5);  // 보조눈금 간격 지정
		sliderGreen.setPaintTicks(true); 		// 눈금 보이기
		sliderGreen.setPaintLabels(true); 	// 숫자 보이기
		
		sliderBlue.setMajorTickSpacing(50); // 주눈금 간격 지정
		sliderBlue.setMinorTickSpacing(5);  // 보조눈금 간격 지정
		sliderBlue.setPaintTicks(true); 		// 눈금 보이기
		sliderBlue.setPaintLabels(true); 	// 숫자 보이기
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 이벤트 설정
		sliderRed.addChangeListener(this);
		sliderGreen.addChangeListener(this);
		sliderBlue.addChangeListener(this);
	}

	// JSlider의 상태가 바뀌면 호출
	@Override
	public void stateChanged(ChangeEvent e) {
		if(e.getSource() == sliderRed) {
			r = sliderRed.getValue();
		} else if(e.getSource() == sliderGreen) {
			g = sliderGreen.getValue();
		} else if(e.getSource() == sliderBlue) {
			b = sliderBlue.getValue();
		} 
		panel1.setBackground(new Color(r, g, b));
		labelRGB.setText(String.format("RGB(%d, %d, %d)", r, g, b));
	}	
}

public class Exam21 {
	public static void main(String[] args) {
		Swing21 swing21 = new Swing21();
	}
}
