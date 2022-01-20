
public class Practice2_wh {
	public static void main(String[] args) {
		Scroe2_wh[] Score2 = new Scroe2_wh[2];	

	    for (int i = 0; i < Score2.length; i++) {
	    	Score2[i] = new Scroe2_wh();
	    	Score2[i].input();         
	       System.out.println(); // 1줄 넘김
	    }
	    // 타이틀 출력
	    Score2[0].output();
	    
	    // 출력
	    for (int i = 0; i < Score2.length; i++) {
	    	Score2[i].outputCalc();
	    }		
	}
}
