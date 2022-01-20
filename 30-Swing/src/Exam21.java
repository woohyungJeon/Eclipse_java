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
	// ����
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
	JPanel panel1 = new JPanel();	// ���� �����ֱ� �г�
	JPanel panel2 = new JPanel();
	JPanel panelWest = new JPanel();
	JPanel panelCenter = new JPanel();
	
	// ���� ���� ����
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
		// jframe ����
		container.setLayout(new BorderLayout());
		container.add("North", labelRGB);
		container.add("Center", panel1);
		container.add("South", panel2);
		
		// labelRGB ����
		labelRGB.setFont(new Font("����ü", Font.BOLD, 24));
		// panel1 ����
		panel1.setBackground(Color.BLACK);
		
		// panem2 ����
		panel2.setLayout(new BorderLayout());
		panel2.add("West", panelWest);
		panel2.add("Center", panelCenter);
		
		// panelWest ����
		panelWest.setLayout(new GridLayout(3, 1));
		panelWest.add(labelRed);
		panelWest.add(labelGreen);
		panelWest.add(labelBlue);
		
		// ���ڻ� ����
		labelRed.setForeground(Color.RED);
		labelGreen.setForeground(Color.GREEN);
		labelBlue.setForeground(Color.BLUE);
		
		// panelCenter ����
		panelCenter.setLayout(new GridLayout(3, 1));
		panelCenter.add(sliderRed);
		panelCenter.add(sliderGreen);
		panelCenter.add(sliderBlue);
		
		// slider ����
		sliderRed.setMajorTickSpacing(50); // �ִ��� ���� ����
		sliderRed.setMinorTickSpacing(5);  // �������� ���� ����
		sliderRed.setPaintTicks(true); 		// ���� ���̱�
		sliderRed.setPaintLabels(true); 	// ���� ���̱�
		
		sliderGreen.setMajorTickSpacing(50); // �ִ��� ���� ����
		sliderGreen.setMinorTickSpacing(5);  // �������� ���� ����
		sliderGreen.setPaintTicks(true); 		// ���� ���̱�
		sliderGreen.setPaintLabels(true); 	// ���� ���̱�
		
		sliderBlue.setMajorTickSpacing(50); // �ִ��� ���� ����
		sliderBlue.setMinorTickSpacing(5);  // �������� ���� ����
		sliderBlue.setPaintTicks(true); 		// ���� ���̱�
		sliderBlue.setPaintLabels(true); 	// ���� ���̱�
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// �̺�Ʈ ����
		sliderRed.addChangeListener(this);
		sliderGreen.addChangeListener(this);
		sliderBlue.addChangeListener(this);
	}

	// JSlider�� ���°� �ٲ�� ȣ��
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
