package score2;

import java.io.*;
import java.util.*;

public class ScoreImpl implements Score {
    Scanner sc = new Scanner(System.in);
    ScoreVO scoreVO = new ScoreVO();
    List<ScoreVO> list = new ArrayList<>();

    // 점수 입력용 함수
    private int scoreCheck(String subjectName) {

        while (true) {
            System.out.printf("%s 입력 : ", subjectName);
            int tmp = sc.nextInt();
            if (tmp > 100 || tmp < 0) {
                System.out.println("정상적인 점수를 입력해주세요.");
            } else
                return tmp;
        }
    }

    // 점수 계산
    private void calc(ScoreVO scoreVO) {
        scoreVO.setTotal(scoreVO.getEng() + scoreVO.getKor() + scoreVO.getMath());
        scoreVO.setAvg(scoreVO.getTotal() / 3d);
    }

    @Override
    public void input() {
        ScoreVO tmp = new ScoreVO();
        System.out.print("이름 : ");
        tmp.setName(sc.next());
        System.out.print("학번 : ");
        tmp.setStudentID(sc.next());
        tmp.setEng(scoreCheck("영어 점수"));
        tmp.setKor(scoreCheck("국어 점수"));
        tmp.setMath(scoreCheck("수학 점수"));
        calc(tmp); // total, avg 계산 및 적용
        list.add(tmp);
    }

    @Override
    public void print() {
        if (list.size() == 0) {
            System.out.println("등록된 학생이 없습니다.");
        } else {
            printTitle();
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).toString());
            }
        }
    }

    @Override
    public void printTitle() {
        System.out.println(String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s", "학번", "이름", "국어", "영어", "수학", "총점", "평균"));
    }

    @Override
    public void searchStudentID() {
        if (list.size() == 0) {
            System.out.println("등록된 학생이 없습니다.");
        } else {
            System.out.print("검색할 학번 입력 : ");
            String tmp = sc.next();

            boolean isThere = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getStudentID().equals(tmp)) {
                    printTitle();
                    System.out.println(list.get(i).toString());
                    isThere = true;
                }
            }
            if (!isThere) {
                System.out.println("검색한 학번의 학생이 존재하지 않습니다.");
            }

        }
    }

    @Override
    public void searchName() {
        if (list.size() == 0) {
            System.out.println("등록된 학생이 없습니다.");
        } else {
            System.out.print("검색할 학생 이름 입력 : ");
            String tmp = sc.next();
            boolean isThere = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().equals(tmp)) {
                    printTitle();
                    System.out.println(list.get(i).toString());
                    isThere = true;
                }
            }
            if (!isThere) {
                System.out.println("검색한 이름의 학생이 존재하지 않습니다.");
            }
        }

    }

    @Override
    public void descSortTotal() {
        // 정렬 기준 객체 생성
        Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
            @Override
            public int compare(ScoreVO vo1, ScoreVO vo2) {
                return vo1.getTotal() < vo2.getTotal() ? 1 : -1;
            }
        };
        // 정렬
        //
        Collections.sort(list, comp);
        print();
    }

    // sort 함수 default
    // 문자열 sort : 오름차순
    // 숫자 sort : 내림차순
    // 따라서 반대로 하고 싶을때는 Comparator 에서 return 값을 반대로 발생하게 만들면됨
    @Override
    public void ascSortStudentID() {
        // 정렬 기준 객체 생성
        Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
            @Override
            public int compare(ScoreVO o1, ScoreVO o2) {
                return o1.getName().compareTo(o2.getName()); //  유니코드 기준으로 비교 함. 크면 1 같으면 0 작으면 -1 반환
            }
        };
        Collections.sort(list, comp);
        print();
    }
    // 파일 저장
	@Override
	public void write(String path) {		
		ObjectInOut objectInOut = new ObjectInOut();
		boolean result = objectInOut.write(path, list);
		
		if(result) System.out.println("저장 성공");
		else System.out.println("저장 실패");
	}
	// 파일 저장
	@Override
	public void read(String path) {
		ObjectInOut objectInOut = new ObjectInOut();
		list = objectInOut.read(path);
		
		if(list.size() > 0) System.out.println("읽기 성공");
		else System.out.println("데이터가 없습니다.");
	}

    

}
