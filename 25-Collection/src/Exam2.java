import java.util.ArrayList;
import java.util.List;

public class Exam2 {
	// List
	// - 데이터의 중복을 허용함
	// - 데이터의 순서가 있음
	// - 배열과 비슷함
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		// 데이터 추가 : 제일 뒤에 추가
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		// 데이터 추가 : 중간에 추가
		// add(index, 데이터)
		list.add(2, 70);
		
		// 데이터 갯수 확인
		System.out.println("데이터 갯수 : " + list.size());
		
		// 데이터 확인
		int val = list.get(2);
		System.out.println(val);
		System.out.println("-------------");
		
		// 전체 데이터 확인
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------------");
		
		// 데이터 수정 : set(index, 데이터)
		list.set(2, 500);
		System.out.println(list.get(2));
		System.out.println("-------------");
		
		// 삭제
		// 1. 1개 삭제
		list.remove(2);
		System.out.println("데이터 갯수 : " + list.size());
		System.out.println("-------------");
		
		System.out.println(list.get(2));
		System.out.println("-------------");
		
		// 2. 전체 삭제
		list.clear();
		System.out.println("데이터 갯수 : " + list.size());
		System.out.println("-------------");
	}
}














