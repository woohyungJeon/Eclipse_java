
public class Exam3 {
	public static void main(String[] args) {
		String year1 = "1995";
		int age1 = 2022 - Integer.parseInt(year1) + 1;
		System.out.println(age1 + "�� �Դϴ�.");
		System.out.println("-----------------");
		
		try {
			String year2 = "�����";
			int age2 = 2022 - Integer.parseInt(year2) + 1;
			System.out.println(age2 + "�� �Դϴ�.");
		} catch(Exception e) {
			System.out.println("���� �߻� : " + e.getMessage());
		} finally { 
			// ���� ����
			// ���ܰ� �߻��ϵ� ��, �߻����� �ʵ��� ���۽�ų �ڵ� �ۼ�
			System.out.println("finally");
		}
		
		System.out.println("���α׷��� �����մϴ�.");		
	}
}
