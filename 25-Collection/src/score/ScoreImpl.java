package score;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score{
	// ������ �����
	List<ScoreVO> list = new ArrayList<ScoreVO>();
	Scanner sc = new Scanner(System.in);
	
	// �Է�
	@Override
	public void input() {
		// ��ü ���� : 1�� ������ �����
		ScoreVO vo = new ScoreVO();
		System.out.print("�й� : ");
		vo.setHak(sc.next());
		System.out.print("�̸� : ");
		vo.setName(sc.next());
		System.out.print("���� : ");
		vo.setKor(sc.nextInt());
		System.out.print("���� : ");
		vo.setEng(sc.nextInt());
		System.out.print("���� : ");
		vo.setMat(sc.nextInt());
		// ����
		int tot = vo.getKor() + vo.getEng() + vo.getMat();
		vo.setTot(tot);
		// ���
		vo.setAvg((double)tot/3);
		
		// ����Ʈ�� ����
		list.add(vo);
	}
	// ���
	@Override
	public void print() {
		printTitle();
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	// ���� ���
	@Override
	public void printTitle() {
		String str = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s", 
					"�й�", "�̸�", "����", "����", "����", "����", "���");
		System.out.println(str);
	}
	// �˻� : �й�
	@Override
	public void searchHak() {
		System.out.print("�˻��� �й� : ");
		String hak = sc.next();
		
		for(int i=0; i<list.size(); i++) {
			ScoreVO vo = list.get(i);
			if(vo.getHak().equals(hak)) {
				printTitle();
				System.out.println(vo.toString());
			}
		}
	}
	// �˻� : �̸�
	@Override
	public void searchName() {
		System.out.print("�˻��� �̸� : ");
		String name = sc.next();
		
		for(int i=0; i<list.size(); i++) {
			ScoreVO vo = list.get(i);
			if(vo.getName().equals(name)) {
				printTitle();
				System.out.println(vo.toString());
			}
		}
	}
	// ���� : ����, �������� => ����
	@Override
	public void descSortTot() {
		// ���� ���� ��ü ����
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot() ? 1 : -1;  // �������� ���� ���� ����
				//return vo1.getTot() > vo2.getTot() ? 1 : -1;  // �������� ���� ���� ����
			}
		};
		// ����
		// sort(list, ���ı��� ��ü)
		Collections.sort(list, comp);
		// ���
		print();
	}
	// ���� : �й�, �������� => ���ڿ�
	@Override
	public void ascSortHak() {
		// ���� ���� ��ü ����
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getHak().compareTo(vo2.getHak());	// �������� ���� ���� ����
				//return vo2.getHak().compareTo(vo1.getHak());	// �������� ���� ���� ����
			}
		};
		
		Collections.sort(list, comp);
		print();
	}

}









