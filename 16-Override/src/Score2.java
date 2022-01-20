
public class Score2 extends Score{
	int mus, com;
	
	public Score2(String name, int kor, int eng, int mat, 
				  int mus, int com) {
		super(name, kor, eng, mat);	// 부모클래스 생성자 호출
		this.mus = mus;
		this.com = com;
	}
	@Override
	public int calc_tot() {
		tot = super.calc_tot() + mus + com;
		return tot;
	}
	@Override
	public double calc_avg() {
		avg = (double)tot / 5;
		return avg;
	}
	@Override
	public void output_result() {
		System.out.println("이름 : " + name + ", 총점 : " + calc_tot()
						 + ", 평균 : " + calc_avg());
	}
}
