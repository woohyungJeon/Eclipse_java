
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

class Sub12 extends Frame{
	// ����
	Label label1 = new Label("��� ���");
	Label label2 = new Label("�Է� : ", Label.RIGHT);
	TextArea textArea = new TextArea();
	TextField textField = new TextField();
	Panel panel = new Panel();
	
	public Sub12() {
		// Frame �⺻ ����
		setTitle("Sub12");
		setSize(300, 200);
		setLocation(700, 300);
		
		init();
		start();
		
		setVisible(true);
	}
	
	private void init() {
		// frame ����
		setLayout(new BorderLayout());
		add("North", label1);
		add("Center", textArea);
		add("South", panel);
		// panel ����
		panel.setLayout(new BorderLayout());
		panel.add("West", label2);
		panel.add("Center", textField);
		// textArea ���� ����
		textArea.setEditable(false);
	}

	private void start() {
		// x��ư
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		textField.addActionListener(e -> {
			String str = textField.getText();
			
			// textArea�� ���� ���ڿ� �о����
			if(!textArea.getText().equals("")) {
				str = textArea.getText() + "\n" + str;
			}
			textArea.setText(str);
			// textArea ������ �� ǥ��, Ŀ�� ǥ�� ��ġ ����
			textArea.setCaretPosition(textArea.getText().length());
			
			textField.setText("");
		});
		
		/*
		// textField �̺�Ʈ ����1 : �͸� Ŭ���� 
		textField.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = textField.getText();
				
				// textArea�� ���� ���ڿ� �о����
				if(!textArea.getText().equals("")) {
					str = textArea.getText() + "\n" + str;
				}
				textArea.setText(str);
				// textArea ������ �� ǥ��, Ŀ�� ǥ�� ��ġ ����
				textArea.setCaretPosition(textArea.getText().length());
				
				textField.setText(""); 
			}
		});
		*/
	}
}
public class Exam12 {
	public static void main(String[] args) {
		Sub12 sub12 = new Sub12();
	}
}

