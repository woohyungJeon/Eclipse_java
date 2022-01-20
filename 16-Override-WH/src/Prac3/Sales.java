package Prac3;

import java.util.Scanner;

public class Sales {
	
	Scanner sc = new Scanner(System.in);

	private String article; //품목
	private int qty; //수량
	private int cost; //단가
	private static int cnt; //판매건수
	private static double discount; //할인율
	
	public Sales() {
		
	}
	
	public Sales(String article, int qty, int cost) {
		this.article = article;
		this.qty = qty;
		this.cost = cost;		
	}
	
	public void input() {
		System.out.print("품목 입력 : ");
		article = sc.next();
		System.out.print("수량 입력 : ");
		qty = sc.nextInt();
		System.out.print("단가 입력 : ");
		cost = sc.nextInt();
	}
	
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		Sales.cnt = cnt;
	}
	public static double getDiscount() {
		return discount;
	}
	public static void setDiscount(double discount) {
		Sales.discount = discount;
	}
	
	
	
}
