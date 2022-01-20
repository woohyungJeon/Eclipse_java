package score2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScoreForm extends Frame implements ActionListener {
	// ����
	TextArea textArea = new TextArea();

	Button buttonInput = new Button("�Է�");
	Button buttonOutput = new Button("���");
	Button buttonNum = new Button("�й��˻�");
	Button buttonName = new Button("�̸��˻�");
	Button buttonSave = new Button("��������");
	Button buttonRead = new Button("�����б�");

	// Label : ���ڿ� 1���� '�����ִ�' Ŭ����
	Label labelNum = new Label("�й�");
	Label labelName = new Label("�̸�");
	Label labelKor = new Label("����");
	Label labelEng = new Label("����");
	Label labelMat = new Label("����");

	// TextField : ���ڿ� 1�� '�Է�' Ŭ����
	TextField textFieldNum = new TextField(10);
	TextField textFieldName = new TextField(10);
	TextField textFieldKor = new TextField(10);
	TextField textFieldEng = new TextField(10);
	TextField textFieldMat = new TextField(10);

	// panel
	Panel panelNum = new Panel();
	Panel panelName = new Panel();
	Panel panelKor = new Panel();
	Panel panelEng = new Panel();
	Panel panelMat = new Panel();
	Panel panelBind = new Panel();
	Panel panelCenter = new Panel();
	Panel panelButton = new Panel();

	// LayOut
	FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT); // ��������
	GridLayout gridLayoutBind = new GridLayout(5, 1);
	GridLayout gridLayoutButton = new GridLayout(1, 6);
	BorderLayout borderLayout = new BorderLayout();
	
	Score score = new ScoreImpl();

	public ScoreForm() {
		setTitle("��������");
		setSize(600, 250);
		setLocation(700, 300);

		init();
		start();

		setVisible(true);
	}

	// ȭ�� ����
	private void init() {
		// Frame����
		setLayout(new BorderLayout());
		add("Center", panelCenter);
		add("South", panelButton);

		// panelButton
		panelButton.setLayout(gridLayoutButton);
		panelButton.add(buttonInput);
		panelButton.add(buttonOutput);
		panelButton.add(buttonNum);
		panelButton.add(buttonName);
		panelButton.add(buttonSave);
		panelButton.add(buttonRead);

		buttonInput.setBackground(Color.yellow);
		buttonOutput.setBackground(Color.yellow);
		buttonNum.setBackground(Color.yellow);
		buttonName.setBackground(Color.yellow);
		buttonSave.setBackground(Color.yellow);
		buttonRead.setBackground(Color.yellow);

		// panelCenter ����
		panelCenter.setLayout(new BorderLayout());
		panelCenter.add("West", panelBind);		
		panelCenter.add("Center", textArea);
		
		// textArea ���� ����
		textArea.setEditable(false);
		
		// panelBind
		panelBind.setLayout(gridLayoutBind);
		panelBind.add(panelNum);
		panelBind.add(panelName);
		panelBind.add(panelKor);
		panelBind.add(panelEng);
		panelBind.add(panelMat);

		// panelNum
		panelNum.setLayout(flowLayout);
		panelNum.add(labelNum);
		panelNum.add(textFieldNum);

		// panelName
		panelName.setLayout(flowLayout);
		panelName.add(labelName);
		panelName.add(textFieldName);

		// panelKor
		panelKor.setLayout(flowLayout);
		panelKor.add(labelKor);
		panelKor.add(textFieldKor);

		// panelEng
		panelEng.setLayout(flowLayout);
		panelEng.add(labelEng);
		panelEng.add(textFieldEng);

		// panelMat
		panelMat.setLayout(flowLayout);
		panelMat.add(labelMat);
		panelMat.add(textFieldMat);
	}

	// �̺�Ʈ ����
	private void start() {
		// x��ư ����
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// button �̺�Ʈ ����
		buttonInput.addActionListener(this);
		buttonOutput.addActionListener(this);
		buttonNum.addActionListener(this);
		buttonName.addActionListener(this);
		buttonSave.addActionListener(this);
		buttonRead.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ScoreImpe�� ��� �Լ��� ����� ���ڿ��� �����ؾ���
		if (e.getSource() == buttonInput) {
			String num = textFieldNum.getText();
			String name = textFieldName.getText();
			String str_kor = textFieldKor.getText();
			String str_eng = textFieldEng.getText();
			String str_mat = textFieldMat.getText();
			// �Է� �˻� : �й�, �̸�
			if(num.equals("") || name.equals("")) {
				textArea.setText("�й��� �̸��� �Է����ּ���.");
				return;  // �Լ� ��������
			}
			// �Է� �˻� : ����, ����, ����
			if(str_kor.equals("") || str_eng.equals("") || str_mat.equals("")) {
				textArea.setText("����, ����, ���� ������ �Է����ּ���.");
				return;  // �Լ� ��������
			}	
			int kor = Integer.parseInt(str_kor);
			int eng = Integer.parseInt(str_eng);
			int mat = Integer.parseInt(str_mat);
			int tot = kor + eng + mat;
			double avg = (double) tot/3;
			
			ScoreVO vo = new ScoreVO();
			vo.setStudentID(num);
			vo.setName(name);
			vo.setKor(kor);
			vo.setEng(eng); 
			vo.setMath(mat); 
			vo.setTotal(tot); 
			vo.setAvg(avg); 
			// ����Ʈ�� ����
			score.input(vo);			
			textArea.setText("�ԷµǾ����ϴ�.");
			
			// ȭ�� �ʱ�ȭ
			textFieldNum.setText("");
			textFieldName.setText("");
			textFieldKor.setText("");
			textFieldEng.setText("");
			textFieldMat.setText("");
		} else if (e.getSource() == buttonOutput) {
			String result = score.output();
			textArea.setText(result);
		} else if (e.getSource() == buttonNum) {
			String num = textFieldNum.getText();			
			if(num.equals("")) {
				textArea.setText("�й��� �Է����ּ���");
				return;		// �Լ� ���� ����
			}
			String result = score.num(num);
			textArea.setText(result);
		} else if (e.getSource() == buttonName) {
			String name = textFieldName.getText();
			if(name.equals("")) {
				textArea.setText("�̸��� �Է����ּ���");
				return;		// �Լ� ���� ����
			}
			String result = score.name(name);
			textArea.setText(result);
		} else if (e.getSource() == buttonSave) {
			String result = score.save("src/score2/Data.txt");
			textArea.setText(result);
		} else if (e.getSource() == buttonRead) {
			String result = score.read("src/score2/Data.txt");
			textArea.setText(result);
		}
	}

}
