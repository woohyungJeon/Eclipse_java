package score;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Score score = new ScoreImpl();
		int ch;
		
		while(true) {
			do {
				System.out.println("1. 입력");
				System.out.println("2. 출력");
				System.out.println("3. 학번검색");
				System.out.println("4. 이름검색");
				System.out.println("5. 총점 내림차순 정렬");
				System.out.println("6. 학번 오름차순 정렬");
				System.out.println("7. 종료");
				System.out.println("------------------");
				System.out.print("번호 : ");
				ch = sc.nextInt();
				System.out.println();
			} while(ch<1 || ch>7);
			
			switch(ch) {
			case 1:	// 입력
				score.input();
				break;
			case 2:	// 출력
				score.print();
				break;
			case 3:	// 검색 : 학번
				score.searchHak();
				break;
			case 4:	// 검색 : 이름
				score.searchName();
				break;
			case 5:	// 정렬 : 총점, 내림차순
				score.descSortTot();
				break;
			case 6:	// 정렬 : 학번, 오름차순
				score.ascSortHak();
				break;
			case 7: 
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); 
				break;
			}		
			System.out.println();
		}
	}
}
