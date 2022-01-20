package score;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score{
	// 데이터 저장용
	List<ScoreVO> list = new ArrayList<ScoreVO>();
	Scanner sc = new Scanner(System.in);
	
	// 입력
	@Override
	public void input() {
		// 객체 생성 : 1명 데이터 저장용
		ScoreVO vo = new ScoreVO();
		System.out.print("학번 : ");
		vo.setHak(sc.next());
		System.out.print("이름 : ");
		vo.setName(sc.next());
		System.out.print("국어 : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어 : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학 : ");
		vo.setMat(sc.nextInt());
		// 총점
		int tot = vo.getKor() + vo.getEng() + vo.getMat();
		vo.setTot(tot);
		// 평균
		vo.setAvg((double)tot/3);
		
		// 리스트에 저장
		list.add(vo);
	}
	// 출력
	@Override
	public void print() {
		printTitle();
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	// 제목 출력
	@Override
	public void printTitle() {
		String str = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s", 
					"학번", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.println(str);
	}
	// 검색 : 학번
	@Override
	public void searchHak() {
		System.out.print("검색할 학번 : ");
		String hak = sc.next();
		
		for(int i=0; i<list.size(); i++) {
			ScoreVO vo = list.get(i);
			if(vo.getHak().equals(hak)) {
				printTitle();
				System.out.println(vo.toString());
			}
		}
	}
	// 검색 : 이름
	@Override
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		
		for(int i=0; i<list.size(); i++) {
			ScoreVO vo = list.get(i);
			if(vo.getName().equals(name)) {
				printTitle();
				System.out.println(vo.toString());
			}
		}
	}
	// 정렬 : 총점, 내림차순 => 정수
	@Override
	public void descSortTot() {
		// 정렬 기준 객체 생성
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot() ? 1 : -1;  // 내림차순 정렬 기준 연산
				//return vo1.getTot() > vo2.getTot() ? 1 : -1;  // 오름차순 정렬 기준 연산
			}
		};
		// 정렬
		// sort(list, 정렬기준 객체)
		Collections.sort(list, comp);
		// 출력
		print();
	}
	// 정렬 : 학번, 오름차순 => 문자열
	@Override
	public void ascSortHak() {
		// 정렬 기준 객체 생성
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getHak().compareTo(vo2.getHak());	// 오름차순 정렬 기준 연산
				//return vo2.getHak().compareTo(vo1.getHak());	// 내림차순 정렬 기준 연산
			}
		};
		
		Collections.sort(list, comp);
		print();
	}

}









