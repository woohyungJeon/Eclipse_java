import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book book = new BookImpl();
		
		String path ="./Book.txt";
		
		int num;

		while (true) {
			System.out.println("1. ���� ���");
			System.out.println("2. ���� ��� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� �б�");
			System.out.println("5. ����");
			System.out.println("----------------------");
			System.out.print("��ȣ : ");
			num = sc.nextInt();

			System.out.println();

			switch (num) {
			case 1:
				book.input();
				break;
			case 2:
				book.list();
				break;
			case 3:
				book.fileUpload(path);
				break;
			case 4:
				book.fileRead(path);
				break;
			case 5:
				book.exit();
				break;
			default:
				System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
		
			System.out.println("***********************************************");
		}

	}
}
