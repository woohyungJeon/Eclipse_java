
public class Practice8 {
   static void outDate(int x, int y, int z) {   
      System.out.println(x+"/"+ y +"/"+z);
   }
   static void outDate(int x, int y, int z, char s) {
      System.out.println(x + s + y + s + z);
      // 정수와 문자가 포함된 데이터를 문자열로 출력하기
      System.out.println("" + x + s + y + s + z);
      System.out.printf("%d%c%d%c%d\n", x, s, y, s, z);
   }
   static void outDate(String x) {
      System.out.println(x);
   }
   public static void main(String[] args) {
      outDate(2004, 3, 5);		// outDate(int, int, int)
      outDate(2007, 8, 5, '#');	// outDate(int, int, int, char)
      outDate("2006/9/2");		// outDate(String)
   }
}