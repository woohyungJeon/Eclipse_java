package score2;

import java.io.Serializable;

// ���Ͽ� ������ Ŭ������ �ݵ�� ����ȭ�� ���Ѿ� ��
public class ScoreVO implements Serializable{
    private String name;  // �̸�
    private String studentID; // �й�
    private int kor, eng, math, total; // ���� ���� + ��Ż
    private double avg; // ���

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
