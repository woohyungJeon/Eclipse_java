
public class Exam4 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		
		try {
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch(Exception e) {
			System.out.println("에러발생 : " + e.getMessage());
			//e.printStackTrace();
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
