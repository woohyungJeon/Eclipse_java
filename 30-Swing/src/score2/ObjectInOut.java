package score2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInOut {
	public boolean write(String path, List<ScoreVO> list) {
		FileOutputStream fos = null;	// ���� ��� Ŭ����
		ObjectOutputStream oos = null;	// ��ü ��� ���� ��Ʈ�� Ŭ����
		boolean isSuccess = false; 		// ���� ���� ���� ����, false: ����, true: ����
		
		try {
			fos = new FileOutputStream(path);	// 1. ���� ����, 2. ���� ����
			oos = new ObjectOutputStream(fos);
			// ������ ������ ���Ͽ� ����
			oos.writeInt(list.size());
			// ��ü�� ���Ͽ� ����
			for (int i = 0; i < list.size(); i++) {
				ScoreVO scoreVO = list.get(i);
				oos.writeObject(scoreVO);	// ��ü ���
			}
			isSuccess = true;	// ���� ���� ���� ����
			//System.out.println("���� ����");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("����� ���� �߻�");
		} catch (Exception e) {
			System.out.println("�� �� ���� ���� �߻� : " + e.getMessage());
		} finally {
			try {
				if (oos != null) oos.close();
				if (fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return isSuccess;
	}

	public List<ScoreVO> read(String path) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		List<ScoreVO> list = new ArrayList<>();

		try {
			fis = new FileInputStream(path);	// ���� ����
			ois = new ObjectInputStream(fis);
			// ������ ���� �б�
			int num = ois.readInt();
			// ���� ������ ����Ʈ�� ����
			for (int i = 0; i < num; i++) {
				ScoreVO vo = (ScoreVO) ois.readObject();
				list.add(vo);
			}
			//System.out.println("���� �б� ����");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("����� ���� �߻�");
		} catch (Exception e) {
			System.out.println("�� �� ���� ���� �߻� : " + e.getMessage());
		} finally {
			try {
				if (ois != null) ois.close();
				if (fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
		
		return list;
	}
}
