import java.util.ArrayList;
import java.util.List;

public class Exam2 {
	// List
	// - �������� �ߺ��� �����
	// - �������� ������ ����
	// - �迭�� �����
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		// ������ �߰� : ���� �ڿ� �߰�
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		// ������ �߰� : �߰��� �߰�
		// add(index, ������)
		list.add(2, 70);
		
		// ������ ���� Ȯ��
		System.out.println("������ ���� : " + list.size());
		
		// ������ Ȯ��
		int val = list.get(2);
		System.out.println(val);
		System.out.println("-------------");
		
		// ��ü ������ Ȯ��
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------------");
		
		// ������ ���� : set(index, ������)
		list.set(2, 500);
		System.out.println(list.get(2));
		System.out.println("-------------");
		
		// ����
		// 1. 1�� ����
		list.remove(2);
		System.out.println("������ ���� : " + list.size());
		System.out.println("-------------");
		
		System.out.println(list.get(2));
		System.out.println("-------------");
		
		// 2. ��ü ����
		list.clear();
		System.out.println("������ ���� : " + list.size());
		System.out.println("-------------");
	}
}














