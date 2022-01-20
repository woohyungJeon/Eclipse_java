import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exam1 {
	// Map
	// - 키값의 중복을 허락하지 않음
	// - 저장되는 순서가 없음
	public static void main(String[] args) {
		// <이름, 데이터> : 제네릭
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 데이터 추가
		map.put("aaa", 111);	// 데이터 추가, 키값이 없을 때
		map.put("bbb", 222);
		map.put("ccc", 444);
		
		// 데이터 수정
		map.put("aaa", 333);	// 데이터 수정, 키값이 있을 때
		map.replace("bbb", 777);
				
		// 저장된 데이터 갯수 확인
		System.out.println("데이터 갯수 : " + map.size());
		
		// 개별 데이터 확인
		System.out.println(map.get("aaa"));
		System.out.println(map.get("bbb"));
		System.out.println(map.get("ccc"));
		System.out.println("------------");
		
		// 존재하지않는 키값 사용 : null 리턴
		System.out.println(map.get("ddd"));
		System.out.println("------------");
		
		// 전체 데이터 확인
		Set<String> set = map.keySet();  // 키값을 set 객체에 담아서 리턴
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("------------");
		
		// 삭제
		// 1. 1개 삭제
		map.remove("aaa");
		System.out.println("데이터 갯수 : " + map.size());
		
		// 2. 전체 삭제
		map.clear();
		System.out.println("데이터 갯수 : " + map.size());
		System.out.println("------------");
		
		// 키값으로 정수 사용
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		
		// 데이터 추가
		map1.put(1, 111);	// 데이터 추가, 키값이 없을 때
		System.out.println("데이터 갯수 : " + map1.size());
		System.out.println(map1.get(1));
	}
}
