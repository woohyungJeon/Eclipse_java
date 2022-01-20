
public interface Book {
	public void input(); 	// 1. 도서 등록
	public void list(); 	// 2. 도서 목록 출력
	public void fileUpload(String path); 	// 3. 파일저장
	public void fileRead(String path); 		// 4. 파일읽기
	public void exit(); 	// 5. 종료
}
