import java.util.Scanner;

public class SalaryMenu extends SalaryVO {
	Scanner sc = new Scanner(System.in);

	SalaryVO[] salary = new SalaryVO[20];
	int num = 0;	// �������� �����ϴ� ����

	// �Է�
	public void input() {
		if (num < 20) {
			salary[num] = new SalaryVO();
			System.out.print("�̸� : ");
			salary[num].setName(sc.next());
			System.out.print("���� : ");
			salary[num].setRank(sc.next());
			System.out.print("�⺻�� : ");
			salary[num].setNormal(sc.nextInt());
			System.out.print("���� : ");
			salary[num].setAlw(sc.nextInt());
			
			calc_tariff(num);	// ���� ���
			calc_salary(num);	// ���� ���
			
			num++;	// ������ ����
		} else {
			System.out.println("�ο��� 20�� ���� �Դϴ�.");
		}
	}
	// ���� ���
	public void calc_salary(int n) {		
		int sal = (int)(salary[n].getNormal() + salary[n].getAlw() 
				     - (salary[n].getNormal() + salary[n].getAlw()) * salary[n].getTariff());
		salary[n].setSalary(sal);
	}
	// ���� ���
	public void calc_tariff(int n) {
		/* ���� : �⺻�� + ����
		 * ������ 200���� ���� : 1%(0.01) 400���� ���� : 2%(0.02) 400���� �ʰ� : 3%(0.03)
		 */
		int sal = salary[n].getNormal() + salary[n].getAlw();

		if (sal <= 2000000) {
			salary[n].setTariff(0.01);
		} else if (sal <= 4000000) {
			salary[n].setTariff(0.02);
		} else if (sal > 4000000) {
			salary[n].setTariff(0.03);
		}
	}

	// ���
	public void output_title() {
		// Ÿ��Ʋ ���
		String title = "�̸�\t����\t�⺻��\t����\t����\t����";		
		System.out.println(title);
	}
	public void output() {
		output_title();
		
		for (int i = 0; i < num; i++) {
			System.out.println(salary[i].toString());
		}
	}

	// ����
	public void modify() {
		boolean chk_name = false; // �̸� ���� ���� ����, true: ����, faslse: �������� ����
		System.out.print("������ ������ �̸��� �Է��Ͻÿ� :");
		String name = sc.next();

		for (int i = 0; i < num; i++) {
			if (salary[i].getName().equals(name)) {
				output_title();			// Ÿ��Ʋ ���
				System.out.println(salary[i].toString());	// �˻� ��� ���
				System.out.println(); 	// ���ٳѱ�

				System.out.print("���� : ");
				salary[i].setRank(sc.next());
				System.out.print("�⺻�� : ");
				salary[i].setNormal(sc.nextInt());
				System.out.print("���� : ");
				salary[i].setAlw(sc.nextInt());
				
				calc_tariff(i);	// ���� ���
				calc_salary(i);	// ���� ���

				chk_name = true;
				break;
			}
		}

		if (!chk_name) {
			System.out.println("��ϵ� �̸��� �����ϴ�.");
			System.out.println(); // ���� �ѱ�
		}
	} //

	// �˻�
	public void searchName() {
		boolean chk_name = false;
		System.out.println("�˻��� ������ �̸��� �Է��Ͻÿ� : ");
		String name = sc.next();

		for (int i = 0; i < num; i++) {
			if (salary[i].getName().equals(name)) {
				output_title();
				System.out.println(salary[i].toString());
				System.out.println(); // ���� �ѱ�

				chk_name = true;
				break;
			}
		}
		if (!chk_name) {
			System.out.println("��ϵ� �̸��� �����ϴ�.");
		}
	}
}
