package customer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInOut {
	public boolean write(String path, List<CustomerVO> list) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		boolean result = false;

		try {
			fos = new FileOutputStream(path);	// 1. ���� ����, 2. ���� ����
			oos = new ObjectOutputStream(fos);
			oos.writeInt(list.size());			// ����Ʈ�� ����� ��ü ������ ���� ���
			for (int i = 0; i < list.size(); i++) {
				CustomerVO vo = list.get(i);
				oos.writeObject(vo);
			}
			result = true;
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("����� ���� �߻�");
			// e.printStackTrace();
		} catch (Exception e) {
			System.out.println("�� �� ���� ���� �߻�");
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

	public List<CustomerVO> read(String path) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		List<CustomerVO> list = new ArrayList<>();

		try {
			fis = new FileInputStream(path);	// 1. ���� ����
			ois = new ObjectInputStream(fis);
			int num = ois.readInt();
			for (int i = 0; i < num; i++) {
				CustomerVO vo = (CustomerVO) ois.readObject();
				list.add(vo);
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("����� ���� �߻�");
			// e.printStackTrace();
		} catch (Exception e) {
			System.out.println("�� �� ���� ���� �߻�");
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
