
public class FileArticle extends Article{
	// �ڷ��� Ȯ�� => ���� �̸�
	private String fileName;
	
	public FileArticle() {
		super();	// �θ� Ŭ���� ������ ȣ��
		System.out.println("FileArticle() ȣ��");
	}
	// �ּ� ó�� : ctrl + '/'
	@Override
	public String toString() {
		return "�ڷ�� [÷������=" + fileName + ", �۹�ȣ=" + getNum() + ", ����=" + getTitle() + "]";
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}	
}
