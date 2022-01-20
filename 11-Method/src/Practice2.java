import java.util.Scanner;

public class Practice2 {	

	static int input_kor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		int kor = sc.nextInt();
		return kor;
	}

	static int input_eng() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		int eng = sc.nextInt();
		return eng;
	}
	
	static int input(String subject) {
		Scanner sc = new Scanner(System.in);
		System.out.print(subject + " ���� �Է� : ");
		int jumsu = sc.nextInt();
		return jumsu;
	}

	static int calc_tot(int kor, int eng) {
		return kor + eng;
	}

	static double calc_avg(int tot) {
		return (double) tot / 2;
	}
	
	static String grade(double avg) {
		if (avg >= 90) {
			return "A";
		} else if (avg >= 80) {
			return "B";
		} else if (avg >= 70) {
			return "C";
		} else if (avg >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
	
	static void output(double avg) {
		System.out.println(grade(avg) + "�����Դϴ�.");
	}

	public static void main(String[] args) {
		int kor, eng, tot;
		double avg;

		kor = input("����");
		eng = input("����");
		
		//kor = input_kor();
		//eng = input_eng();

		tot = calc_tot(kor, eng);
		avg = calc_avg(tot);

		output(avg);
	}
}