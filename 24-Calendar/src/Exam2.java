import java.util.Calendar;

public class Exam2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		DatePrinter.printDateTime(calendar);
		System.out.println("-------------");
		
		// Ư�� ��¥�� ����, 2020��6��5��0��0��0��
		calendar.set(Calendar.YEAR, 2020);
		calendar.set(Calendar.MONTH, 5);  // 5 => 6��
		calendar.set(Calendar.DAY_OF_MONTH, 5);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		DatePrinter.printDateTime(calendar);
		System.out.println("-------------");
		
		// ��, ��, ���� �Ѳ����� ����
		calendar.set(1995, 4, 5);
		DatePrinter.printDateTime(calendar);
		System.out.println("-------------");
		
		// ��, ��, ��, ��, ��, �ʸ� �Ѳ����� ����, 2000.1.1. 1:1:1
		calendar.set(2000, 0, 1, 1, 1, 1);
		DatePrinter.printDateTime(calendar);
		System.out.println("-------------");
	}
}
