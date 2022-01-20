package prac2;

public class Practice2 {
   public static void main(String[] args) {
      Circle.getInstance().setR(10);
      Circle.getInstance().compute_area();
      Circle.getInstance().output_area();
      System.out.println("------------------");
      Circle.getInstance().compute_around();
      Circle.getInstance().output_around();
   }
}
