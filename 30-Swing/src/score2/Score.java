package score2;

// ��ӹ޴� �ڽ�Ŭ�������� ���������� �Լ� ����
// ����
public interface Score {
    public void input(ScoreVO vo); 				// �Է�
    public String print(); 						// ���
    public String printTitle(); 				// ���� ���
    public String searchStudentID(String id);  	// �˻� : �й�
    public String searchName(String name);   	// �˻� : �̸�
    public String write(String path);			// ���� ����
    public String read(String path);			// ���� �б�
}
