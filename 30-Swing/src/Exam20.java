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
	// 선언
	JSpinner spinner1 = new JSpinner();
	JSpinner spinner2 = new JSpinner();
	JSpinner spinner3 = new JSpinner();
	
	JPanel panel = new JPanel();
	JTextField textField = new JTextField();
	// 1월~12월 설정
	// 방법1
	//DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
	//String[] str = dateFormatSymbols.getMonths();
	// 방법2
	String[] str = {"1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"};
	SpinnerListModel spinnerListModel = new SpinnerListModel(str);
	
	// 현재 날짜 읽어오기
	SpinnerDateModel spinnerDateModel = new SpinnerDateModel();
	
	// 0~100 사이의 숫자값으로, 50을 기본값으로, 2씩 증가 또는 감소
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
		
		// panel 구성
		panel.setLayout(new GridLayout(3, 1));
		panel.add(spinner1);
		panel.add(spinner2);
		panel.add(spinner3);
		
		// spinner1 : 1월~12월
		spinner1.setModel(spinnerListModel);
		// spinner2 : 현재 시스템의 날짜
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
