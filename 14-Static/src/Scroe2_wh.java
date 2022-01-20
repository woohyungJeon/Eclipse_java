import java.util.Scanner;

public class Scroe2_wh {
	Scanner sc = new Scanner(System.in);
	
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private String grade;
	
	public Scroe2_wh() {
				
	}
	
	public Scroe2_wh(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		cal_tot();
		cal_avg();
		cal_grade();	
	}
	
	@Override
	public String toString() {
		String avg_str = String.format("%.2f", avg);
		return name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg_str + "\t" + grade;
	}
	
	//입력
	public void input() {
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		mat = sc.nextInt();	
		
		cal_tot();
		cal_avg();
		cal_grade();		
	}
	
	//연산	
	public int cal_tot() {		
		tot = kor + eng + mat;
		return tot;
	}
	
	public double cal_avg() {
		avg = tot / 3;
		return avg;
	}
	
	public String cal_grade() {
		if(avg >= 90) {
			grade = "A";
		}else if(avg >= 80){
			grade = "B";
		}else if(avg >= 70){
			grade = "C";
		}else if(avg >= 70){
			grade = "D";
		}else {
			grade = "F";
		}		
		return grade;
	}
	
	//출력
	public void output() {
		System.out.println("------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n","이름","국어","영어","수학","총점","평균","학점");				
	}
	
	// 출력
	void outputCalc() {
		System.out.println(toString());
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}


}
