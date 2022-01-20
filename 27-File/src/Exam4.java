import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class Exam4 {
	public static void main(String[] args) {
		// ���� �б�
		// ���� : �����͸� ������ byte �迭 ����� 
		//       => ������ �о�ͼ� byte �迭�� ���� 
		//       => byte �迭�� String���� ����
		
		String path = "test3.txt";	// ��� ���
		// ���� ������ ����� byte�迭
		byte[] data = null;
		// byte�迭�� ��ȯ�� ����� ���ڿ�����
		String result = null;
		
		// ���� �б�
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(path); // ���� ����
			// 1) �����͸� ������ byte �迭 �����
			// inputStream.available() : ������ ũ�� �о����
			data = new byte[inputStream.available()];
			// 2) ������ �о�ͼ� byte �迭�� ����
			inputStream.read(data);
			System.out.println("[INFO] ���� �б� ����");
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���� ��θ� ã�� �� ���� >> " + path);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ���� �б� ���� >> " + path);
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] �� �� ���� ����");
		} finally {
			try {
				if(inputStream != null) inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 3) byte �迭�� ����� �����͸� ���ڿ��� ��ȯ
		if(data != null) {
			try {
				result = new String(data, "utf-8");
				System.out.println(result);
			} catch (UnsupportedEncodingException e) {
				System.out.println("�������� �ʴ� ���ڵ��Դϴ�.");
				//e.printStackTrace();
			}
		}
	}
}
