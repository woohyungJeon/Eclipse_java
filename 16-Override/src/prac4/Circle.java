package prac4;

public class Circle {   
   int r;
   double size;
   final double PI = 3.141592;
   
   public Circle(int r) {
      this.r = r;
   }
   // 가이드 역할 : 상속받는 자식클래스에게 만들어서 사용하라고 하는 틀
   public void compute() {}   
   public void output() {}
}
