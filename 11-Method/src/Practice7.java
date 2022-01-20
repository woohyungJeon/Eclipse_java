import java.util.Scanner;

public class Practice7 {
	static int menu() {
		Scanner in = new Scanner(System.in);
		System.out.println("\n��ǰ ���� ���α׷�");
		System.out.println("**************");
		System.out.println("1. �԰�");
		System.out.println("2. ���");
		System.out.println("3. ���");
		System.out.println("4. ����");
		System.out.println("**************");
		System.out.print("�޴� : ");
		int input_num = in.nextInt();
		System.out.println();

		return input_num;
	}

	static void in_goods(String[] product, int[] quantity, int[] price, 
				         int[] total_price, int cnt) {
		Scanner in = new Scanner(System.in);

		System.out.print("ǰ�� : ");
		product[cnt] = in.next();
		System.out.print("���� : ");
		quantity[cnt] = in.nextInt();
		System.out.print("�ܰ� : ");
		price[cnt] = in.nextInt();
		// �Ѿ� ����
		total_price[cnt] = compute(quantity[cnt], price[cnt]);
	}

	static int compute(int quantity, int price) {
		return quantity * price;
	}

	static void out_goods(String[] product, int[] quantity, int[] price, 
						  int[] total_price, int cnt) {
		Scanner in = new Scanner(System.in);

		System.out.print("ǰ�� : ");
		String out_product = in.next();
		System.out.print("���� : ");
		int out_quantity = in.nextInt();
		System.out.println();

		int flag = -1; // ���� ����, 0 : ǰ�� ����, -1 : ǰ���� ����

		// ��½� �������� ���������� �Ѵ�
		for (int i = 0; i < cnt; i++) {
			if (product[i].equals(out_product)) {  // �Է� ǰ��� ����� ǰ���� ��ġ�Ǵ� ���� �ִ��� �˻�
				int qty = quantity[i] - out_quantity;
				if (qty >= 0) { // ��� ����ϸ�
					quantity[i] = qty;
					total_price[i] = compute(quantity[i], price[i]);
				} else { 		// ��� �����ϸ�
					System.out.println("��� �����մϴ�. ���� ��� : " + quantity[i]);
				}

				flag = 0; // ��ǰ ����
				break; // for�� Ż��
			}
		}

		if (flag == -1)
			System.out.println(out_product + " ��ǰ�� �����ϴ�.");
	}

	static void output_list(String[] product, int[] quantity, int[] price, 
							int[] total_price, int cnt) {
		System.out.println("ǰ��\t ����\t �ܰ�(��)\t �Ѿ�(��)");		// \t : ��Ű
		
		for (int i = 0; i < cnt; i++) {			
			System.out.printf("%s\t %d\t %d\t %d\n", 
						product[i], quantity[i], price[i], total_price[i]);
		}
	}

	public static void main(String[] args) {
		// ����
		String[] product = new String[20]; 	// ��ǰ��
		int[] quantity = new int[20]; 		// ����
		int[] price = new int[20]; 			// �ܰ�
		int[] total_price = new int[20]; 	// ����
		int cnt = 0; 						// ��ü ��ǰ ����, ����� ��ǰ�� ���� ����

		// �Է�, ����, ���
		while (true) {
			// �޴�
			int menu_num = menu();

			if (menu_num == 1) { // �԰�
				if (cnt < 20) { // ��ǰ�� ������ 20�� ����
					in_goods(product, quantity, price, total_price, cnt);
					cnt++;
				} else {
					System.out.println("20�� �ʰ��Դϴ�. ��ǰ ������ ������ �ִ� 20���Դϴ�.");
				}
			} else if (menu_num == 2) { // ���
				out_goods(product, quantity, price, total_price, cnt);
			} else if (menu_num == 3) { // ���
				output_list(product, quantity, price, total_price, cnt);
			} else if (menu_num == 4) { // ����
				System.out.println("���Ḧ �����ϼ̽��ϴ�. ���α׷��� �����մϴ�");
				break;
			} else {
				System.out.println("�߸��� �Է��Դϴ�. 1~4");
			}

			System.out.println(); // 1�� �ѱ�
		}
	}
}
