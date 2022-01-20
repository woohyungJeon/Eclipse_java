package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class SelectTest{
	//1.Driver 등록 확인
	public SelectTest() {
		 try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	      } catch (ClassNotFoundException e) {
	         System.out.println("드라이버 등록");
	         e.printStackTrace();
	      }
	}
	
	   //2.connection
	   //데이터베이스 프로그램과 접속
	   public Connection getConnection() {
	      //오라클 DB서버와의 접속을 관리하는 클래스
	      Connection conn = null;
	      String url = "jdbc:oracle:thin:@59.16.152.223";
	      String username = "C##dbexam";
	      String password = "m1234";
	      try {
	         conn = DriverManager.getConnection(url, username, password);
	         System.out.println("접속 성공");
	      } catch (SQLException e) {
	         System.out.println("접속 실패");
	         e.printStackTrace();
	      }
	      return conn;
	   }
	   
	   //3. SQL 작업처리
	   // => select * from dbtest
	   public void selectArticle() {
		   Connection conn = getConnection();
		   String sql = "select * from dbtest";
		   
		   PreparedStatement pstmt = null;
		   ResultSet rs = null;
		   
		   try {
			   pstmt = conn.prepareStatement(sql);
			   rs = pstmt.executeQuery();
			   
			   while(rs.next()) {
				   String name = rs.getString("name");
				   int age = rs.getInt("age");
				   double height = rs.getDouble("height");
				   String logtime = rs.getString("logtime");
				   
				   System.out.println(name + "\t" + age + "\t" + height + "\t" + logtime);
			   };
		   }catch(SQLException e) {
			   e.printStackTrace();
		   }finally {
			   try {
				   if(rs != null) rs.close();
				   if(pstmt != null) pstmt.close();
				   if(conn != null) conn.close();
			   }catch(SQLException e) {
				   e.printStackTrace();
			   }
		   }		  
	   }
	   
}

public class Exam3 {
	public static void main(String[] args) {
		SelectTest selectTest = new SelectTest();
		selectTest.selectArticle();
	}

}
