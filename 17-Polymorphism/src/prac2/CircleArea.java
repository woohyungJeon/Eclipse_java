package prac2;

public class CircleArea extends Circle {
   public CircleArea(int r) {
      super(r);
   }

   public void compute() {
      double size = getR() * getR() * getPI();
      setSize(size);
   }

   public void output() {
      System.out.println("¿øÀÇ³ÐÀÌ : " + getSize());
   }
}
