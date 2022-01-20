package score2;

// 상속받는 자식클래스에게 강제적으로 함수 적용
// 목차
public interface Score {
    public void input(ScoreVO vo);	// 입력
    public String output(); 		// 출력
    public String printTitle();		// 타이틀 출력
    public String num(String num);  // 검색 : 학번
    public String name(String name);// 검색 : 이름
    public String save(String path);	// 파일 저장
    public String read(String path);	// 파일 읽기
}
