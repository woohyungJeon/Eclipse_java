package prac5;

import java.util.Scanner;

public class CustomerImpl extends Customer{
	Scanner sc = new Scanner(System.in);
	CustomerVO[] customer = new CustomerVO[10];	// ��ü�迭
	int cnt = 0;	// ���� ����
	// �Է�
	@Override
	public void input() {
		customer[cnt] = new CustomerVO();
		System.out.print("����ȣ : ");
		customer[cnt].setAno(sc.next());
		System.out.print("��   �� : ");
		customer[cnt].setName(sc.next());
		System.out.print("��ȭ��ȣ : ");
		customer[cnt].setTel(sc.next());

		cnt++;	// ���� ����
	}
	// ���
	@Override
	public void outputTitle() {
		System.out.println("����ȣ" + "\t" + "�̸�" + "\t" + "��ȭ��ȣ");
	}
	@Override
	public void output() {
		outputTitle();
		for (int i = 0; i < cnt; i++) {
			System.out.println(customer[i].toString());
		}
	}
	// ���� ���
	@Override
	public void revise() {
		boolean chk_name = false; // ture : ����, false : ����
		System.out.print("������ �̸�? ");
		String name = sc.next();		

		for (int i = 0; i < cnt; i++) {
			if (customer[i].getName().equals(name)) {
				outputTitle();
				System.out.println(customer[i].toString());
				System.out.println();

				System.out.print("����ȣ : ");
				customer[i].setAno(sc.next());
				System.out.print("��   �� : ");
				customer[i].setName(sc.next());
				System.out.print("��ȭ��ȣ : ");
				customer[i].setTel(sc.next());
				
				chk_name = true;	// �̸� ����
				break;
			} 
		}
		
		if(!chk_name) {
			System.out.println("��ϵ� �̸��� �����ϴ�.");
		}
		System.out.println();
	}
	// �̸� �˻� ���
	@Override
	public void findName() {
		boolean chk_name = false; // ture : ����, false : ����
		System.out.print("�˻��� �̸�? ");
		String name = sc.next();

		for (int i = 0; i < cnt; i++) {
			if (customer[i].getName().equals(name)) {
				outputTitle();
				System.out.println(customer[i].toString());
				chk_name = true;
				break;
			} 
		}
		
		if(!chk_name) {
			System.out.println("��ϵ� �̸��� �����ϴ�.");
		}
	}
	// ���α׷� ����
	@Override
	public void pgm_end() {
		System.out.println("�����մϴ�.");
		System.exit(0);
	}
}