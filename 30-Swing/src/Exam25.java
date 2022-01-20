import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class Swing25 extends JFrame {
	Container container = getContentPane();
	// 선언
	String[] str = {"1번", "2번", "3번", "4번"};
	// 제목으로 str배열을 배정, 5행으로 데이터가 들어갈 영역 설정
	DefaultTableModel tableModel = new DefaultTableModel(str, 5);
	JTable table = new JTable(tableModel);
	JScrollPane scrollPane = new JScrollPane(table);
	
	JLabel label = new JLabel("JTable!!", JLabel.CENTER);
	JButton button1 = new JButton("확인");
	JButton button2 = new JButton("취소");
	JPanel panel = new JPanel();
	
	public Swing25() {
		setTitle("swing25");
		setSize(300, 300);
		setLocationRelativeTo(null);
		init();
		start();
		setVisible(true);
		
		changeContent();
	}

	private void changeContent() {
		// table의 기본 정보 확인
		System.out.println("Column Count = " + tableModel.getColumnCount());
		System.out.println("3 Column's name = " + tableModel.getColumnName(2));
		System.out.println("1 Column's Class Name = " + tableModel.getColumnClass(0));
		System.out.println("Row Count = " + tableModel.getRowCount());
		
		// 3행 3열의 위치에 "Test" 문자열 추가
		tableModel.setValueAt("Test", 2, 2);
		
		// 열, 행 추가
		tableModel.addColumn("5번");  // 열 추가
		String[] s = new String[tableModel.getColumnCount()];
		tableModel.addRow(s);	// 행 추가
		
		// 전체 행,열의 갯수를 설정
		tableModel.setRowCount(14);
		tableModel.setColumnCount(10);
		
		// 값읽어오기
		String result = (String) tableModel.getValueAt(2, 2);
		System.out.println("result = " + result);
		
		// 세번째 행에 삽입
		String[] s2 = {"false", "false", "false", "false", "true"};
		tableModel.insertRow(2, s2);
		
		// 제목 변경
		String[] s3 = {"11", "22", "33", "44", "55"};
		tableModel.setColumnIdentifiers(s3);
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", label);
		container.add(scrollPane);
		container.add("South", panel);
		// panel 구성
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel.add(button1);
		panel.add(button2);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam25 {
	public static void main(String[] args) {
		Swing25 swing25 = new Swing25();
	}
}
