package prac2;

public class CircleRound extends Circle {
   public CircleRound(int r) {
      super(r);
   }

   public void compute() {
      double size = getR() * 2 * getPI();
      setSize(size);
   }

   public void output() {
      System.out.println("원의둘레 : " + getSize());
   }
}
