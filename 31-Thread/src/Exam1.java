

class ThreadExam1 extends Thread {
	// thread로 동작되는 함수
	@Override
	public void run() {
		System.out.println("Test thread 1");
		for(int i=0; i<58; i++) {
			System.out.println((char)(i+65));
		}
	}
}

public class Exam1 {
	// main thread
	public static void main(String[] args) {
	    ThreadExam1 threadExam1 = new ThreadExam1();
	    
		System.out.println("run 함수 동작전");
		//threadExam1.run(); 	// 일반 함수로서 run() 동작
		// 쓰레드로서 run 함수 동작
		threadExam1.start();
		
		// main thread로서 동작되는 명령어
		for(int i=0; i<500; i++) {
			System.out.println(i);
		}		
		
		System.out.println("프로그램 종료");
	}
}
