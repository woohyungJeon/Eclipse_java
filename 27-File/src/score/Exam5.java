package score;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Score score = new ScoreImpl();
		int ch;
		
		while(true) {
			do {
				System.out.println("1. �Է�");
				System.out.println("2. ���");
				System.out.println("3. �й��˻�");
				System.out.println("4. �̸��˻�");
				System.out.println("5. ���� �������� ����");
				System.out.println("6. �й� �������� ����");
				System.out.println("7. ����");
				System.out.println("------------------");
				System.out.print("��ȣ : ");
				ch = sc.nextInt();
				System.out.println();
			} while(ch<1 || ch>7);
			
			switch(ch) {
			case 1:	// �Է�
				score.input();
				break;
			case 2:	// ���
				score.print();
				break;
			case 3:	// �˻� : �й�
				score.searchHak();
				break;
			case 4:	// �˻� : �̸�
				score.searchName();
				break;
			case 5:	// ���� : ����, ��������
				score.descSortTot();
				break;
			case 6:	// ���� : �й�, ��������
				score.ascSortHak();
				break;
			case 7: 
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0); 
				break;
			}		
			System.out.println();
		}
	}
}
