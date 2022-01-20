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
		System.out.println("��� : " + avg);
	}

	static void output_result(double avg, int kor, int eng, int mat) {
		if (avg >= 60 && kor >= 40 && eng >= 40 && mat >= 40) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����
		int kor, eng, mat;
		double avg;
		// �Է�
		kor = input("����");
		eng = input("����");
		mat = input("����");

		// ����, ���
		avg = calc_avg(kor, eng, mat);

		output_avg(avg);
		output_result(avg, kor, eng, mat);
	}
}
