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
			fos = new FileOutputStream(path);	// 1. 파일 생성, 2. 파일 열기
			oos = new ObjectOutputStream(fos);
			oos.writeInt(list.size());			// 리스트에 저장된 전체 데이터 갯수 출력
			for (int i = 0; i < list.size(); i++) {
				CustomerVO vo = list.get(i);
				oos.writeObject(vo);
			}
			result = true;
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 에러 발생");
			// e.printStackTrace();
		} catch (Exception e) {
			System.out.println("알 수 없는 에러 발생");
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
			fis = new FileInputStream(path);	// 1. 파일 열기
			ois = new ObjectInputStream(fis);
			int num = ois.readInt();
			for (int i = 0; i < num; i++) {
				CustomerVO vo = (CustomerVO) ois.readObject();
				list.add(vo);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 에러 발생");
			// e.printStackTrace();
		} catch (Exception e) {
			System.out.println("알 수 없는 에러 발생");
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
