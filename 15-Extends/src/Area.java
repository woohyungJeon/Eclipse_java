public class Area {   
   // Field
   private double base;   // 밑변
   private double height;   // 높이
   
   // Constructor
   // default 생성자
   public Area() {}
   public Area(double base, double height) { // 매개변수가 2개인 생성자
      this.base = base;
      this.height = height;
   }
   
   // Method
   public void setArea(double base, double height) {
      this.base = base;
      this.height = height;
   }
   
   // base getter / setter
   public double getBase() {return base;}
   public void setBase(double base) {this.base = base;}
   
   // height getter / setter
   public double getHeight() {return height;}
   public void setHeight(double height) {this.height = height;}
}