package Prac3;

import java.util.Scanner;

public class Sales {
	
	Scanner sc = new Scanner(System.in);

	private String article; //ǰ��
	private int qty; //����
	private int cost; //�ܰ�
	private static int cnt; //�ǸŰǼ�
	private static double discount; //������
	
	public Sales() {
		
	}
	
	public Sales(String article, int qty, int cost) {
		this.article = article;
		this.qty = qty;
		this.cost = cost;		
	}
	
	public void input() {
		System.out.print("ǰ�� �Է� : ");
		article = sc.next();
		System.out.print("���� �Է� : ");
		qty = sc.nextInt();
		System.out.print("�ܰ� �Է� : ");
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
