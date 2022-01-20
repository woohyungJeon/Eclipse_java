package customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CustomerImpl implements Customer{
	
	List<CustomerVO> list = new ArrayList<CustomerVO>();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void input() {
		CustomerVO cvo = new CustomerVO();
		System.out.print("����ȣ : ");
		cvo.setNumber(sc.next());
		System.out.print("��   �� : ");
		cvo.setName(sc.next());
		System.out.print("��ȭ��ȣ : ");
		cvo.setPhone(sc.next());
		
		list.add(cvo);
	}

	@Override
	public void output() {
		sortTitle();
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).sort_toString());
		}
	}
	@Override
	public void sortTitle() {
		String stitle = "����ȣ\t�̸�\t��ȭ��ȣ";
		System.out.println(stitle);
	}
	
	@Override
	public void number_Search() {
		System.out.print("�˻��� ����ȣ ? ");
		String number = sc.next();
		
		for(int i=0; i<list.size(); i++) {
			CustomerVO cvo = list.get(i);
			if(cvo.getNumber().equals(number)) {
				sortTitle();
				System.out.println(list.get(i).sort_toString());				
			}
		}		
	}
	
	@Override
	public void name_Search() {
		System.out.print("�˻��� �̸� ?: ");
		String name = sc.next();
		
		for(int i=0; i<list.size(); i++) {
			CustomerVO cvo = list.get(i);
			if(cvo.getName().equals(name)) {
				sortTitle();
				System.out.println(list.get(i).sort_toString());
			}
		}		
	}
	
	@Override
	public void phone_Search() {
		System.out.print("�˻��� ��ȭ��ȣ ?: ");
		String phone = sc.next();
		
		for(int i=0; i<list.size(); i++) {
			CustomerVO cvo = list.get(i);
			// �Ϻκ� ����
			if(cvo.getPhone().contains(phone)) {
				sortTitle();
				System.out.println(list.get(i).sort_toString());
			}
			
			// ������ ��ġ
			/*
			if(cvo.getPhone().equals(phone)) {
				sortTitle();
				System.out.println(list.get(i).sort_toString());
			}
			*/
		}			
	}

	// ���� : �̸�, ��������
	@Override
	public void name_DesSort() {
		Comparator<CustomerVO> customer = new Comparator<CustomerVO>() {

			@Override
			public int compare(CustomerVO cvo1, CustomerVO cvo2) {
				return cvo2.getName().compareTo(cvo1.getName());	
			}
			
		};
		Collections.sort(list,customer);
		output();		
	}
	
	// ���� : ����ȣ, ��������
	@Override
	public void number_ascSort() {
		Comparator<CustomerVO> customer = new Comparator<CustomerVO>() {

			@Override
			public int compare(CustomerVO cvo1, CustomerVO cvo2) {
				return cvo1.getNumber().compareTo(cvo2.getNumber());		
			}
			
		};
		Collections.sort(list,customer);
		output();		
	}
}
