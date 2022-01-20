import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exam1 {
	// Map
	// - Ű���� �ߺ��� ������� ����
	// - ����Ǵ� ������ ����
	public static void main(String[] args) {
		// <�̸�, ������> : ���׸�
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// ������ �߰�
		map.put("aaa", 111);	// ������ �߰�, Ű���� ���� ��
		map.put("bbb", 222);
		map.put("ccc", 444);
		
		// ������ ����
		map.put("aaa", 333);	// ������ ����, Ű���� ���� ��
		map.replace("bbb", 777);
				
		// ����� ������ ���� Ȯ��
		System.out.println("������ ���� : " + map.size());
		
		// ���� ������ Ȯ��
		System.out.println(map.get("aaa"));
		System.out.println(map.get("bbb"));
		System.out.println(map.get("ccc"));
		System.out.println("------------");
		
		// ���������ʴ� Ű�� ��� : null ����
		System.out.println(map.get("ddd"));
		System.out.println("------------");
		
		// ��ü ������ Ȯ��
		Set<String> set = map.keySet();  // Ű���� set ��ü�� ��Ƽ� ����
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("------------");
		
		// ����
		// 1. 1�� ����
		map.remove("aaa");
		System.out.println("������ ���� : " + map.size());
		
		// 2. ��ü ����
		map.clear();
		System.out.println("������ ���� : " + map.size());
		System.out.println("------------");
		
		// Ű������ ���� ���
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		
		// ������ �߰�
		map1.put(1, 111);	// ������ �߰�, Ű���� ���� ��
		System.out.println("������ ���� : " + map1.size());
		System.out.println(map1.get(1));
	}
}
