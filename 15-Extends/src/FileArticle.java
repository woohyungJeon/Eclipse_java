
public class FileArticle extends Article{
	// 자료의 확장 => 파일 이름
	private String fileName;
	
	public FileArticle() {
		super();	// 부모 클래스 생성자 호출
		System.out.println("FileArticle() 호출");
	}
	// 주석 처리 : ctrl + '/'
	@Override
	public String toString() {
		return "자료실 [첨부파일=" + fileName + ", 글번호=" + getNum() + ", 제목=" + getTitle() + "]";
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}	
}
