import java.util.Calendar;

public class Exam3 {
	public static void main(String[] args) {
		// ���� �ð� ���
		Calendar calendar = Calendar.getInstance();
		long ms1 = calendar.getTimeInMillis();
		System.out.println("���� ���� ���� >> " + ms1);
		
		// ���α׷� �Ͻ� ����
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		calendar = Calendar.getInstance();
		long ms2 = calendar.getTimeInMillis();
		System.out.println("���� ���� �� >> " + ms2);
		
		System.out.println((ms2-ms1) + "ms ������");
		System.out.println((ms2-ms1)/1000 + "�� ������");
	}
}
