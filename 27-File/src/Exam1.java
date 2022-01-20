import java.io.File;
import java.io.IOException;

public class Exam1 {
	public static void main(String[] args) {
		// ���� ��ǻ�� ���� ���� ��� 
		// D:\aa_ycs\java_ycs\java\workspace\27-File\src\Main01.java
		File file1 = new File("src/Main01.java");
		System.out.println(file1);	
		System.out.println("--------------------");
		
		// 1) ���� ��� ǥ��
		System.out.println("���� ��� : " + file1.getAbsolutePath());	
		System.out.println("--------------------");
		
		// 2) ����� ��ΰ� �������� �˻�
		// => �����ϸ� true, ������ false
		System.out.println("isFile : " + file1.isFile());
		System.out.println("--------------------");
		
		// 3) ����� ��ΰ� �������� �˻�
		// => �����ϸ� true, �������� �ʰų� ������ �ƴϸ� false
		System.out.println("isDirectory : " + file1.isDirectory());
		System.out.println("--------------------");
		
		// 4) ���� ������ �� �˻�
		// => ���� ������ ������ false
		System.out.println("isHidden : " + file1.isHidden());
		System.out.println("--------------------");
		
		// 5) ����� ��ο� ���� �Ǵ� ������ �����ϴ� �� �˻�
		System.out.println("exists : " + file1.exists());
		System.out.println("--------------------");
		
		// 6) ���� �����
		try {
			file1.createNewFile();
		} catch (IOException e) {
			System.out.println("���� ������ �����߽��ϴ�.");
			//e.printStackTrace();
		}
		System.out.println("exists : " + file1.exists());
		System.out.println("--------------------");
		
		// 7) ���� ���ֱ�
		file1.delete();
		System.out.println("exists : " + file1.exists());
		System.out.println("--------------------");
		
		// ����
		File file2 = new File("a/b/c/target");
		System.out.println("isFile : " + file2.isFile());
		System.out.println("isDirectory : " + file2.isDirectory());
		System.out.println("isHidden : " + file2.isHidden());
		System.out.println("exists : " + file2.exists());
		System.out.println("--------------------");
		
		// 8) ���� �����
		file2.mkdirs();
		System.out.println("exists : " + file2.exists());
		System.out.println("--------------------");
		
		// 9) ������ ���������� ���� �ܾ ���
		System.out.println("���ϸ� : " + file1.getName());
		System.out.println("������ : " + file2.getName());
		System.out.println("--------------------");
		
		// 10) ó������ ������ ���������� �������� ���
		System.out.println("������ : " + file1.getParent());
		System.out.println("������ : " + file2.getParent());
		System.out.println("--------------------");
		
		// 11) ���� ���� : ������ ������ ������
		file2.delete();
		System.out.println("exists : " + file2.exists());
		System.out.println("--------------------");
	}
}




