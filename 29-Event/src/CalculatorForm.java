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
	// ����
	TextField textField = new TextField("0");
	Panel panelNum = new Panel(); // button���� ��ġ
	Button[] buttonsNum = new Button[16];  // ��ü �迭
	Button buttonResult = new Button("=");
	// ��� ���� ������
	String[] strs_num = {"7", "8", "9", "/",
						 "4", "5", "6", "*",
						 "1", "2", "3", "-",
						 "0", "+/-", ".", "+"};
	String input = "";			// �Է°� ����
	boolean positive = true;	// ����, ��� �Ǵܿ�, true=���
	double  num1, num2, result;	// �Է°��� ��� ��� ����
	String op;	// ������ ����
	
	public CalculatorForm() {
		// Frame �⺻ ����
		setTitle("����");
		setSize(250, 200);
		setLocation(700, 300);
		
		init();		// ȭ�� ����
		start();	// �̺�Ʈ ����
		
		setResizable(false); // ȭ�� ũ�� ����
		setVisible(true);
	}
	
	private void init() {
		// frame ����
		setLayout(new BorderLayout());
		add("North", textField);
		add("Center", panelNum);
		add("South", buttonResult);
		
		// panelNum ����
		panelNum.setLayout(new GridLayout(4, 4, 4, 4));
		panelNum.setBackground(Color.LIGHT_GRAY);
		// ��ư16�� �߰�
		for(int i=0; i<buttonsNum.length; i++) {
			buttonsNum[i] = new Button(strs_num[i]);
			buttonsNum[i].setForeground(Color.BLUE);  // ���ڻ� ����
			panelNum.add(buttonsNum[i]);
		}
		// Ű���带 ���ؼ� �Է� ����
		textField.setEditable(false);
		buttonResult.setForeground(Color.BLUE);
	}

	private void start() {
		// x��ư
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// ��ư �̺�Ʈ ����
		for(int i=0; i<buttonsNum.length; i++) {
			buttonsNum[i].addActionListener(this);
		}
		buttonResult.addActionListener(this);
	}

	// �̺�Ʈ ó��
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
			// ���/���� ��ȯ
			if(positive) {	// ���� ��ȯ
				positive = false;
				input = "-" + input;
			} else {		// ��� ��ȯ
				positive = true;
				input = input.substring(1);
			}
		} else if(e.getSource() == buttonsNum[14]) {// "."
			// �Ҽ��� �߰�
			input += ".";
		} else if(e.getSource() == buttonsNum[15]) {// "+"
			num1 = Double.parseDouble(textField.getText());
			op = "+";
			input="";
			positive = true;
		} else if(e.getSource() == buttonResult) {	// "="
			// ����
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
			// �ʱ�ȭ
			input = "";
			num1 = num2 = 0;
			positive = true;
			return;		// �Լ� ���� ����, �ڿ� �ڵ�� ���۵��� ����
		} 
		// input�� ����� ���� TextField�� ���
		textField.setText(input);
	}
}
