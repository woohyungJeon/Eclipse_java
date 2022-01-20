package exam6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInOut {
	// ����Ʈ�� ����� �����͸� ���Ͽ� ����
	public boolean write(String filePath, List<StudentVO> list) {
		FileOutputStream fos = null;	// ���� ��� Ŭ����
		ObjectOutputStream oos = null;	// ��ü ��� ���� ��Ʈ�� Ŭ����
		boolean result = false; 		// ���� ���� ����
		
		try {
			fos = new FileOutputStream(filePath);	// 1. ���� �����, 2. ���� ����
			oos = new ObjectOutputStream(fos);
			// 1) ������ ������ ���Ϸ� ���
			oos.writeInt(list.size());
			// 2) ��ü�� ���Ϸ� ���
			for(int i=0; i<list.size(); i++) {
				StudentVO vo = list.get(i);
				oos.writeObject(vo);
			}
			// �ڵ尡 ������� �����ϸ�, ���� ����
			System.out.println("[INFO] ���� ���� ���� >> " + filePath);
			result = true;
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���� ��θ� ã�� �� ���� >> " + filePath);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ���� ���� ���� >> " + filePath);
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] �� �� ���� ����");
		} finally {
			try {
				if(oos != null) oos.close();	
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	// ���Ͽ� ����� �����͸� ����Ʈ�� ����
	public List<StudentVO> read(String filePath) {
		List<StudentVO> list = new ArrayList<StudentVO>();
		FileInputStream fis = null;		// ���� �б� Ŭ����
		ObjectInputStream ois = null;	// ��ü �б� ���� ��Ʈ�� Ŭ����
		
		try {
			fis = new FileInputStream(filePath);	// ���� ����
			ois = new ObjectInputStream(fis);
			// ������ ���� �о����
			int num = ois.readInt();
			// ��ü ����ŭ �о�ͼ�, ����Ʈ�� �����ϱ�
			for(int i=0; i<num; i++) {
				StudentVO vo = (StudentVO)ois.readObject(); // ��ü1�� �о�ͼ� �޸𸮿� ����
				// ����Ʈ�� ����
				list.add(vo);
			}
			// �ڵ尡 ������� �����ϸ�, �б� ����
			System.out.println("[INFO] ���� �б� ���� >> " + filePath);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���� ��θ� ã�� �� ���� >> " + filePath);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ���� �б� ���� >> " + filePath);
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("[ERROR] Ŭ������ �������� ����");
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] �� �� ���� ����");
		} finally {
			try {
				if(ois != null) ois.close();
				if(fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}







