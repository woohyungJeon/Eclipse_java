
public class Exam2 {
	public static void main(String[] args) {
		int[][] grade = new int[3][3];
		String[] name = {"È«±æµ¿", "±èÃ¶¼ö", "ÀÌ¿µÈñ"};
		
		// È«±æµ¿ °ú¸ñº° Á¡¼ö ÀúÀå
		grade[0][0] = 75;
		grade[0][1] = 82;
		grade[0][2] = 95;
		// ±èÃ¶¼ö
		grade[1][0] = 88;
		grade[1][1] = 64;
		grade[1][2] = 70;
		// ÀÌ¿µÈñ
		grade[2][0] = 100;
		grade[2][1] = 95;
		grade[2][2] = 90;
		
		// ÇÐ»ýµé °³º° ÃÑÁ¡°ú Æò±Õ ±¸ÇÏ±â
		for(int i=0; i<grade.length; i++) {		// Çà
			int sum = 0;
			int avg = 0;
			
			for(int j=0; j<grade[i].length; j++) { // ¿­
				sum += grade[i][j];
			}
			avg = sum / grade[i].length;
			
			System.out.println(name[i] + ", ÃÑÁ¡=" + sum + ", Æò±Õ=" + avg);
		}
	}
}
