package score2;

import java.io.*;
import java.util.*;
// 처리 결과는 문자열로 리턴함
public class ScoreImpl implements Score {
    Scanner sc = new Scanner(System.in);
    List<ScoreVO> list = new ArrayList<>();


    @Override
    public void input(ScoreVO vo) {
        list.add(vo);
    }

    @Override
    public String print() {
    	String result = "";
        if (list.size() == 0) {
            result = "등록된 학생이 없습니다." + "\n";
        } else {
            result = printTitle();
            for (int i = 0; i < list.size(); i++) {
               result += list.get(i).toString() + "\n";
            }
        }
        return result;
    }

    @Override
    public String printTitle() {
        return "학번\t이름\t국어\t영어\t수학\t총점\t평균\n";
    }

    @Override
    public String searchStudentID(String id) {
        String result = "";
    	if (list.size() == 0) {
            result = "등록된 학생이 없습니다.";
        } else {
            boolean isThere = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getStudentID().equals(id)) {
                	result = printTitle();
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
    public String searchName(String name) {
    	String result = "";
        if (list.size() == 0) {
            result = "등록된 학생이 없습니다.";
        } else {
        	
            boolean isThere = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().equals(name)) {
                	result = printTitle();
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
	public String write(String path) {		
		ObjectInOut objectInOut = new ObjectInOut();
		boolean result_chk = objectInOut.write(path, list);
		String result = "";
		if(result_chk) result = "저장 성공";
		else result = "저장 실패";
		return result;
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
