package score2;

// ��ӹ޴� �ڽ�Ŭ�������� ���������� �Լ� ����
// ����
public interface Score {
    public void input(ScoreVO vo);	// �Է�
    public String output(); 		// ���
    public String printTitle();		// Ÿ��Ʋ ���
    public String num(String num);  // �˻� : �й�
    public String name(String name);// �˻� : �̸�
    public String save(String path);	// ���� ����
    public String read(String path);	// ���� �б�
}
