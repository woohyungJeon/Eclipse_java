
public class Exam2 {
	public static void main(String[] args) {
		int[][] grade = new int[3][3];
		String[] name = {"ȫ�浿", "��ö��", "�̿���"};
		
		// ȫ�浿 ���� ���� ����
		grade[0][0] = 75;
		grade[0][1] = 82;
		grade[0][2] = 95;
		// ��ö��
		grade[1][0] = 88;
		grade[1][1] = 64;
		grade[1][2] = 70;
		// �̿���
		grade[2][0] = 100;
		grade[2][1] = 95;
		grade[2][2] = 90;
		
		// �л��� ���� ������ ��� ���ϱ�
		for(int i=0; i<grade.length; i++) {		// ��
			int sum = 0;
			int avg = 0;
			
			for(int j=0; j<grade[i].length; j++) { // ��
				sum += grade[i][j];
			}
			avg = sum / grade[i].length;
			
			System.out.println(name[i] + ", ����=" + sum + ", ���=" + avg);
		}
	}
}
