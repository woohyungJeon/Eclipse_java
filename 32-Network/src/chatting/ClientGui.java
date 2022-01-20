package chatting;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGui extends JFrame implements ActionListener, Runnable {
	Container container = getContentPane();
	// ����
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane(textArea);
	JTextField textField = new JTextField();
	// ��ſ�
	Socket socket;
	PrintWriter out;
	BufferedReader in;	

	public ClientGui(String ip, int port) {
		setTitle("ä��â");
		setSize(550, 400);
		setLocationRelativeTo(null);
		init();
		start();
		setVisible(true);

		initNet(ip, port); // ��� �ʱ�ȭ
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("Center", scrollPane);
		container.add("South", textField);
		// textArea ���� ����
		textArea.setEditable(false);
		textArea.setBackground(new Color(240, 240, 240));
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// �̺�Ʈ ����
		textField.addActionListener(this);
	}	

	// ��� �ʱ�ȭ
	private void initNet(String ip, int port) {
		try {
			socket = new Socket(ip, port); // ������ ���� �õ�
			// input, output ��ü ����
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
		} catch (UnknownHostException e) {
			System.out.println("IP �ּҰ� �߸��Ǿ����ϴ�.");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� ����");
			//e.printStackTrace();
		} 
		// ������ ����
		Thread thread = new Thread(this);
		thread.start();
	}

	// �̺�Ʈ ó��
	// => textField�� ���ڿ��� �Է��ϰ� ���͸� ġ��, ���ڿ��� ������ ����
	@Override
	public void actionPerformed(ActionEvent e) {		
		String str = textField.getText();
		out.println(str);  // ���������� ���ڿ� ����
		textField.setText("");
		//System.out.println("str = " + str);
	}

	// �����κ��� �������� ���޵� ���ڿ��� �о, textArea�� ����ϱ�
	@Override
	public void run() {
		String str;
		
		while(true) {
			try {
				str = in.readLine();		// �������� ���޵� ���ڿ� �б�
				textArea.append(str + "\n");// textArea�� ���ڿ� �߰�
			} catch (IOException e) {
				e.printStackTrace();
			}  
		}
	}
}
