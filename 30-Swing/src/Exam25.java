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
	// ����
	String[] str = {"1��", "2��", "3��", "4��"};
	// �������� str�迭�� ����, 5������ �����Ͱ� �� ���� ����
	DefaultTableModel tableModel = new DefaultTableModel(str, 5);
	JTable table = new JTable(tableModel);
	JScrollPane scrollPane = new JScrollPane(table);
	
	JLabel label = new JLabel("JTable!!", JLabel.CENTER);
	JButton button1 = new JButton("Ȯ��");
	JButton button2 = new JButton("���");
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
		// table�� �⺻ ���� Ȯ��
		System.out.println("Column Count = " + tableModel.getColumnCount());
		System.out.println("3 Column's name = " + tableModel.getColumnName(2));
		System.out.println("1 Column's Class Name = " + tableModel.getColumnClass(0));
		System.out.println("Row Count = " + tableModel.getRowCount());
		
		// 3�� 3���� ��ġ�� "Test" ���ڿ� �߰�
		tableModel.setValueAt("Test", 2, 2);
		
		// ��, �� �߰�
		tableModel.addColumn("5��");  // �� �߰�
		String[] s = new String[tableModel.getColumnCount()];
		tableModel.addRow(s);	// �� �߰�
		
		// ��ü ��,���� ������ ����
		tableModel.setRowCount(14);
		tableModel.setColumnCount(10);
		
		// ���о����
		String result = (String) tableModel.getValueAt(2, 2);
		System.out.println("result = " + result);
		
		// ����° �࿡ ����
		String[] s2 = {"false", "false", "false", "false", "true"};
		tableModel.insertRow(2, s2);
		
		// ���� ����
		String[] s3 = {"11", "22", "33", "44", "55"};
		tableModel.setColumnIdentifiers(s3);
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", label);
		container.add(scrollPane);
		container.add("South", panel);
		// panel ����
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
