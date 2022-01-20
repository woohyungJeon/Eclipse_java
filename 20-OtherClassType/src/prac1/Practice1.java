package prac1;

public class Practice1 {
   public static void main(String[] args) {
      Circle circlearea = new Circle(10) {   // ���� ����
         @Override
         public void compute() {
            setSize(getR() * getR() * getPI());
         }
         @Override
         public void output() {
            System.out.println("���� ���� : " + getSize());
         }
      };
      
      circlearea.compute();
      circlearea.output();
      System.out.println("-------------------");
      
      Circle circleround = new Circle() {   // ���� �ѷ�
         @Override
         public void compute() {
            setSize(getR() * 2 * getPI());
         }
         @Override
         public void output() {
            System.out.println("���� �ѷ� : " + getSize());
         }
      };
      
      circleround.setR(10);
      circleround.compute();
      circleround.output();
   }
}