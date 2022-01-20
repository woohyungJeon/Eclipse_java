package customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CustomerImpl implements Customer {
	// 전체 데이터를 저장할 리스트
	List<CustomerVO> list = new ArrayList<CustomerVO>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void input() {
		// 생성자 이용 객체 초기화
		System.out.print("고객번호 : ");
		String cn = sc.next();
		System.out.print("고객이름 : ");
		String name = sc.next();
		System.out.print("고객전화번호 : ");
		String phone = sc.next();
		CustomerVO vo = new CustomerVO(cn, name, phone);
		/*
		// setter 이용 객체 초기화
		CustomerVO vo = new CustomerVO();
		System.out.print("고객번호 : ");
		vo.setCn(sc.next());
		System.out.print("고객이름 : ");
		vo.setName(sc.next());
		System.out.print("고객전화번호 : ");
		vo.setPhone(sc.next());
		*/
		list.add(vo);
	}

	public void outputTitle() {
		String outputTitle = String.format("%s\t%s\t%s", "고객번호", "고객이름", "전화번호");
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
		System.out.print("검색할 고객번호 : ");
		String cn = sc.next();
		boolean chk = false;	// 고객 존재 유무 저장
		
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
			System.out.println("그런사람 없다.");
		}
	}

	@Override
	public void nameSearch() {
		System.out.print("검색할 고객이름 : ");
		String name = sc.next();
		boolean chk = false;	// 고객 존재 유무 저장
		
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
			System.out.println("그런사람 없다.");
		}
	}

	@Override
	public void phoneSearch() {
		System.out.print("검색할 전화번호 : ");
		String phone = sc.next();
		boolean chk = false;	// 고객 존재 유무 저장
		
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
			System.out.println("그런 전화번호 없다.");
		}
	}

	// 이름정렬 내림차순
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

	// 전화번호 정렬 오름차순
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
			System.out.println("저장 성공");
		else
			System.out.println("저장 실패");
	}

	@Override
	public void read(String path) {
		ObjectInOut objectInOut = new ObjectInOut();
		list = objectInOut.read(path);
		if (list.size() > 0)
			System.out.println("읽기 성공");
		else
			System.out.println("읽어올 데이터 없습니다.");
	}

}
