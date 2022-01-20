package score;
// 인터페이스의 용도
// 1. 상속받는 자식클래스에게 강제적으로 함수를 만들게 함
// 2. 목차
public interface Score {
	public void input();		// 입력
	public void print();		// 출력
	public void printTitle();	// 제목 출력
	public void searchHak();	// 검색 : 학번
	public void searchName();	// 검색 : 이름
	public void descSortTot();	// 정렬 : 총점, 내림차순
	public void ascSortHak();	// 정렬 : 학번, 오름차순
}
