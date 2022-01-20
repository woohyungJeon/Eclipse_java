package calendar;

import java.util.Calendar;

import javax.swing.JButton;

// ���� ��� �� ���
public class HCalendar {
	JButton[] buttons;
	Calendar calendar;
	int year, month;

	public HCalendar(JButton[] buttons) {
		this.buttons = buttons;
		calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH) + 1;
	}

	// Label�� ����� ���ڿ�
	public String getCalText() {
		return year + "�� " + month + "��";
	}

	// ��ư�� ��¥ ����ϱ�
	// => �״� 1���� ���ϼ� ���ϱ�
	public void calSet() {
		// ����� ����
		calendar.set(year, month-1, 1);
		// ���ϼ� ���ϱ�
		// => �� : 1, ��:7
		// �迭�� 0���� �����̱� ������, (���ϼ� - 1)�� ���
		int firstDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		for(int i=1; i<=calendar.getActualMaximum(Calendar.DATE); i++) {
			// buttons[0]~[6] : ��~�� ���ڿ��� ���
			// �״��� 1���� buttons[6 + (���ϼ�-1) + i] => buttons[6 + firstDay + i]
			buttons[6 + firstDay + i].setText(String.valueOf(i));
		}
		
	}

	// �޷¿� ���ο� ����� ���� �׸���
	// => before, after ��ư Ŭ���� ����
	public void allInit(int gap) {
		// ��ư�� ��¥ �����
		for(int i=7; i<buttons.length; i++) {
			buttons[i].setText("");
		}
		
		// ��� ����
		month += gap;
		if(month <= 0) {
			month = 12;
			year--;
		} else if(month >= 13) {
			month = 1;
			year++;
		}
		
		// ��ư�� ��¥ ����ϱ�
		calSet();
	}
}





