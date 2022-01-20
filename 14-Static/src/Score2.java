
import java.util.Scanner;

public class Score2 {
	Scanner sc = new Scanner(System.in);

	// 선언
	private String name;
	private int kor, eng, mat;
	private int tot;
	private double avg;
	private char grade;

	// 생성자
	public Score2() {
	}

	public Score2(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

		calc_tot();
		calc_avg();
		calc_grade();
	}

	@Override
	public String toString() {
		String avg_str = String.format("%.2f", avg);
		return name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg_str + "\t" + grade;
	}

	// 입력
	public void input() {
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		mat = sc.nextInt();

		calc_tot();
		calc_avg();
		calc_grade();
	}
	// 연산
	public void calc_tot() {
		tot = kor + eng + mat;		
	}
	public void calc_avg() {
		avg = (double) tot / 3;
	}
	public void calc_grade() {
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		} else
			grade = 'F';
	}

	// 제목출력
	void outputTitle() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "이름", "국어", "영어", "수학", "총점", "평균", "학점");
	}

	// 출력
	void outputCalc() {
		System.out.println(toString());
	}

	// setter , getter
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}
	
	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {		
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}	

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
}
