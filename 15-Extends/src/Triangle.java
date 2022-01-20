
public class Triangle extends Area{
   // Field
   private double triangle_result;   // 삼각형의 넓이 멤버변수 
   
   // Constructor
   public Triangle() {}
   public Triangle(double base, double height) {   // 부모 클래스를 상속받아 값 입력
      setBase(base);
      setHeight(height);
   }
   
   // Method
   public double getArea() {   
      triangle_result = getBase() * getHeight() / 2;   // 연산해서 멤버변수에 대입
      return triangle_result;   // 값 리턴
   } 
   
   public void output() {
      System.out.printf("삼각형의 넓이 : %s\n", getArea());
   }
}
