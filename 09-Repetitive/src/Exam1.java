
public class Exam1 {
	public static void main(String[] args) {
		int b=0;
		for(int i=1; i<=100000; i++) {
			if(i%5 == 0) b+=i;
		}
		
		System.out.println("1~100000 사이의 5의 배수의 합 : " + b);
	}
}
