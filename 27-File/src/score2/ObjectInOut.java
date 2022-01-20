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
		FileOutputStream fos = null;	// 파일 출력 클래스
		ObjectOutputStream oos = null;	// 객체 출력 보조 스트림 클래스
		boolean isSuccess = false; 		// 저장 성공 여부 저장, false: 실패, true: 성공
		
		try {
			fos = new FileOutputStream(path);	// 1. 파일 생성, 2. 파일 열기
			oos = new ObjectOutputStream(fos);
			// 데이터 개수를 파일에 저장
			oos.writeInt(list.size());
			// 객체를 파일에 저장
			for (int i = 0; i < list.size(); i++) {
				ScoreVO scoreVO = list.get(i);
				oos.writeObject(scoreVO);	// 객체 출력
			}
			isSuccess = true;	// 저장 성공 여부 저장
			//System.out.println("저장 성공");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("입출력 에러 발생");
		} catch (Exception e) {
			System.out.println("알 수 없는 에러 발생 : " + e.getMessage());
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
			fis = new FileInputStream(path);	// 파일 열기
			ois = new ObjectInputStream(fis);
			// 데이터 갯수 읽기
			int num = ois.readInt();
			// 새로 선언한 리스트에 저장
			for (int i = 0; i < num; i++) {
				ScoreVO vo = (ScoreVO) ois.readObject();
				list.add(vo);
			}
			//System.out.println("파일 읽기 성공");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("입출력 에러 발생");
		} catch (Exception e) {
			System.out.println("알 수 없는 에러 발생 : " + e.getMessage());
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
