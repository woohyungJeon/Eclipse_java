package java_test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class ObjectInout {
	public boolean write(String path, List<BookVO> list) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		boolean result = false;

		try {
			fos = new FileOutputStream(path);	// 1. ���� ����, 2. ���� ����
			oos = new ObjectOutputStream(fos);
			oos.writeInt(list.size());			// ����Ʈ�� ����� ��ü ������ ���� ���
			for (int i = 0; i < list.size(); i++) {
				BookVO vo = list.get(i);
				oos.writeObject(vo);
			}
			// �ڵ尡 ������� �����ϸ�, ���� ����
				System.out.println("[INFO] ���� ���� ���� >> " + path);
				result = true;
			} catch (FileNotFoundException e) {
				System.out.println("[ERROR] ���� ��θ� ã�� �� ���� >> " + path);
				//e.printStackTrace();
			} catch (IOException e) {
					System.out.println("[ERROR] ���� ���� ���� >> " + path);
				//e.printStackTrace();
			} catch (Exception e) {
				System.out.println("[ERROR] �� �� ���� ����");
			} finally {
			try {
				if (oos != null)
					oos.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public List<BookVO> read(String path) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		List<BookVO> list = new ArrayList<>();

		try {
			fis = new FileInputStream(path);	// 1. ���� ����
			ois = new ObjectInputStream(fis);
			int num = ois.readInt();
			for (int i = 0; i < num; i++) {
				BookVO vo = (BookVO) ois.readObject();
				list.add(vo);
			}// �ڵ尡 ������� �����ϸ�, �б� ����
			System.out.println("[INFO] ���� �б� ���� >> " + path);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���� ��θ� ã�� �� ���� >> " + path);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ���� �б� ���� >> " + path);
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("[ERROR] Ŭ������ �������� ����");
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] �� �� ���� ����");
		} finally {
			try {
				if (ois != null)
					ois.close();
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

}
