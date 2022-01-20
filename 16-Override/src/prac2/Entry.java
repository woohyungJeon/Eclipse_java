package prac2;

public class Entry {
   private String word;

   public Entry() {
      super();		// 부모클래스 생성자 호출
      System.out.println("***약어사전***");
   }

   public Entry(String word) {
      this();		// 같은 클래스안의 다른 생성자 호출
      this.word = word;
   }
   
   public void writeView() {
      System.out.println("약어 : " + word);
   }   
}
