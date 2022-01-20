package Prac3;

public class Test3 extends Sales{
	int amount; //개별 품목 총액
	
	public Test3() {
		super();
	}
	
	public Test3(String article, int qty, int cost) {
		super(article, qty, cost);
	}
	
	public Test3(String article, int qty, int cost, int amount) {
		super(article, qty, cost);
		this.amount = amount;
	}	
	
	public void setProcess() {
		amount = getQty() * getCost();		
	}
	
	public void getDisplay() {
		//1개 품목가격 = 총액 - 총액*할인율
		int result = (int)(amount - amount * Sales.getDiscount());
		System.out.println(getArticle() + "\t" + result);		
	}

}
