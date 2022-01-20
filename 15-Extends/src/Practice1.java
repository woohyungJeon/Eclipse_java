
public class Practice1 {
   public static void main(String[] args) {
      
      Rectangle r = new Rectangle();   // 사각형의 넓이 구하는 객체 생성
      Triangle t = new Triangle();   // 삼각형의 넓이 구하는 객체 생성   
      
      // 입력
      r.setArea(10.5, 20.5);   
      t.setArea(5.0, 9.0);   
      
      // 출력
      //r.output();
      //t.output();
      System.out.println("사각형의 넓이 : " + r.getArea());   
      System.out.println("삼각형의 넓이 : " + t.getArea());
   }
}
