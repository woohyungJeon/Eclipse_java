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
			fos = new FileOutputStream(path);	// 1. 파일 생성, 2. 파일 열기
			oos = new ObjectOutputStream(fos);
			oos.writeInt(list.size());			// 리스트에 저장된 전체 데이터 갯수 출력
			for (int i = 0; i < list.size(); i++) {
				BookVO vo = list.get(i);
				oos.writeObject(vo);
			}
			// 코드가 여기까지 진행하면, 저장 성공
				System.out.println("[INFO] 파일 저장 성공 >> " + path);
				result = true;
			} catch (FileNotFoundException e) {
				System.out.println("[ERROR] 저장 경로를 찾을 수 없음 >> " + path);
				//e.printStackTrace();
			} catch (IOException e) {
					System.out.println("[ERROR] 파일 저장 실패 >> " + path);
				//e.printStackTrace();
			} catch (Exception e) {
				System.out.println("[ERROR] 알 수 없는 에러");
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
			fis = new FileInputStream(path);	// 1. 파일 열기
			ois = new ObjectInputStream(fis);
			int num = ois.readInt();
			for (int i = 0; i < num; i++) {
				BookVO vo = (BookVO) ois.readObject();
				list.add(vo);
			}// 코드가 여기까지 진행하면, 읽기 성공
			System.out.println("[INFO] 파일 읽기 성공 >> " + path);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 저장 경로를 찾을 수 없음 >> " + path);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 읽기 실패 >> " + path);
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("[ERROR] 클래스가 존재하지 않음");
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러");
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
