import java.util.Scanner;

public class Controller {
	// 선언
	Scanner sc = new Scanner(System.in);
	PersonVO[] list = new PersonVO[5];	// 객체 배열 = 클래스 레퍼런스 변수 배열
	int listCnt = 0;	// 배열의 위치를 관리하는 변수 = 회원 총 수 저장
	// 입력
	// => 객체1개에 데이터 저장
	void input() {
		if(listCnt < 5) {
			list[listCnt] = new PersonVO();
			System.out.print("이름 : ");
			list[listCnt].setName(sc.next());
			System.out.print("나이 : ");
			list[listCnt].setAge(sc.nextInt());
			System.out.print("전화 : ");
			list[listCnt].setTel(sc.next());
			
			listCnt++;	// 회원수 증가
		} else {
			System.out.println("인원은 5명까지 입니다.");
		}
	}
	// 연산
	// 출력
	void output() {
		for(int i=0; i<listCnt; i++) {
			System.out.println(list[i].toString());
		}
	}
}
