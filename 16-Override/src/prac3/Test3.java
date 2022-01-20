package prac3;

public class Test3 extends Sales {
	int amount;		// 개별품목에 대한 총액

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
		// 1개품목 판매가격 = 총액 - 총액*할인율
		int result_prices = (int)(amount - amount * Sales.getDiscount());
		// 품목 + 개별품목의 총액(할인율 적용)
		System.out.println(getArticle() + "\t" + result_prices);
	}
}
