package customer;

public interface Customer {
	public void input();			// �Է�
	public void output();			// ���
	public void cnSearch();			//����ȣ �˻�
	public void nameSearch();		//���̸� �˻�
	public void phoneSearch();		//����ȭ��ȣ �˻�
	public void nameSort();			// �̸����� 
	public void phoneSort();		// ��ȭ��ȣ ����
	public void write(String path);	//���� ����
	public void read(String path);	//���� �б�
}
