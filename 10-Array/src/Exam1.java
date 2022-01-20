
public class Exam1 {
	public static void main(String[] args) {
		int[] hong;
		hong = new int[5];
		hong[0] = 75;
		hong[1] = 82;
		hong[2] = 95;
		
		int[] kim = new int[3];
		kim[0] = 88;
		kim[1] = 64;
		kim[2] = 70;
		
		// µ•¿Ã≈Õ∏¶ ¿˙¿Â«“∏∏≈≠∏∏ ∫Øºˆ∏¶ ∏∏µÈ∞Ì, µ•¿Ã≈Õ∏¶ ¿˙¿Â«œ∂Û
		// int[] lee = new int[] {100, 95, 90};
		int[] lee = {100, 95, 90};
		
		// ∞¢ πËø≠¿« «’ ±∏«œ±‚
		int sum1=0, sum2=0, sum3=0;
		
		sum1 = hong[0] + hong[1] + hong[2];
		
		for(int i=0; i<3; i++) {
			sum2 += kim[i];
		}
		
		for(int i=0; i<lee.length; i++) {
			sum3 += lee[i];
		}
		// √—¡°∞˙ ∆Ú±’ √‚∑¬
		System.out.printf("»´±Êµø, √—¡° = %d, ∆Ú±’ = %d\n", sum1, sum1/3);
		System.out.printf("±Ë√∂ºˆ, √—¡° = %d, ∆Ú±’ = %d\n", sum2, sum2/kim.length);
		System.out.printf("¿Ãøµ»Ò, √—¡° = %d, ∆Ú±’ = %d\n", sum3, sum3/lee.length);
		
		System.out.println("»´±Êµø, √—¡° = " + sum1 + ", ∆Ú±’ = " + (sum1/3));
		System.out.println("±Ë√∂ºˆ, √—¡° = " + sum2 + ", ∆Ú±’ = " + (sum2/kim.length));
		System.out.println("¿Ãøµ»Ò, √—¡° = " + sum3 + ", ∆Ú±’ = " + (sum3/lee.length));
	}
}



