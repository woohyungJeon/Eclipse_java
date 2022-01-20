import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInOut {
	// 3. 파일저장
	public boolean fileUpload(String path, List<BookVO> list) {
		FileOutputStream fileStream = null;
		ObjectOutputStream objStream = null;
		boolean chk = false;	// 저장 결과 

		try {
			fileStream = new FileOutputStream(path);
			objStream = new ObjectOutputStream(fileStream);

			objStream.writeInt(list.size());

			for (int i = 0; i < list.size(); i++) {
				BookVO vo = list.get(i);
				objStream.writeObject(vo);
			}

			chk = true;
			System.out.println("Obj - 저장 성공!!! ");

		} catch (FileNotFoundException e) {
			System.out.println("Obj - 파일이 존재하지 않습니다ㅠ");
		} catch (IOException e) {
			System.out.println("Obj - 입출력 오류 발생ㅠ" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Obj - 에러 발생 : " + e.getMessage());
		} finally {
			if (objStream != null) {
				try {
					objStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fileStream != null) {
				try {
					fileStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return chk;
	}

	// 4. 파일읽기
	public List<BookVO> fileRead(String path) {
		FileInputStream fileInStream = null;
		ObjectInputStream objInStream = null;
		List<BookVO> list = new ArrayList<>();

		try {
			fileInStream = new FileInputStream(path);
			objInStream = new ObjectInputStream(fileInStream);

			int listSize = objInStream.readInt();

			for (int i = 0; i < listSize; i++) {
				BookVO vo = (BookVO) objInStream.readObject();
				list.add(vo);
			}

			System.out.println("Obj - 파일 읽기 성공!");
		} catch (FileNotFoundException e) {
			System.out.println("Obj - 파일을 찾을 수 없습니다ㅠ");
		} catch (IOException e) {
			System.out.println("Obj - 에러 발생 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Obj - 알 수 없는 에러 발생 : " + e.getMessage());
		} finally {
			if (objInStream != null) {
				try {
					objInStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fileInStream != null) {
				try {
					fileInStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return list;
	}
}
