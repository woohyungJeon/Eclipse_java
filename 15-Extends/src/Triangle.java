
public class Triangle extends Area{
   // Field
   private double triangle_result;   // �ﰢ���� ���� ������� 
   
   // Constructor
   public Triangle() {}
   public Triangle(double base, double height) {   // �θ� Ŭ������ ��ӹ޾� �� �Է�
      setBase(base);
      setHeight(height);
   }
   
   // Method
   public double getArea() {   
      triangle_result = getBase() * getHeight() / 2;   // �����ؼ� ��������� ����
      return triangle_result;   // �� ����
   } 
   
   public void output() {
      System.out.printf("�ﰢ���� ���� : %s\n", getArea());
   }
}
