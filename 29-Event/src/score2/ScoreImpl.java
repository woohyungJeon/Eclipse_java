package score2;

import java.io.*;
import java.util.*;

public class ScoreImpl implements Score {
    Scanner sc = new Scanner(System.in);    
    List<ScoreVO> list = new ArrayList<>(); 

    @Override
    public void input(ScoreVO vo) { 
        list.add(vo);
    }

    @Override
    public String output() {
    	String result = "";
        if (list.size() == 0) {
            result = "등록된 학생이 없습니다.";
        } else {
            result = printTitle() + "\n";
            for (int i = 0; i < list.size(); i++) {
                result += list.get(i).toString() + "\n";
            }
        }
        return result;
    }

    @Override
    public String printTitle() {
        return String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s", 
        		    "학번", "이름", "국어", "영어", "수학", "총점", "평균");
    }

    @Override
    public String num(String num) {
    	String result = "";
        if (list.size() == 0) {
            result = "등록된 학생이 없습니다.";
        } else {            
            boolean isThere = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getStudentID().equals(num)) {
                    result = printTitle() + "\n";
                    result += list.get(i).toString() + "\n";
                    isThere = true;
                }
            }
            if (!isThere) {
                result = "검색한 학번의 학생이 존재하지 않습니다.";
            }            
        }
        return result;
    }

    @Override
    public String name(String name) {
    	String result = "";
    	
        if (list.size() == 0) {
            result = "등록된 학생이 없습니다.";
        } else {            
            boolean isThere = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().equals(name)) {
                    result = printTitle() + "\n";
                    result += list.get(i).toString() + "\n";
                    isThere = true;
                }
            }
            if (!isThere) {
                result = "검색한 이름의 학생이 존재하지 않습니다.";
            }
        }
        return result;
    }

    // 파일 저장
	@Override
	public String save(String path) {		
		ObjectInOut objectInOut = new ObjectInOut();
		boolean result = objectInOut.write(path, list);
		String str_result = "";
		if(result) str_result = "저장 성공";
		else str_result = "저장 실패";
		
		return str_result;
	}
	// 파일 저장
	@Override
	public String read(String path) {
		ObjectInOut objectInOut = new ObjectInOut();
		list = objectInOut.read(path);
		String result = "";
		if(list.size() > 0) result = "읽기 성공";
		else result = "데이터가 없습니다.";
		
		return result;
	}
}
