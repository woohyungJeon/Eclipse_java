
public class Exam3 {
	public static void main(String[] args) {
		// �͸�Ŭ������ ������ ���
		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("Test thread 3");
				for(int i=0; i<58; i++) {
					System.out.println((char)(i+65));
				}
			}
		};
		
		thread.start();
		
		// main thread�μ� ���۵Ǵ� ��ɾ�
		for (int i = 0; i < 500; i++) {
			System.out.println(i);
		}

		System.out.println("���α׷� ����");
	}
}
