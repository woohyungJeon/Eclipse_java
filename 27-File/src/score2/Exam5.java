package score2;

import java.util.Scanner;

public class Exam5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Score score = new ScoreImpl();
        int select;
        // 프로그램 시작할 때, 파일 읽어오기
        score.read("src/score2/Data.txt"); 

        while (true){
        	System.out.println();
        	System.out.println("1. 입력");
        	System.out.println("2. 출력");
        	System.out.println("3. 이름 검색");
        	System.out.println("4. 학번 검색");
        	System.out.println("5. 총점 내림차순 정렬");
        	System.out.println("6. 학번 오름차순 정렬");
        	System.out.println("7. 파일 저장");
        	System.out.println("8. 파일 읽기");
        	System.out.println("9. 종료");
            System.out.print("입력 : ");
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
                case 7:	// 파일 저장
                    score.write("src/score2/Data.txt");
                    break;
                case 8:	// 파일 읽기
                    score.read("src/score2/Data.txt");
                    break;
                case 9:	// 종료
                    System.out.println("저장 및 종료 합니다.");
                    score.write("src/score2/Data.txt");
                    System.exit(0);
                default:
                    System.out.println("다시 입력해주세요.");
                    continue;
            }
            System.out.println("------------------------------------------------------------------------");
        }
    }
}
