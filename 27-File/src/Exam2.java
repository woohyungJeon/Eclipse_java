import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exam2 {
	public static void main(String[] args) {
		String str = "�����ٶ󸶹ٻ�abcdefg";
		// D:\aa_ycs\java_ycs\java\workspace\27-File\test2.txt
		String path = "test2.txt";		// ��� ���
		// ���� ���
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(path); // 1. ���� ����� 2. ���� ����
			fileWriter.write(str);	// 3. ���Ͽ� ������ ����
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fileWriter != null) fileWriter.close();		// ���� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// ���� �Է�
		FileReader fileReader = null;	
		System.out.println((char)0xac00);
		try {
			fileReader = new FileReader(path);	// ���� ����
			String result = "";
			while(true) {
				int data = fileReader.read();  // �����ڵ�� ����1���� �о��, 
				if(data == -1) break;	// -1 : EOF (End of File)
				result += (char)data;
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}









