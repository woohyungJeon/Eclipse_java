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
	// 리스트에 저장된 데이터를 파일에 저장
	public boolean write(String filePath, List<StudentVO> list) {
		FileOutputStream fos = null;	// 파일 출력 클래스
		ObjectOutputStream oos = null;	// 객체 출력 보조 스트림 클래스
		boolean result = false; 		// 저장 성공 여부
		
		try {
			fos = new FileOutputStream(filePath);	// 1. 파일 만들기, 2. 파일 열기
			oos = new ObjectOutputStream(fos);
			// 1) 데이터 갯수를 파일로 출력
			oos.writeInt(list.size());
			// 2) 객체를 파일로 출력
			for(int i=0; i<list.size(); i++) {
				StudentVO vo = list.get(i);
				oos.writeObject(vo);
			}
			// 코드가 여기까지 진행하면, 저장 성공
			System.out.println("[INFO] 파일 저장 성공 >> " + filePath);
			result = true;
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 저장 경로를 찾을 수 없음 >> " + filePath);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 저장 실패 >> " + filePath);
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러");
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
	
	// 파일에 저장된 데이터를 리스트에 저장
	public List<StudentVO> read(String filePath) {
		List<StudentVO> list = new ArrayList<StudentVO>();
		FileInputStream fis = null;		// 파일 읽기 클래스
		ObjectInputStream ois = null;	// 객체 읽기 보조 스트림 클래스
		
		try {
			fis = new FileInputStream(filePath);	// 파일 열기
			ois = new ObjectInputStream(fis);
			// 데이터 갯수 읽어오기
			int num = ois.readInt();
			// 객체 수만큼 읽어와서, 리스트에 저장하기
			for(int i=0; i<num; i++) {
				StudentVO vo = (StudentVO)ois.readObject(); // 객체1개 읽어와서 메모리에 저장
				// 리스트에 저장
				list.add(vo);
			}
			// 코드가 여기까지 진행하면, 읽기 성공
			System.out.println("[INFO] 파일 읽기 성공 >> " + filePath);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 저장 경로를 찾을 수 없음 >> " + filePath);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 읽기 실패 >> " + filePath);
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("[ERROR] 클래스가 존재하지 않음");
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러");
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







