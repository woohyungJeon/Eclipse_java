package prac4;

public class CircleArea extends Circle {
   public CircleArea(int r) {
      super(r);
   }
   
   @Override
   public void compute() {
      size = r * r * PI;
   }
   
   @Override
   public void output() {
      System.out.println("¿øÀÇ ³ÐÀÌ : " + size);
   }   
}
