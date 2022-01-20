package helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

// �̱��� ����
public class FileHelper {
	// �̱��� ���� ����
	private static FileHelper instance = null;

	public static FileHelper getInstance() {
		if (instance == null)
			instance = new FileHelper();

		return instance;
	}

	private FileHelper() {
	}
	// �̱��� ���� ��

	public boolean writeString(String filePath, String content, String encType) {
		// ���� : ���ڿ� => ���ڿ��� byte �迭�� ��ȯ => byte �迭�� ���Ϸ� ����
		boolean write_result = false; // ���� ���� ���� ��� ����
		
		// 1) ���ڿ��� byte �迭�� ��ȯ
		byte[] buffer = null;
		try {
			buffer = content.getBytes(encType); // ����,���� : 1byte, �ѱ�: 3byte			
		} catch (UnsupportedEncodingException e) {
			System.out.println(encType + " ���ڵ� ��ȯ�� ����");
			//e.printStackTrace();
		}

		// byte �迭�� ���Ϸ� ����
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(filePath); // 1. ���� �����, 2. ���� ����
			outputStream.write(buffer);	// 2) ���Ͽ� ������ ����
			// ������� ����Ǿ��ٴ� ���� ���� ������ �ǹ���
			System.out.println("[INFO] ���� �����");
			write_result = true;  // ����
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���� ��θ� ã�� �� �����ϴ�.");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ���忡 �����߽��ϴ�.");
			// e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] �� �� ���� ������ �߻��߽��ϴ�.");
		} finally {
			try {
				// ���� �ݱ�
				if(outputStream != null) outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// ��� ���� : ���� true, ���� false
		return write_result;
	}

	public String readString(String filePath, String encType) {
		// ���� : byte �迭 ����� => byte �迭�� ���� ���������� => byte �迭�� ���ڿ��� ��ȯ
		byte[] data = null;				// byte �迭 ����
		String read_result = null;		// ���ڿ� ���� ����
		
		// ���� �б�
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(filePath);	// ���� ����
			// 1) byte �迭 �����
			// inputStream.available() : ������ ũ�� �о����
			data = new byte[inputStream.available()];
			// 2) byte �迭�� ���� ����������
			inputStream.read(data);
			// ������� �����ߴٸ�, ���� �б� ����
			System.out.println("[INFO] ���� �б� ����");
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���� ��θ� ã�� �� ���� >> " + filePath);
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ���� �б� ���� >> " + filePath);
			// e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] �� �� ���� ����");
		} finally {
			try {
				// ���� �ݱ�
				if (inputStream != null) inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 3) byte �迭�� ���ڿ��� ��ȯ
		if (data != null) {
			try {
				read_result = new String(data, encType); // byte�迭�� ���ڿ� ����
				//System.out.println(read_result);
			} catch (UnsupportedEncodingException e) {
				System.out.println("�������� �ʴ� ���ڵ��Դϴ�.");
				//e.printStackTrace();
			}
		}
		// ���ڿ� ����
		return read_result;
	}
}