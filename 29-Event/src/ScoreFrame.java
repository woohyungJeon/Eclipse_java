import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScoreFrame extends Frame implements ActionListener{
	// ����
	Button buttonInput = new Button("Ȯ��");
	Button buttonCancel = new Button("���");
	// Label : ���ڿ� 1���� �����ִ� Ŭ����
	Label labelKor = new Label("����");
	Label labelEng = new Label("����");
	Label labelTot = new Label(" ���� : ");
	Label labelAvg = new Label(" ��� : ");
	// TextField : ���ڿ� 1�� �Է� Ŭ����
	TextField textFieldKor = new TextField(25);
	TextField textFieldEng = new TextField(25);
	// Panel
	Panel panelKor = new Panel();
	Panel panelEng = new Panel();
	Panel panelBind = new Panel();
	Panel panelButton = new Panel();
	// Layout
	FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
	GridLayout gridLayoutBind = new GridLayout(4, 1);
	GridLayout gridLayoutButton = new GridLayout(1, 2);
	BorderLayout borderLayout = new BorderLayout();
	
	public ScoreFrame() {
		setTitle("���� ����");
		setSize(300, 200);
		setLocation(700, 300);
		
		init();
		start();
		
		setVisible(true);
	}
	
	private void init() {
		// Frame ����
		setLayout(borderLayout);
		add("Center", panelBind);
		add("South", panelButton);
		// panelButton
		panelButton.setLayout(gridLayoutButton);		
		panelButton.add(buttonInput);
		panelButton.add(buttonCancel);
		
		buttonInput.setBackground(Color.YELLOW);
		buttonCancel.setBackground(Color.YELLOW);
		
		// panelBind
		panelBind.setLayout(gridLayoutBind);
		panelBind.add(panelKor);
		panelBind.add(panelEng);
		panelBind.add(labelTot);
		panelBind.add(labelAvg);
		
		// panelKor
		panelKor.setLayout(flowLayout);
		panelKor.add(labelKor);
		panelKor.add(textFieldKor);
		// panelEng
		panelEng.setLayout(flowLayout);
		panelEng.add(labelEng);
		panelEng.add(textFieldEng);
	}

	private void start() {
		// x��ư
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// button �̺�Ʈ ����
		buttonInput.addActionListener(this);
		buttonCancel.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonInput) {
			int kor = Integer.parseInt(textFieldKor.getText());
			int eng = Integer.parseInt(textFieldEng.getText());
			int tot = kor + eng;
			double avg = (double)tot / 2;
			
			labelTot.setText(labelTot.getText() + tot);
			labelAvg.setText(labelAvg.getText() + avg);
		} else if(e.getSource() == buttonCancel) {
			textFieldKor.setText("");
			textFieldEng.setText("");
			labelTot.setText(" ���� : ");
			labelAvg.setText(" ��� : ");
		}
	}
}
