
public class Exam5 {
	public static void main(String[] args) {
		
		String[] src = {"가", "2", "aaa", "ccc"};
		// src의 내용을 숫자로 변경해서 저장할 배열
		int[] arr = new int[3];
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			System.out.println("슬립이 제대로 안됩니다.");
		} catch (Exception e) {
			System.out.println("알 수 없는 에러가 발생했습니다.");
		}
		
		try {
			// 출력
			for(int i=0; i<=src.length; i++) {
				System.out.println(src[i]);
			}
			// 숫자로 변경
			for(int i=0; i<src.length; i++) {
				arr[i] = Integer.parseInt(src[i]);
			}
			// 출력
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch(NumberFormatException e) {
			System.out.println("에러 : 문자열에 숫자가 포함되어 있습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("에러 : 데이터가 너무 많습니다.");
		} catch(Exception e) {
			System.out.println("에러 : 알 수 없는 에러");
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
