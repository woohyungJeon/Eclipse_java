
public class Exam6 {
										// ���� ����
	public static void main(String[] args) throws Exception{
		AAA aa = new AAA();
		// 2. ���� ����
		//aa.ex();
		
		// 1. try-catch
		try {
			aa.ex();
		} catch (NumberFormatException e) {
			System.out.println("���ڿ��� ���ڰ� �ƴ� ���ڰ� �ֽ��ϴ�.");
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("�� �� ���� ���� �߻�");
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
}
