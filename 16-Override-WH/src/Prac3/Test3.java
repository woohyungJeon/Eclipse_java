package Prac3;

public class Test3 extends Sales{
	int amount; //���� ǰ�� �Ѿ�
	
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
		//1�� ǰ�񰡰� = �Ѿ� - �Ѿ�*������
		int result = (int)(amount - amount * Sales.getDiscount());
		System.out.println(getArticle() + "\t" + result);		
	}

}
