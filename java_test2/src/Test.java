import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book book = new BookImpl();
		
		String path ="./Book.txt";
		
		int num;

		while (true) {
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 목록 출력");
			System.out.println("3. 파일 저장");
			System.out.println("4. 파일 읽기");
			System.out.println("5. 종료");
			System.out.println("----------------------");
			System.out.print("번호 : ");
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
				System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
		
			System.out.println("***********************************************");
		}

	}
}
