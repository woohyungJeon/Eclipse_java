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
		System.out.print("고객번호 : ");
		cvo.setNumber(sc.next());
		System.out.print("이   름 : ");
		cvo.setName(sc.next());
		System.out.print("전화번호 : ");
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
		String stitle = "고객번호\t이름\t전화번호";
		System.out.println(stitle);
	}
	
	@Override
	public void number_Search() {
		System.out.print("검색할 고객번호 ? ");
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
		System.out.print("검색할 이름 ?: ");
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
		System.out.print("검색할 전화번호 ?: ");
		String phone = sc.next();
		
		for(int i=0; i<list.size(); i++) {
			CustomerVO cvo = list.get(i);
			// 일부분 포함
			if(cvo.getPhone().contains(phone)) {
				sortTitle();
				System.out.println(list.get(i).sort_toString());
			}
			
			// 완전히 일치
			/*
			if(cvo.getPhone().equals(phone)) {
				sortTitle();
				System.out.println(list.get(i).sort_toString());
			}
			*/
		}			
	}

	// 정렬 : 이름, 내림차순
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
	
	// 정렬 : 고객번호, 오름차순
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
