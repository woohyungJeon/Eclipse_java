package java_test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BookImpl implements Book {
	
	List<BookVO> list = new ArrayList<BookVO>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void input() {
		// ���� ���� ����
		BookVO bvo = new  BookVO();
		System.out.print("���� �ڵ� : ");
		bvo.setbCode(sc.next());
		System.out.print("������ : ");
		bvo.setbName(sc.next());
		System.out.print("���� : ");
		bvo.setbWriter(sc.next());
		System.out.print("���ǻ� : ");
		bvo.setbCompany(sc.next());
		System.out.print("���� : ");
		bvo.setbPrice(sc.next());
		
		list.add(bvo);		
		
	}
	
	public void outputTitle() {
		String outputTitle = String.format("%s\t%s\t%s\t%s\t%s", "���� �ڵ�", "������", "����", "���ǻ�", "����");
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
			System.out.println("���� ����");
		else
			System.out.println("���� ����");
		
	}

	@Override
	public void fileRead(String path) {
		ObjectInout objectInOut = new ObjectInout();
		list = objectInOut.read(path);
		if (list.size() > 0)
			System.out.println("�б� ����");
		else
			System.out.println("�о�� �����Ͱ� �����ϴ�.");
		
	}

}
	
	


