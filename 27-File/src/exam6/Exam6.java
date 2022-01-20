package exam6;

import java.util.ArrayList;
import java.util.List;

public class Exam6 {
	public static void main(String[] args) {
		List<StudentVO> list = new ArrayList<StudentVO>();
		ObjectInOut objectInOut = new ObjectInOut();
		
		list.add(new StudentVO("홍길동", 25, "수원"));
		list.add(new StudentVO("김철수", 23, "장흥"));
		list.add(new StudentVO("이영희", 26, "울산"));
		list.add(new StudentVO("고길동", 35, "강릉"));
		
		// 파일에 저장
		boolean result = objectInOut.write("student.txt", list);
		if(result) {
			System.out.println("저장 성공");
		} else {
			System.out.println("저장 실패");
		}
		
		// 파일읽기
		List<StudentVO> list2 = objectInOut.read("student.txt");
		for(int i=0; i<list2.size(); i++) {
			StudentVO vo = list2.get(i);
			System.out.println(vo.toString());
		}
	}
}
