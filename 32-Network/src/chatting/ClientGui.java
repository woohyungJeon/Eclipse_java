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
	// 선언
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane(textArea);
	JTextField textField = new JTextField();
	// 통신용
	Socket socket;
	PrintWriter out;
	BufferedReader in;	

	public ClientGui(String ip, int port) {
		setTitle("채팅창");
		setSize(550, 400);
		setLocationRelativeTo(null);
		init();
		start();
		setVisible(true);

		initNet(ip, port); // 통신 초기화
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("Center", scrollPane);
		container.add("South", textField);
		// textArea 편집 금지
		textArea.setEditable(false);
		textArea.setBackground(new Color(240, 240, 240));
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 이벤트 설정
		textField.addActionListener(this);
	}	

	// 통신 초기화
	private void initNet(String ip, int port) {
		try {
			socket = new Socket(ip, port); // 서버에 접속 시도
			// input, output 객체 생성
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
		} catch (UnknownHostException e) {
			System.out.println("IP 주소가 잘못되었습니다.");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("접속 실패");
			//e.printStackTrace();
		} 
		// 쓰레드 시작
		Thread thread = new Thread(this);
		thread.start();
	}

	// 이벤트 처리
	// => textField에 문자열을 입력하고 엔터를 치면, 문자열을 서버로 전송
	@Override
	public void actionPerformed(ActionEvent e) {		
		String str = textField.getText();
		out.println(str);  // 서버쪽으로 문자열 전송
		textField.setText("");
		//System.out.println("str = " + str);
	}

	// 서버로부터 응답으로 전달된 문자열을 읽어서, textArea에 출력하기
	@Override
	public void run() {
		String str;
		
		while(true) {
			try {
				str = in.readLine();		// 서버에서 전달된 문자열 읽기
				textArea.append(str + "\n");// textArea에 문자열 추가
			} catch (IOException e) {
				e.printStackTrace();
			}  
		}
	}
}
