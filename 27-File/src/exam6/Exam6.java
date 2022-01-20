package exam6;

import java.util.ArrayList;
import java.util.List;

public class Exam6 {
	public static void main(String[] args) {
		List<StudentVO> list = new ArrayList<StudentVO>();
		ObjectInOut objectInOut = new ObjectInOut();
		
		list.add(new StudentVO("ȫ�浿", 25, "����"));
		list.add(new StudentVO("��ö��", 23, "����"));
		list.add(new StudentVO("�̿���", 26, "���"));
		list.add(new StudentVO("��浿", 35, "����"));
		
		// ���Ͽ� ����
		boolean result = objectInOut.write("student.txt", list);
		if(result) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
		
		// �����б�
		List<StudentVO> list2 = objectInOut.read("student.txt");
		for(int i=0; i<list2.size(); i++) {
			StudentVO vo = list2.get(i);
			System.out.println(vo.toString());
		}
	}
}
