

class ThreadExam1 extends Thread {
	// thread�� ���۵Ǵ� �Լ�
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
	    
		System.out.println("run �Լ� ������");
		//threadExam1.run(); 	// �Ϲ� �Լ��μ� run() ����
		// ������μ� run �Լ� ����
		threadExam1.start();
		
		// main thread�μ� ���۵Ǵ� ��ɾ�
		for(int i=0; i<500; i++) {
			System.out.println(i);
		}		
		
		System.out.println("���α׷� ����");
	}
}
