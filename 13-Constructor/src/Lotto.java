import java.util.Random;
import java.util.Scanner;
/*
 1) 구매 횟수 입력
 2) 로또번호 1세트 생성
 3) 로또번호 정렬
 4) 로또번호 1세트 출력 
 */
public class Lotto {
	int[] m;		// 로또번호 1세트 저장
	int buyNum;		// 구매횟수 저장
	
	public Lotto() {
		m = new int[6];
	}
	// 구매횟수 입력
	public void inputBuyNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("구매 횟수를 입력하세요 : ");
		buyNum = sc.nextInt();
		System.out.println();  // 한줄 넘김
	}
	// 로또번호 1세트 생성
	// => 1~45 사이의 정수 6개로 구성
	// => 숫자는 중복되면 안됨   
	public void selectLotto() {
		boolean chk = false;	// 중복여부 저장, true : 중복, false : 중복없음
		Random random = new Random();
		// 첫번째 숫자 생성
		m[0] = random.nextInt(45) + 1;	// 1~45 사이의 임의의 정수값 1개
		
		for(int a=1; a<6; ) {			// 기준값
			m[a] = random.nextInt(45) + 1;  // 다음 숫자 생성
			chk = false;
			// 번호 중복 검사
			for(int b=0; b<a; b++) {	// 비교값
				if(m[a] == m[b]) {
					chk = true;
					break;
				}
			}
			
			if(!chk) a++;
		}
	}
	
	// 로또번호 1세트 정렬 (오름차순) - 선택 정렬
	public void sort() {
		for(int x=0; x<5; x++) {		// 기준
			for(int y=x+1; y<6; y++) {	// 비교
				if(m[x] > m[y]) {
					// 두값을 교환
					int temp = m[x];
					m[x] = m[y];
					m[y] = temp;
				}
			}
		}
	}
	// 로또번호 1세트 출력
	public void outputResult() {
		for(int i=0; i<m.length; i++) {
			System.out.printf("%2d ", m[i]);
		}
		System.out.println();  // 1줄 넘김
	}
	// 전체관리
	public void doLotto() {
		inputBuyNum(); 	// 구매횟수 입력
		for(int i=0; i<buyNum; i++) {
			selectLotto();	// 1세트 로또번호 생성
			sort();			// 1세트 로또번호 오름차순 정렬
			outputResult();	// 1세트 출력
		}
	}
}





