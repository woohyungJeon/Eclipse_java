import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam3 {
	// Set
	// - �������� �ߺ��� ������� ����
	// - �������� ������ ����
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		// ������ ����
		set.add("ȣ����");
		set.add("����");
		set.add("�⸰");
		set.add("�ڳ���");
		set.add("ȣ����");
		
		// ������ ���� Ȯ��
		System.out.println("������ ���� : " + set.size());
		System.out.println("-----------------");
		
		// ������ Ȯ��
		// => ���� ������ Ȯ���� �ȵ�
		// => ��ü ������ Ȯ�θ� ��
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {	// ������ Ȯ��
			System.out.println(iterator.next()); // ������ �о����
		}
		System.out.println("-----------------");
		
		// ������ ������ �ȵ�
		// => ������ ������, ���� �߰�
		
		// ������ ����
		// 1. 1�� ����
		set.remove("ȣ����");
		System.out.println("������ ���� : " + set.size());
		System.out.println("-----------------");
		
		// 2. ��ü ����
		set.clear();
		System.out.println("������ ���� : " + set.size());
		System.out.println("-----------------");
	}
}





