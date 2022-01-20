package score2;

import java.io.Serializable;

// 파일에 저장할 클래스는 반드시 직렬화를 시켜야 함
public class ScoreVO implements Serializable{
    private String name;  // 이름
    private String studentID; // 학번
    private int kor, eng, math, total; // 과목별 점수 + 토탈
    private double avg; // 평균

    @Override
    public String toString() {
        String str = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s", studentID, name, kor, eng, math, total, Math.round(avg));
        return str;        
    }

    // getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
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

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}
