package score2;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ScoreForm extends JFrame implements ActionListener {
	Container container = getContentPane();

	// 선언
	// Button
	JButton buttonInput = new JButton("입력");
	JButton buttonOutput = new JButton("출력");
	JButton buttonId = new JButton("학번검색");
	JButton buttonName = new JButton("이름검색");
	JButton buttonwrite = new JButton("파일저장");
	JButton buttonread = new JButton("파일읽기");

	// Label
	JLabel labelId = new JLabel("학번");
	JLabel labelName = new JLabel("이름");
	JLabel labelKor = new JLabel("국어");
	JLabel labelEng = new JLabel("영어");
	JLabel labelMath = new JLabel("수학");

	// TextField
	JTextField textFieldId = new JTextField(10);
	JTextField textFieldName = new JTextField(10);
	JTextField textFieldKor = new JTextField(10);
	JTextField textFieldEng = new JTextField(10);
	JTextField textFieldMath = new JTextField(10);

	// Panel
	JPanel panelId = new JPanel();
	JPanel panelName = new JPanel();
	JPanel panelKor = new JPanel();
	JPanel panelEng = new JPanel();
	JPanel panelMath = new JPanel();
	JPanel panelBind = new JPanel();
	JPanel panelButton = new JPanel();
	JPanel panelMain = new JPanel();

	// Layout
	BorderLayout borderLayout = new BorderLayout();
	FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
	GridLayout gridLayoutMain = new GridLayout(1, 2);
	GridLayout gridLayoutButton = new GridLayout(1, 6, 2, 2);
	GridLayout gridLayoutBind = new GridLayout(5, 1);

	// TextArea
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane(textArea);

	ScoreImpl score = new ScoreImpl();

	public ScoreForm() {
		setTitle("성적 관리");
		setSize(700, 300);
		setLocation(700, 300);
		
		init();
		start();
		
		setVisible(true);
	}
	
	
	private void init() {
		container.setLayout(borderLayout);
		container.add("South",panelButton);
		container.add("Center",panelMain);
		
		// Main
		panelMain.setLayout(new BorderLayout());
		panelMain.add("West", panelBind);
		panelMain.add("Center", scrollPane);
		
		// Button
		panelButton.setLayout(gridLayoutButton);
		panelButton.add(buttonInput);
		panelButton.add(buttonOutput);
		panelButton.add(buttonId);
		panelButton.add(buttonName);
		panelButton.add(buttonwrite);
		panelButton.add(buttonread);
		
		buttonInput.setBackground(Color.YELLOW);
		buttonOutput.setBackground(Color.YELLOW);
		buttonId.setBackground(Color.YELLOW);
		buttonName.setBackground(Color.YELLOW);
		buttonwrite.setBackground(Color.YELLOW);
		buttonread.setBackground(Color.YELLOW);
		
		// Bind
		
		panelBind.setLayout(gridLayoutBind);
		panelBind.add(panelId);
		panelBind.add(panelName);
		panelBind.add(panelKor);
		panelBind.add(panelEng);
		panelBind.add(panelMath);
		
		// ID
		panelId.setLayout(flowLayout);
		panelId.add(labelId);
		panelId.add(textFieldId);
		
		// Name
		panelName.setLayout(flowLayout);
		panelName.add(labelName);
		panelName.add(textFieldName);
		
		// Kor
		panelKor.setLayout(flowLayout);
		panelKor.add(labelKor);
		panelKor.add(textFieldKor);
		
		// Eng
		panelEng.setLayout(flowLayout);
		panelEng.add(labelEng);
		panelEng.add(textFieldEng);
		
		// Math
		panelMath.setLayout(flowLayout);
		panelMath.add(labelMath);
		panelMath.add(textFieldMath);	
	}
	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		buttonInput.addActionListener(this);
		buttonOutput.addActionListener(this);
		buttonId.addActionListener(this);
		buttonName.addActionListener(this);
		buttonwrite.addActionListener(this);
		buttonread.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonInput) {
			String id = textFieldId.getText();
			String name = textFieldName.getText();
			String str_kor = textFieldKor.getText();
			String str_eng = textFieldEng.getText();
			String str_math = textFieldMath.getText();
			if(id.equals("") || name.equals("")) {
				textArea.setText("학번과 이름을 적어주세요");
				return;
			}
			if(str_kor.equals("") || str_eng.equals("") || str_math.equals("")) {
				textArea.setText("국어, 영어, 수학점수를 적어주세요");
				return;
			}
			int kor = Integer.parseInt(str_kor);
			int eng = Integer.parseInt(str_eng);
			int math = Integer.parseInt(str_math);
			int tot = kor + eng + math;
			double avg = (double)tot / 3;
			
			ScoreVO vo = new ScoreVO();
			vo.setStudentID(id);
			vo.setName(name);
			vo.setKor(kor);
			vo.setEng(eng);
			vo.setMath(math);
			vo.setTotal(tot);
			vo.setAvg(avg);
			
			score.input(vo);
			textArea.setText("입력되었습니다!");
			// 화면 초기화
			textFieldId.setText("");
			textFieldName.setText("");
			textFieldKor.setText("");
			textFieldEng.setText("");
			textFieldMath.setText("");
		}
		
		else if(e.getSource() == buttonOutput) {
			String result = score.print();
			textArea.setText(result);
		}
		
		else if(e.getSource() == buttonId) {
			String id = textFieldId.getText();
			if(id.equals("")) {
				textArea.setText("학번을 적어주세요");
				return;
			}
			String result = score.searchStudentID(id);
			textArea.setText(result);
		}
		else if(e.getSource() == buttonName) {
			String name = textFieldName.getText();
			if(name.equals("")) {
				textArea.setText("이름을 입력해주세요");
				return;
			}
			String result = score.searchName(name);
			textArea.setText(result);
		}
		else if(e.getSource() == buttonwrite) {
			String result = score.write("Data.txt");
			textArea.setText(result);
		}
		else if(e.getSource() == buttonread) {
			String result = score.read("Data.txt");
			textArea.setText(result);
		}
	}

	

}
