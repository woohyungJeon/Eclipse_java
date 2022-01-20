
class ThreadExam2 implements Runnable {
	// 쓰레드로서 동작될 함수
	@Override
	public void run() {
		System.out.println("Test thread 2");
		for(int i=0; i<58; i++) {
			System.out.println((char)(i+65));
		}
	}	
}

public class Exam2 {
	public static void main(String[] args) {
		System.out.println("run() 함수 구동전");
		ThreadExam2 threadExam2 = new ThreadExam2();
		Thread thread = new Thread(threadExam2);
		thread.start();  // run()함수를 thread로서 실행
		
		// main thread로서 동작되는 명령어
		for (int i = 0; i < 500; i++) {
			System.out.println(i);
		}

		System.out.println("프로그램 종료");
	}
}
