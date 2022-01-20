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
	// 선언
	TextArea textArea = new TextArea();

	Button buttonInput = new Button("입력");
	Button buttonOutput = new Button("출력");
	Button buttonNum = new Button("학번검색");
	Button buttonName = new Button("이름검색");
	Button buttonSave = new Button("파일저장");
	Button buttonRead = new Button("파일읽기");

	// Label : 문자열 1개를 '보여주는' 클래스
	Label labelNum = new Label("학번");
	Label labelName = new Label("이름");
	Label labelKor = new Label("국어");
	Label labelEng = new Label("영어");
	Label labelMat = new Label("수학");

	// TextField : 문자열 1개 '입력' 클래스
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
	FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT); // 왼쪽정렬
	GridLayout gridLayoutBind = new GridLayout(5, 1);
	GridLayout gridLayoutButton = new GridLayout(1, 6);
	BorderLayout borderLayout = new BorderLayout();
	
	Score score = new ScoreImpl();

	public ScoreForm() {
		setTitle("성적관리");
		setSize(600, 250);
		setLocation(700, 300);

		init();
		start();

		setVisible(true);
	}

	// 화면 구성
	private void init() {
		// Frame구성
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

		// panelCenter 구성
		panelCenter.setLayout(new BorderLayout());
		panelCenter.add("West", panelBind);		
		panelCenter.add("Center", textArea);
		
		// textArea 쓰기 금지
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

	// 이벤트 설정
	private void start() {
		// x버튼 설정
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// button 이벤트 설정
		buttonInput.addActionListener(this);
		buttonOutput.addActionListener(this);
		buttonNum.addActionListener(this);
		buttonName.addActionListener(this);
		buttonSave.addActionListener(this);
		buttonRead.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ScoreImpe의 모든 함수는 결과를 문자열로 리턴해야함
		if (e.getSource() == buttonInput) {
			String num = textFieldNum.getText();
			String name = textFieldName.getText();
			String str_kor = textFieldKor.getText();
			String str_eng = textFieldEng.getText();
			String str_mat = textFieldMat.getText();
			// 입력 검사 : 학번, 이름
			if(num.equals("") || name.equals("")) {
				textArea.setText("학번과 이름을 입력해주세요.");
				return;  // 함수 강제종료
			}
			// 입력 검사 : 국어, 영어, 수학
			if(str_kor.equals("") || str_eng.equals("") || str_mat.equals("")) {
				textArea.setText("국어, 영어, 수학 점수를 입력해주세요.");
				return;  // 함수 강제종료
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
			// 리스트에 저장
			score.input(vo);			
			textArea.setText("입력되었습니다.");
			
			// 화면 초기화
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
				textArea.setText("학번을 입력해주세요");
				return;		// 함수 강제 종료
			}
			String result = score.num(num);
			textArea.setText(result);
		} else if (e.getSource() == buttonName) {
			String name = textFieldName.getText();
			if(name.equals("")) {
				textArea.setText("이름을 입력해주세요");
				return;		// 함수 강제 종료
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
