package score2;

import java.util.Scanner;

public class Exam5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Score score = new ScoreImpl();
        int select;
        // ���α׷� ������ ��, ���� �о����
        score.read("src/score2/Data.txt"); 

        while (true){
        	System.out.println();
        	System.out.println("1. �Է�");
        	System.out.println("2. ���");
        	System.out.println("3. �̸� �˻�");
        	System.out.println("4. �й� �˻�");
        	System.out.println("5. ���� �������� ����");
        	System.out.println("6. �й� �������� ����");
        	System.out.println("7. ���� ����");
        	System.out.println("8. ���� �б�");
        	System.out.println("9. ����");
            System.out.print("�Է� : ");
            select = sc.nextInt();
            
            System.out.println();
            
            switch (select)
            {
                case 1:
                    score.input();
                    break;
                case 2:
                    score.print();
                    break;
                case 3:
                    score.searchName();
                    break;
                case 4:
                    score.searchStudentID();
                    break;
                case 5:
                    score.descSortTotal();
                    break;
                case 6:
                    score.ascSortStudentID();
                    break;
                case 7:	// ���� ����
                    score.write("src/score2/Data.txt");
                    break;
                case 8:	// ���� �б�
                    score.read("src/score2/Data.txt");
                    break;
                case 9:	// ����
                    System.out.println("���� �� ���� �մϴ�.");
                    score.write("src/score2/Data.txt");
                    System.exit(0);
                default:
                    System.out.println("�ٽ� �Է����ּ���.");
                    continue;
            }
            System.out.println("------------------------------------------------------------------------");
        }
    }
}
