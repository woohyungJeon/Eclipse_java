package customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CustomerImpl implements Customer {
	// ��ü �����͸� ������ ����Ʈ
	List<CustomerVO> list = new ArrayList<CustomerVO>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void input() {
		// ������ �̿� ��ü �ʱ�ȭ
		System.out.print("����ȣ : ");
		String cn = sc.next();
		System.out.print("���̸� : ");
		String name = sc.next();
		System.out.print("����ȭ��ȣ : ");
		String phone = sc.next();
		CustomerVO vo = new CustomerVO(cn, name, phone);
		/*
		// setter �̿� ��ü �ʱ�ȭ
		CustomerVO vo = new CustomerVO();
		System.out.print("����ȣ : ");
		vo.setCn(sc.next());
		System.out.print("���̸� : ");
		vo.setName(sc.next());
		System.out.print("����ȭ��ȣ : ");
		vo.setPhone(sc.next());
		*/
		list.add(vo);
	}

	public void outputTitle() {
		String outputTitle = String.format("%s\t%s\t%s", "����ȣ", "���̸�", "��ȭ��ȣ");
		System.out.println(outputTitle);
	}

	@Override
	public void output() {
		outputTitle();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

	@Override
	public void cnSearch() {
		System.out.print("�˻��� ����ȣ : ");
		String cn = sc.next();
		boolean chk = false;	// �� ���� ���� ����
		
		for (int i = 0; i < list.size(); i++) {
			CustomerVO vo = list.get(i);
			if (vo.getCn().equals(cn)) {
				outputTitle();
				System.out.println(list.get(i).toString());
				chk = true;
				break;
			} 
			System.out.println();
		}
		
		if(!chk) {
			System.out.println("�׷���� ����.");
		}
	}

	@Override
	public void nameSearch() {
		System.out.print("�˻��� ���̸� : ");
		String name = sc.next();
		boolean chk = false;	// �� ���� ���� ����
		
		for (int i = 0; i < list.size(); i++) {
			CustomerVO vo = list.get(i);
			if (vo.getName().equals(name)) {
				outputTitle();
				System.out.println(list.get(i).toString());
				chk = true;
			} 
			System.out.println();
		}
		
		if(!chk) {
			System.out.println("�׷���� ����.");
		}
	}

	@Override
	public void phoneSearch() {
		System.out.print("�˻��� ��ȭ��ȣ : ");
		String phone = sc.next();
		boolean chk = false;	// �� ���� ���� ����
		
		for (int i = 0; i < list.size(); i++) {
			CustomerVO vo = list.get(i);
			if (vo.getPhone().equals(phone)) {
				outputTitle();
				System.out.println(list.get(i).toString());
				chk = true;
			} 
			System.out.println();
		}
		if(!chk) {
			System.out.println("�׷� ��ȭ��ȣ ����.");
		}
	}

	// �̸����� ��������
	@Override
	public void nameSort() {
		Comparator<CustomerVO> customer = new Comparator<CustomerVO>() {

			@Override
			public int compare(CustomerVO vo1, CustomerVO vo2) {
				return vo2.getName().compareTo(vo1.getName());
			}
		};
		Collections.sort(list, customer);
		output();
	}

	// ��ȭ��ȣ ���� ��������
	@Override
	public void phoneSort() {
		Comparator<CustomerVO> customer = new Comparator<CustomerVO>() {

			@Override
			public int compare(CustomerVO vo1, CustomerVO vo2) {
				return vo1.getPhone().compareTo(vo2.getPhone());
			}
		};
		Collections.sort(list, customer);
		output();
	}

	@Override
	public void write(String path) {
		ObjectInOut objectInOut = new ObjectInOut();
		boolean result = objectInOut.write(path, list);
		if (result)
			System.out.println("���� ����");
		else
			System.out.println("���� ����");
	}

	@Override
	public void read(String path) {
		ObjectInOut objectInOut = new ObjectInOut();
		list = objectInOut.read(path);
		if (list.size() > 0)
			System.out.println("�б� ����");
		else
			System.out.println("�о�� ������ �����ϴ�.");
	}

}
