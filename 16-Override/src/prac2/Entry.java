package prac2;

public class Entry {
   private String word;

   public Entry() {
      super();		// �θ�Ŭ���� ������ ȣ��
      System.out.println("***������***");
   }

   public Entry(String word) {
      this();		// ���� Ŭ�������� �ٸ� ������ ȣ��
      this.word = word;
   }
   
   public void writeView() {
      System.out.println("��� : " + word);
   }   
}
