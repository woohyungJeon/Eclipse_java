import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookImpl implements Book {
	Scanner sc = new Scanner(System.in);
	List<BookVO> list = new ArrayList<>();	
	String title = String.format("%s\t %s\t %s\t %s\t %s", "�����ڵ�", "������", "����", "���ǻ�", "����");

	// 1. ���� ���
	// �����ڵ�, ������, ����, ���ǻ�, ����
	@Override
	public void input() {
		BookVO book = new BookVO();

		System.out.print("�����ڵ� : ");
		book.setBookCode(sc.next());

		System.out.print("������ : ");
		book.setBookName(sc.next());

		System.out.print("���� : ");
		book.setWriter(sc.next());

		System.out.print("���ǻ� : ");
		book.setPublish(sc.next());

		System.out.print("���� : ");
		book.setPrice(sc.nextInt());
		
		list.add(book);
	}

	// 2. ���� ��� ���
	@Override
	public void list() {
		if (list.size() == 0) {
			System.out.println("��ϵ� ������ �����ϴ�.");
		} else {
			System.out.println(title);
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).toString());
			}
		}
	}

	// 3. ��������
	@Override
	public void fileUpload(String path) {
		ObjectInOut objInOut = new ObjectInOut();
		boolean check = objInOut.fileUpload(path, list);

		if (check) {
			System.out.println("Impl - ���� ����");
		} else {
			System.out.println("Impl - ���� ����");
		}
	}

	// 4. �����б�
	@Override
	public void fileRead(String path) {
		ObjectInOut objectInOut = new ObjectInOut();
		list = objectInOut.fileRead(path);

		if (list.size() > 0) {
			System.out.println("Impl - �б� ����");
		} else {
			System.out.println("Impl - ��ϵ� ������ �����ϴ�.");
		}
	}

	// 5. ����
	@Override
	public void exit() {
		System.out.println("���α׷��� ���� �մϴ�.");
		System.exit(0);
	}

}
