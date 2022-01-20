package customer;

public interface Customer {
	public void input();			// 입력
	public void output();			// 출력
	public void cnSearch();			//고객번호 검색
	public void nameSearch();		//고객이름 검색
	public void phoneSearch();		//고객전화번호 검색
	public void nameSort();			// 이름정렬 
	public void phoneSort();		// 전화번호 정렬
	public void write(String path);	//파일 저장
	public void read(String path);	//파일 읽기
}
