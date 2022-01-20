public class Area {   
   // Field
   private double base;   // �غ�
   private double height;   // ����
   
   // Constructor
   // default ������
   public Area() {}
   public Area(double base, double height) { // �Ű������� 2���� ������
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