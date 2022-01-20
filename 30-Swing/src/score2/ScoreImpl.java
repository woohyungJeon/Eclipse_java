package score2;

import java.io.*;
import java.util.*;
// ó�� ����� ���ڿ��� ������
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
            result = "��ϵ� �л��� �����ϴ�." + "\n";
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
        return "�й�\t�̸�\t����\t����\t����\t����\t���\n";
    }

    @Override
    public String searchStudentID(String id) {
        String result = "";
    	if (list.size() == 0) {
            result = "��ϵ� �л��� �����ϴ�.";
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
                result = "�˻��� �й��� �л��� �������� �ʽ��ϴ�.";
            }
        }
    	return result;
    }

    @Override
    public String searchName(String name) {
    	String result = "";
        if (list.size() == 0) {
            result = "��ϵ� �л��� �����ϴ�.";
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
                result = "�˻��� �̸��� �л��� �������� �ʽ��ϴ�.";
            }
        }
        return result;
    }

   
    // ���� ����
	@Override
	public String write(String path) {		
		ObjectInOut objectInOut = new ObjectInOut();
		boolean result_chk = objectInOut.write(path, list);
		String result = "";
		if(result_chk) result = "���� ����";
		else result = "���� ����";
		return result;
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
