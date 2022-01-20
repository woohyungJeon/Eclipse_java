import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Sub9 extends Frame implements ActionListener {
	// 선언
	Label label1 = new Label("결과 출력");
	Label label2 = new Label("입력 : ", Label.RIGHT);
	TextArea textArea = new TextArea();
	TextField textField = new TextField();
	Panel panel = new Panel();
	
	public Sub9() {
		// Frame 기본 설정
		setTitle("Sub9");
		setSize(300, 200);
		setLocation(700, 300);
		
		init();
		start();
		
		setVisible(true);
	}
	
	private void init() {
		// frame 구성
		setLayout(new BorderLayout());
		add("North", label1);
		add("Center", textArea);
		add("South", panel);
		// panel 구성
		panel.setLayout(new BorderLayout());
		panel.add("West", label2);
		panel.add("Center", textField);
		// textArea 쓰기 금지
		textArea.setEditable(false);
	}

	private void start() {
		// x버튼
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// textField 이벤트 설정
		textField.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = textField.getText();
		
		// textArea의 기존 문자열 읽어오기
		if(!textArea.getText().equals("")) {
			str = textArea.getText() + "\n" + str;
		}
		textArea.setText(str);
		// textArea 마지막 줄 표시, 커서 표시 위치 지정
		textArea.setCaretPosition(textArea.getText().length());
		
		textField.setText(""); 
	}	
}
public class Exam9 {
	public static void main(String[] args) {
		Sub9 sub9 = new Sub9();
	}
}
