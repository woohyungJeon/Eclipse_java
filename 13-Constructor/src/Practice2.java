
class Address {
   String name;	// �̸�
   String num;	// ��ȭ
   String ad;	// �ּ�
   
   Address(String name, String num, String ad) {
      this.name = name;
      this.num = num;
      this.ad = ad;
   }
   void showAddress() {
      System.out.println("�̸� : " + name);
      System.out.println("��ȭ : " + num);
      System.out.println("�ּ� : " + ad);      
   }
}
public class Practice2 {

   public static void main(String[] args) {
      Address a1;
      a1 = new Address("ȫ�浿", "010-1234-5678", "����� ������ ���ﵿ");
      a1.showAddress();
   }

}
