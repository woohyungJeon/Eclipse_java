package score;
// java beans : �л� 1�� ������ ����
public class ScoreVO {
	private String hak;		// �й�
	private String name;	// �̸�
	private int kor;		// ����
	private int eng;		// ����
	private int mat;		// ����
	private int tot;		// ����
	private double avg;		// ���	
	
	@Override
	public String toString() {
		if(hak == null || name == null) return null;
		
		String str = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%.1f", 
									hak, name, kor, eng, mat, tot, avg);
		return str;
	}
	
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
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
}
