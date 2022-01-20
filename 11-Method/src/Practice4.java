import java.util.Scanner;

public class Practice4 {
	static int input(String subject) {
		Scanner sc = new Scanner(System.in);
		System.out.print(subject + " : ");
		int jumsu = sc.nextInt();
		return jumsu;
	}

	static double calc_avg(int kor, int eng, int mat) {
		return (double) (kor + eng + mat) / 3;
	}

	static void output_avg(double avg) {
		System.out.println("평균 : " + avg);
	}

	static void output_result(double avg, int kor, int eng, int mat) {
		if (avg >= 60 && kor >= 40 && eng >= 40 && mat >= 40) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 선언
		int kor, eng, mat;
		double avg;
		// 입력
		kor = input("국어");
		eng = input("영어");
		mat = input("수학");

		// 연산, 출력
		avg = calc_avg(kor, eng, mat);

		output_avg(avg);
		output_result(avg, kor, eng, mat);
	}
}
