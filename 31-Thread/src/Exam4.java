
public class Exam4 {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {			
			@Override
			public void run() {
				System.out.println("Test thread 4");
				for(int i=0; i<58; i++) {
					System.out.println((char)(i+65));
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		// main thread로서 동작되는 명령어
		for (int i = 0; i < 500; i++) {
			System.out.println(i);
		}

		System.out.println("프로그램 종료");
	}
}
