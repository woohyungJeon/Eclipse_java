import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Exam3 {
	public static void main(String[] args) {
		// ���� : ���ڿ� => ���ڿ��� byte �迭�� ���� => byte �迭�� ���Ͽ� ���
		// ���� ��� : utf-8
		String str = "�����ٶ󸶹ٻ�abcdefg";
		String path = "test3.txt";	// ��� ���
		
		// utf-8 ���ڵ� ����
		byte[] buffer = null;
		try {
			// ���ڿ��� byte �迭�� ���� 
			buffer = str.getBytes("utf-8");	// ����,���� : 1byte, �ѱ�: 3byte
			//System.out.println(buffer.length);
		} catch (UnsupportedEncodingException e) {
			System.out.println("�������� �ʴ� ���ڵ��Դϴ�.");
			//e.printStackTrace();
		}
		
		// ���� ����
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(path);	// 1. ���� ����� 2.���� ����
			outputStream.write(buffer);		// 3. byte �迭�� ���Ͽ� ���
			System.out.println("[INFO] ���� �����");
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���� ��θ� ã�� �� �����ϴ�.");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ���忡 �����߽��ϴ�.");
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] �˼� ���� ������ �߻��Ͽ����ϴ�.");
		} finally {
			try {
				if(outputStream != null) outputStream.close();
			} catch (IOException e) {
				System.out.println("[ERROR] ������ �ݴµ� �����߽��ϴ�.");
				//e.printStackTrace();
			}
		}
	}
}
