package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class DeleteTest {
   //1. Driver 등록 확인
   public DeleteTest() {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("드라이버 등록 성공");
      } catch (ClassNotFoundException e) {
         System.out.println("드라이버 등록 실패");
         //e.printStackTrace();
      }
   }
   
   // 2.Connection 객체생성 : DB 프로그램과 접속
   public Connection getConnection() {
      Connection conn = null;
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String username = "C##dbexam";
      String password = "m1234";
      
      try {
         conn = DriverManager.getConnection(url, username, password);
         System.out.println("접속 성공");
      } catch (SQLException e) {
         System.out.println("접속 실패");
         //e.printStackTrace();
      }
      return conn;
   }
   
   // 3. SQL 작업 처리
   public int deleteArticle() {      
      Scanner sc = new Scanner(System.in);
      System.out.print("데이터 삭제할 사람 이름 입력 : ");
      String name = sc.next();
      
      // DB
      Connection conn = getConnection();
      String sql = "delete dbtest where name = ?";
      int result = 0;
      
      // 보조 스트림 클래스 : Connection 대신 Oracle DB와 요청/응답
      PreparedStatement pstmt = null;
      
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, name);
         
         result = pstmt.executeUpdate();
      } catch (SQLException e) {
         //e.printStackTrace();
      } finally {
			try {
				if (pstmt != null) pstmt.close(); // 접속을 끊음
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	  }
      return result;
   }
}

public class Exam5 {
   public static void main(String[] args) {
      DeleteTest deleteTest = new DeleteTest();
      
      int result = deleteTest.deleteArticle();
      
      if(result>0) System.out.println("삭제 성공");
      else System.out.println("삭제 실패");
   }
}