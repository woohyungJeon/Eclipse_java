import helper.FileHelper;

public class Exam5 {
	public static void main(String[] args) {
		String encType = "utf-8";
		String filePath = "myfile.txt";
		String content = "�ȳ��ϼ���. �ڹ� ���α׷���";
		// ���� ����
		boolean result = FileHelper.getInstance().writeString(filePath, content, encType);
		
		if(result) {
			System.out.println("���� ���� ����");
		} else {
			System.out.println("���� ���� ����");
		}
		
		// ���� �б�
		String str_result = FileHelper.getInstance().readString(filePath, encType);
		if(str_result != null) {	// �б� ����
			System.out.println(str_result);
		} else {
			System.out.println("���� �б� ����");
		}
	}
}
