package com.dao;

public class Exam1 {
	public static void main(String[] args) {
		
		//Class : Ŭ������ �������ִ� Ŭ����
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("��� �Ǿ� �ֽ��ϴ�.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����̹� ��� ���� ");
			e.printStackTrace();
		}
	}

}
