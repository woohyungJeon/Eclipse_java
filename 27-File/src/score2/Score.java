package score2;

// ��ӹ޴� �ڽ�Ŭ�������� ���������� �Լ� ����
// ����
public interface Score {
    public void input(); 			// �Է�
    public void print(); 			// ���
    public void printTitle(); 		// ���� ���
    public void searchStudentID();  // �˻� : �й�
    public void searchName();   	// �˻� : �̸�
    public void descSortTotal();    // ���� : ����, ��������
    public void ascSortStudentID(); // ���� : �й�, ��������
    public void write(String path);	// ���� ����
    public void read(String path);	// ���� �б�
}
