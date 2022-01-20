import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookImpl implements Book {
	Scanner sc = new Scanner(System.in);
	List<BookVO> list = new ArrayList<>();	
	String title = String.format("%s\t %s\t %s\t %s\t %s", "도서코드", "도서명", "저자", "출판사", "가격");

	// 1. 도서 등록
	// 도서코드, 도서명, 저자, 출판사, 가격
	@Override
	public void input() {
		BookVO book = new BookVO();

		System.out.print("도서코드 : ");
		book.setBookCode(sc.next());

		System.out.print("도서명 : ");
		book.setBookName(sc.next());

		System.out.print("저자 : ");
		book.setWriter(sc.next());

		System.out.print("출판사 : ");
		book.setPublish(sc.next());

		System.out.print("가격 : ");
		book.setPrice(sc.nextInt());
		
		list.add(book);
	}

	// 2. 도서 목록 출력
	@Override
	public void list() {
		if (list.size() == 0) {
			System.out.println("등록된 도서가 없습니다.");
		} else {
			System.out.println(title);
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).toString());
			}
		}
	}

	// 3. 파일저장
	@Override
	public void fileUpload(String path) {
		ObjectInOut objInOut = new ObjectInOut();
		boolean check = objInOut.fileUpload(path, list);

		if (check) {
			System.out.println("Impl - 저장 성공");
		} else {
			System.out.println("Impl - 저장 실패");
		}
	}

	// 4. 파일읽기
	@Override
	public void fileRead(String path) {
		ObjectInOut objectInOut = new ObjectInOut();
		list = objectInOut.fileRead(path);

		if (list.size() > 0) {
			System.out.println("Impl - 읽기 성공");
		} else {
			System.out.println("Impl - 등록된 도서가 없습니다.");
		}
	}

	// 5. 종료
	@Override
	public void exit() {
		System.out.println("프로그램을 종료 합니다.");
		System.exit(0);
	}

}
