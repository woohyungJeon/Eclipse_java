
class ThreadExam2 implements Runnable {
	// ������μ� ���۵� �Լ�
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
		System.out.println("run() �Լ� ������");
		ThreadExam2 threadExam2 = new ThreadExam2();
		Thread thread = new Thread(threadExam2);
		thread.start();  // run()�Լ��� thread�μ� ����
		
		// main thread�μ� ���۵Ǵ� ��ɾ�
		for (int i = 0; i < 500; i++) {
			System.out.println(i);
		}

		System.out.println("���α׷� ����");
	}
}
