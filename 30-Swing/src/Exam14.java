import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JList;

class Swing14 extends JFrame {
	Container container = getContentPane();
	String[] str = {"AAA", "BBB", "CCC", "DDD", "FFF"};
	JList<String> list = new JList<String>(str);
	
	public Swing14() {
		setTitle("swing14");
		setSize(300, 200);
		setLocation(700, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new FlowLayout());
		container.add(list);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 오른쪽 마우스 클릭시 이벤트 처리
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(e.isPopupTrigger()) { // 오른쪽 마우스 버튼
					List<String> list_str = list.getSelectedValuesList();
					for(int i=0; i<list_str.size(); i++) {
						System.out.println(list_str.get(i));
					}					
				}
			}
		});
	}	
}

public class Exam14 {
	public static void main(String[] args) {
		Swing14 swing14 = new Swing14();
	}
}
