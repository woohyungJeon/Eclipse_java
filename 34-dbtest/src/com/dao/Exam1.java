package com.dao;

public class Exam1 {
	public static void main(String[] args) {
		
		//Class : 클래스를 관리해주는 클래스
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("등록 되어 있습니다.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 등록 실패 ");
			e.printStackTrace();
		}
	}

}
