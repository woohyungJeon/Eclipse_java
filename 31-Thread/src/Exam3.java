
public class Exam3 {
	public static void main(String[] args) {
		// 익명클래스로 쓰레드 사용
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
		
		// main thread로서 동작되는 명령어
		for (int i = 0; i < 500; i++) {
			System.out.println(i);
		}

		System.out.println("프로그램 종료");
	}
}
