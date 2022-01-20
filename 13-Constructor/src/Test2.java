import java.util.Random;

// Random 클래스 : 임의의 데이터를 만드는 클래스
public class Test2 {
	public static void main(String[] args) {
		Random random = new Random();
		//System.out.println(random.nextInt(5)); // 0~4사이의 임의의 정수1개를 리턴함
		
		// 1~5 사이의 임의의 정수 1개 만들기
		//int num = random.nextInt(5) + 1;
		//System.out.println(num);
		
		// 1~45 사이의 임의의 정수1개 만들기
		int num2 = random.nextInt(45) + 1;  // 0~44 + 1 => 1~45
		System.out.println(num2);
	}
}
