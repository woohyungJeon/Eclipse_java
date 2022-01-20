
public class Exam4 {
	// 합 구하기 함수
	static int sum(int from, int to) {
		int tot = 0;
		for(int i=from; i<=to; i++) {
			tot += i;
		}
		return tot;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1, 10));
		System.out.println(sum(1, 3) + sum(7, 9));
	}
}
