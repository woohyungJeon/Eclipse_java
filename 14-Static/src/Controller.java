import java.util.Scanner;

public class Controller {
	// ����
	Scanner sc = new Scanner(System.in);
	PersonVO[] list = new PersonVO[5];	// ��ü �迭 = Ŭ���� ���۷��� ���� �迭
	int listCnt = 0;	// �迭�� ��ġ�� �����ϴ� ���� = ȸ�� �� �� ����
	// �Է�
	// => ��ü1���� ������ ����
	void input() {
		if(listCnt < 5) {
			list[listCnt] = new PersonVO();
			System.out.print("�̸� : ");
			list[listCnt].setName(sc.next());
			System.out.print("���� : ");
			list[listCnt].setAge(sc.nextInt());
			System.out.print("��ȭ : ");
			list[listCnt].setTel(sc.next());
			
			listCnt++;	// ȸ���� ����
		} else {
			System.out.println("�ο��� 5����� �Դϴ�.");
		}
	}
	// ����
	// ���
	void output() {
		for(int i=0; i<listCnt; i++) {
			System.out.println(list[i].toString());
		}
	}
}
