import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.text.DateFormatSymbols;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

class Swing20 extends JFrame {
	Container container = getContentPane();
	// ����
	JSpinner spinner1 = new JSpinner();
	JSpinner spinner2 = new JSpinner();
	JSpinner spinner3 = new JSpinner();
	
	JPanel panel = new JPanel();
	JTextField textField = new JTextField();
	// 1��~12�� ����
	// ���1
	//DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
	//String[] str = dateFormatSymbols.getMonths();
	// ���2
	String[] str = {"1��","2��","3��","4��","5��","6��","7��","8��","9��","10��","11��","12��"};
	SpinnerListModel spinnerListModel = new SpinnerListModel(str);
	
	// ���� ��¥ �о����
	SpinnerDateModel spinnerDateModel = new SpinnerDateModel();
	
	// 0~100 ������ ���ڰ�����, 50�� �⺻������, 2�� ���� �Ǵ� ����
	SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(50, 0, 100, 2);
	
	public Swing20() {
		setTitle("swing20");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", panel);
		
		// panel ����
		panel.setLayout(new GridLayout(3, 1));
		panel.add(spinner1);
		panel.add(spinner2);
		panel.add(spinner3);
		
		// spinner1 : 1��~12��
		spinner1.setModel(spinnerListModel);
		// spinner2 : ���� �ý����� ��¥
		spinner2.setModel(spinnerDateModel);
		// spinner3 : 0~100
		spinner3.setModel(spinnerNumberModel);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		System.out.println(spinner1.getValue());
		System.out.println(spinner2.getValue());
		System.out.println(spinner3.getValue());
	}
}

public class Exam20 {
	public static void main(String[] args) {
		Swing20 swing20 = new Swing20();
	}
}
