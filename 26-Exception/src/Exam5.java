
public class Exam5 {
	public static void main(String[] args) {
		
		String[] src = {"��", "2", "aaa", "ccc"};
		// src�� ������ ���ڷ� �����ؼ� ������ �迭
		int[] arr = new int[3];
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			System.out.println("������ ����� �ȵ˴ϴ�.");
		} catch (Exception e) {
			System.out.println("�� �� ���� ������ �߻��߽��ϴ�.");
		}
		
		try {
			// ���
			for(int i=0; i<=src.length; i++) {
				System.out.println(src[i]);
			}
			// ���ڷ� ����
			for(int i=0; i<src.length; i++) {
				arr[i] = Integer.parseInt(src[i]);
			}
			// ���
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch(NumberFormatException e) {
			System.out.println("���� : ���ڿ��� ���ڰ� ���ԵǾ� �ֽ��ϴ�.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� : �����Ͱ� �ʹ� �����ϴ�.");
		} catch(Exception e) {
			System.out.println("���� : �� �� ���� ����");
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
}
