
public class Practice1 {
   public static void main(String[] args) {
      
      Rectangle r = new Rectangle();   // �簢���� ���� ���ϴ� ��ü ����
      Triangle t = new Triangle();   // �ﰢ���� ���� ���ϴ� ��ü ����   
      
      // �Է�
      r.setArea(10.5, 20.5);   
      t.setArea(5.0, 9.0);   
      
      // ���
      //r.output();
      //t.output();
      System.out.println("�簢���� ���� : " + r.getArea());   
      System.out.println("�ﰢ���� ���� : " + t.getArea());
   }
}
