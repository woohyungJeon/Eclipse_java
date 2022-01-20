package score2;

// 상속받는 자식클래스에게 강제적으로 함수 적용
// 목차
public interface Score {
    public void input(); 			// 입력
    public void print(); 			// 출력
    public void printTitle(); 		// 제목 출력
    public void searchStudentID();  // 검색 : 학번
    public void searchName();   	// 검색 : 이름
    public void descSortTotal();    // 정렬 : 총점, 내림차순
    public void ascSortStudentID(); // 정렬 : 학번, 오름차순
    public void write(String path);	// 파일 저장
    public void read(String path);	// 파일 읽기
}
