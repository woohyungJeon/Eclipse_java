package score2;

// 상속받는 자식클래스에게 강제적으로 함수 적용
// 목차
public interface Score {
    public void input(ScoreVO vo); 				// 입력
    public String print(); 						// 출력
    public String printTitle(); 				// 제목 출력
    public String searchStudentID(String id);  	// 검색 : 학번
    public String searchName(String name);   	// 검색 : 이름
    public String write(String path);			// 파일 저장
    public String read(String path);			// 파일 읽기
}
