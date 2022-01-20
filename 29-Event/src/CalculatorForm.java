import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculatorForm extends Frame implements ActionListener{
	// 선언
	TextField textField = new TextField("0");
	Panel panelNum = new Panel(); // button들을 배치
	Button[] buttonsNum = new Button[16];  // 객체 배열
	Button buttonResult = new Button("=");
	// 계산 관련 변수들
	String[] strs_num = {"7", "8", "9", "/",
						 "4", "5", "6", "*",
						 "1", "2", "3", "-",
						 "0", "+/-", ".", "+"};
	String input = "";			// 입력값 저장
	boolean positive = true;	// 음수, 양수 판단용, true=양수
	double  num1, num2, result;	// 입력값과 계산 결과 저장
	String op;	// 연산자 저장
	
	public CalculatorForm() {
		// Frame 기본 설정
		setTitle("계산기");
		setSize(250, 200);
		setLocation(700, 300);
		
		init();		// 화면 구성
		start();	// 이벤트 설정
		
		setResizable(false); // 화면 크기 고정
		setVisible(true);
	}
	
	private void init() {
		// frame 구성
		setLayout(new BorderLayout());
		add("North", textField);
		add("Center", panelNum);
		add("South", buttonResult);
		
		// panelNum 구성
		panelNum.setLayout(new GridLayout(4, 4, 4, 4));
		panelNum.setBackground(Color.LIGHT_GRAY);
		// 버튼16개 추가
		for(int i=0; i<buttonsNum.length; i++) {
			buttonsNum[i] = new Button(strs_num[i]);
			buttonsNum[i].setForeground(Color.BLUE);  // 글자색 설정
			panelNum.add(buttonsNum[i]);
		}
		// 키보드를 통해서 입력 금지
		textField.setEditable(false);
		buttonResult.setForeground(Color.BLUE);
	}

	private void start() {
		// x버튼
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// 버튼 이벤트 설정
		for(int i=0; i<buttonsNum.length; i++) {
			buttonsNum[i].addActionListener(this);
		}
		buttonResult.addActionListener(this);
	}

	// 이벤트 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonsNum[0]) {		// "7"
			input += "7";
		} else if(e.getSource() == buttonsNum[1]) {	// "8"
			input += "8";
		} else if(e.getSource() == buttonsNum[2]) {	// "9"
			input += "9";
		} else if(e.getSource() == buttonsNum[3]) {	// "/"
			num1 = Double.parseDouble(textField.getText());
			op = "/";
			input="";
			positive = true;
		} else if(e.getSource() == buttonsNum[4]) {	// "4"
			input += "4";
		} else if(e.getSource() == buttonsNum[5]) {	// "5"
			input += "5";
		} else if(e.getSource() == buttonsNum[6]) {	// "6"
			input += "6";
		} else if(e.getSource() == buttonsNum[7]) {	// "*"
			num1 = Double.parseDouble(textField.getText());
			op = "*";
			input="";
			positive = true;
		} else if(e.getSource() == buttonsNum[8]) {	// "1"
			input += "1";
		} else if(e.getSource() == buttonsNum[9]) {	// "2"
			input += "2";
		} else if(e.getSource() == buttonsNum[10]) {// "3"
			input += "3";
		} else if(e.getSource() == buttonsNum[11]) {// "-"
			num1 = Double.parseDouble(textField.getText());
			op = "-";
			input="";
			positive = true;
		} else if(e.getSource() == buttonsNum[12]) {// "0"
			input += "0";
		} else if(e.getSource() == buttonsNum[13]) {// "+/-"
			// 양수/음수 전환
			if(positive) {	// 음수 전환
				positive = false;
				input = "-" + input;
			} else {		// 양수 전환
				positive = true;
				input = input.substring(1);
			}
		} else if(e.getSource() == buttonsNum[14]) {// "."
			// 소수점 추가
			input += ".";
		} else if(e.getSource() == buttonsNum[15]) {// "+"
			num1 = Double.parseDouble(textField.getText());
			op = "+";
			input="";
			positive = true;
		} else if(e.getSource() == buttonResult) {	// "="
			// 연산
			num2 = Double.parseDouble(textField.getText());
			switch (op) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/":
				if(num2 != 0) {
					result = num1 / num2; 
				} else {
					result = 0;
				}
				break;
			}
			textField.setText(String.valueOf(result));
			// 초기화
			input = "";
			num1 = num2 = 0;
			positive = true;
			return;		// 함수 강제 종료, 뒤에 코드는 동작되지 않음
		} 
		// input에 저장된 값을 TextField에 출력
		textField.setText(input);
	}
}
