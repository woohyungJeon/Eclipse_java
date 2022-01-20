import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

class Swing03 extends JFrame {
	// ����
	Container container = getContentPane();
	JButton button1 = new JButton("Empty");
	JButton button2 = new JButton("Line");
	JButton button3 = new JButton("Etched");
	JButton button4 = new JButton("Bevel");
	JButton button5 = new JButton("SoftBevel");
	JButton button6 = new JButton("Matte");
	JButton button7 = new JButton("Titled");
	JButton button8 = new JButton("Compound");
	
	public Swing03() {
		setTitle("swing03");
		setSize(300, 300);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new GridLayout(4, 2, 3, 3));
		container.add(button1);
		container.add(button2);
		container.add(button3);
		container.add(button4);
		container.add(button5);
		container.add(button6);
		container.add(button7);
		container.add(button8);
		// EmptyBorder : labeló�� ��� ���¸� ������
		// EmptyBorder(top, left, bottom, right)
		// top 		: �׵θ��� ��� ����
		// left 	: �׵θ��� ���� ����
		// bottom 	: �׵θ��� �Ʒ��� ����
		// right 	: �׵θ��� ������ ����
		button1.setBorder(new EmptyBorder(-30, 30, 0, 0));
		
		// LineBorder : ������Ʈ ������ ������ ǥ��
		button2.setBorder(new LineBorder(Color.RED, 3));
		
		// EtchedBorder : ������Ʈ ������ Ȩ ǥ��
		button3.setBorder(new EtchedBorder());
		
		// BevelBorder : ������Ʈ�� �ö���ų� ������ ����� ǥ��
		button4.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		// SoftBevelBorder : BevelBorder�� ���
		button5.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
		
		// MatteBorder : �׵θ��� �β��� ���������� �����Ͽ�, ������ ǥ��
		button6.setBorder(new MatteBorder(5, 10, 15, 20, Color.BLUE));
		
		// TitledBorder : ������Ʈ ������ ������ ǥ��
		button7.setBorder(new TitledBorder("����"));
		
		// CompoundBorder : �ΰ��� ���� ȿ���� ���ÿ� �� �� ����
		BevelBorder bevelBorder = new BevelBorder(BevelBorder.RAISED);
		TitledBorder titledBorder = new TitledBorder("����");
		button8.setBorder(new CompoundBorder(bevelBorder, titledBorder));
		
	}

	private void start() {
		// x��ư
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
public class Exam03 {
	public static void main(String[] args) {
		Swing03 swing03 = new Swing03();
	}
}
