import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam3 {
	// Set
	// - 데이터의 중복을 허락하지 않음
	// - 데이터의 순서가 없음
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		// 데이터 저장
		set.add("호랑이");
		set.add("사자");
		set.add("기린");
		set.add("코끼리");
		set.add("호랑이");
		
		// 데이터 갯수 확인
		System.out.println("데이터 갯수 : " + set.size());
		System.out.println("-----------------");
		
		// 데이터 확인
		// => 개별 데이터 확인은 안됨
		// => 전체 데이터 확인만 됨
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {	// 데이터 확인
			System.out.println(iterator.next()); // 데이터 읽어오기
		}
		System.out.println("-----------------");
		
		// 데이터 수정은 안됨
		// => 데이터 삭제후, 새로 추가
		
		// 데이터 삭제
		// 1. 1개 삭제
		set.remove("호랑이");
		System.out.println("데이터 갯수 : " + set.size());
		System.out.println("-----------------");
		
		// 2. 전체 삭제
		set.clear();
		System.out.println("데이터 갯수 : " + set.size());
		System.out.println("-----------------");
	}
}





