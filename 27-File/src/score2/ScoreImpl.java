package score2;

import java.io.*;
import java.util.*;

public class ScoreImpl implements Score {
    Scanner sc = new Scanner(System.in);
    ScoreVO scoreVO = new ScoreVO();
    List<ScoreVO> list = new ArrayList<>();

    // ���� �Է¿� �Լ�
    private int scoreCheck(String subjectName) {

        while (true) {
            System.out.printf("%s �Է� : ", subjectName);
            int tmp = sc.nextInt();
            if (tmp > 100 || tmp < 0) {
                System.out.println("�������� ������ �Է����ּ���.");
            } else
                return tmp;
        }
    }

    // ���� ���
    private void calc(ScoreVO scoreVO) {
        scoreVO.setTotal(scoreVO.getEng() + scoreVO.getKor() + scoreVO.getMath());
        scoreVO.setAvg(scoreVO.getTotal() / 3d);
    }

    @Override
    public void input() {
        ScoreVO tmp = new ScoreVO();
        System.out.print("�̸� : ");
        tmp.setName(sc.next());
        System.out.print("�й� : ");
        tmp.setStudentID(sc.next());
        tmp.setEng(scoreCheck("���� ����"));
        tmp.setKor(scoreCheck("���� ����"));
        tmp.setMath(scoreCheck("���� ����"));
        calc(tmp); // total, avg ��� �� ����
        list.add(tmp);
    }

    @Override
    public void print() {
        if (list.size() == 0) {
            System.out.println("��ϵ� �л��� �����ϴ�.");
        } else {
            printTitle();
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).toString());
            }
        }
    }

    @Override
    public void printTitle() {
        System.out.println(String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s", "�й�", "�̸�", "����", "����", "����", "����", "���"));
    }

    @Override
    public void searchStudentID() {
        if (list.size() == 0) {
            System.out.println("��ϵ� �л��� �����ϴ�.");
        } else {
            System.out.print("�˻��� �й� �Է� : ");
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
                System.out.println("�˻��� �й��� �л��� �������� �ʽ��ϴ�.");
            }

        }
    }

    @Override
    public void searchName() {
        if (list.size() == 0) {
            System.out.println("��ϵ� �л��� �����ϴ�.");
        } else {
            System.out.print("�˻��� �л� �̸� �Է� : ");
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
                System.out.println("�˻��� �̸��� �л��� �������� �ʽ��ϴ�.");
            }
        }

    }

    @Override
    public void descSortTotal() {
        // ���� ���� ��ü ����
        Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
            @Override
            public int compare(ScoreVO vo1, ScoreVO vo2) {
                return vo1.getTotal() < vo2.getTotal() ? 1 : -1;
            }
        };
        // ����
        //
        Collections.sort(list, comp);
        print();
    }

    // sort �Լ� default
    // ���ڿ� sort : ��������
    // ���� sort : ��������
    // ���� �ݴ�� �ϰ� �������� Comparator ���� return ���� �ݴ�� �߻��ϰ� ������
    @Override
    public void ascSortStudentID() {
        // ���� ���� ��ü ����
        Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
            @Override
            public int compare(ScoreVO o1, ScoreVO o2) {
                return o1.getName().compareTo(o2.getName()); //  �����ڵ� �������� �� ��. ũ�� 1 ������ 0 ������ -1 ��ȯ
            }
        };
        Collections.sort(list, comp);
        print();
    }
    // ���� ����
	@Override
	public void write(String path) {		
		ObjectInOut objectInOut = new ObjectInOut();
		boolean result = objectInOut.write(path, list);
		
		if(result) System.out.println("���� ����");
		else System.out.println("���� ����");
	}
	// ���� ����
	@Override
	public void read(String path) {
		ObjectInOut objectInOut = new ObjectInOut();
		list = objectInOut.read(path);
		
		if(list.size() > 0) System.out.println("�б� ����");
		else System.out.println("�����Ͱ� �����ϴ�.");
	}

    

}
