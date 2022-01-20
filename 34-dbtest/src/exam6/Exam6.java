package exam6;

import java.util.List;

public class Exam6 {
	public static void main(String[] args) {
		DbtestDAO dao = new DbtestDAO();
		int result = 0;
		List<DbtestDTO> list = null;
		
		// insert
		result = dao.insertArticle();
		if(result > 0) System.out.println("저장 성공");
		else System.out.println("저장 실패");
		System.out.println("------------------");
		
		// select
		list = dao.selectArticle();
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		System.out.println("------------------");
		
		// update
		result = dao.updateArticle();
		if(result > 0) System.out.println("수정 성공");
		else System.out.println("수정 실패");
		System.out.println("------------------");
		
		// select
		list = dao.selectArticle();
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		System.out.println("------------------");
		
		// delete
		result = dao.deleteArticle();
		if(result > 0) System.out.println("삭제 성공");
		else System.out.println("삭제 실패");
		System.out.println("------------------");
		
		// select
		list = dao.selectArticle();
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
