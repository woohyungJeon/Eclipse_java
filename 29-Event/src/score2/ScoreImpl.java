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
            result = "��ϵ� �л��� �����ϴ�.";
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
        		    "�й�", "�̸�", "����", "����", "����", "����", "���");
    }

    @Override
    public String num(String num) {
    	String result = "";
        if (list.size() == 0) {
            result = "��ϵ� �л��� �����ϴ�.";
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
                result = "�˻��� �й��� �л��� �������� �ʽ��ϴ�.";
            }            
        }
        return result;
    }

    @Override
    public String name(String name) {
    	String result = "";
    	
        if (list.size() == 0) {
            result = "��ϵ� �л��� �����ϴ�.";
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
                result = "�˻��� �̸��� �л��� �������� �ʽ��ϴ�.";
            }
        }
        return result;
    }

    // ���� ����
	@Override
	public String save(String path) {		
		ObjectInOut objectInOut = new ObjectInOut();
		boolean result = objectInOut.write(path, list);
		String str_result = "";
		if(result) str_result = "���� ����";
		else str_result = "���� ����";
		
		return str_result;
	}
	// ���� ����
	@Override
	public String read(String path) {
		ObjectInOut objectInOut = new ObjectInOut();
		list = objectInOut.read(path);
		String result = "";
		if(list.size() > 0) result = "�б� ����";
		else result = "�����Ͱ� �����ϴ�.";
		
		return result;
	}
}
