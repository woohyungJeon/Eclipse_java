package java_test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BookImpl implements Book {
	
	List<BookVO> list = new ArrayList<BookVO>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void input() {
		// 도서 정보 저장
		BookVO bvo = new  BookVO();
		System.out.print("도서 코드 : ");
		bvo.setbCode(sc.next());
		System.out.print("도서명 : ");
		bvo.setbName(sc.next());
		System.out.print("저자 : ");
		bvo.setbWriter(sc.next());
		System.out.print("출판사 : ");
		bvo.setbCompany(sc.next());
		System.out.print("가격 : ");
		bvo.setbPrice(sc.next());
		
		list.add(bvo);		
		
	}
	
	public void outputTitle() {
		String outputTitle = String.format("%s\t%s\t%s\t%s\t%s", "도서 코드", "도서명", "저자", "출판사", "가격");
		System.out.println(outputTitle);
	}

	@Override
	public void output() {
		outputTitle();
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
	}

	@Override
	public void fileSave(String path) {
		ObjectInout objectInOut = new ObjectInout();
		boolean result = objectInOut.write(path, list);
		if (result)
			System.out.println("저장 성공");
		else
			System.out.println("저장 실패");
		
	}

	@Override
	public void fileRead(String path) {
		ObjectInout objectInOut = new ObjectInout();
		list = objectInOut.read(path);
		if (list.size() > 0)
			System.out.println("읽기 성공");
		else
			System.out.println("읽어올 데이터가 없습니다.");
		
	}

}
	
	


