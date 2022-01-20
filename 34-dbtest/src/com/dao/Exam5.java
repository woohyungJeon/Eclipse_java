package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class DeleteTest {
   //1. Driver ��� Ȯ��
   public DeleteTest() {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("����̹� ��� ����");
      } catch (ClassNotFoundException e) {
         System.out.println("����̹� ��� ����");
         //e.printStackTrace();
      }
   }
   
   // 2.Connection ��ü���� : DB ���α׷��� ����
   public Connection getConnection() {
      Connection conn = null;
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String username = "C##dbexam";
      String password = "m1234";
      
      try {
         conn = DriverManager.getConnection(url, username, password);
         System.out.println("���� ����");
      } catch (SQLException e) {
         System.out.println("���� ����");
         //e.printStackTrace();
      }
      return conn;
   }
   
   // 3. SQL �۾� ó��
   public int deleteArticle() {      
      Scanner sc = new Scanner(System.in);
      System.out.print("������ ������ ��� �̸� �Է� : ");
      String name = sc.next();
      
      // DB
      Connection conn = getConnection();
      String sql = "delete dbtest where name = ?";
      int result = 0;
      
      // ���� ��Ʈ�� Ŭ���� : Connection ��� Oracle DB�� ��û/����
      PreparedStatement pstmt = null;
      
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, name);
         
         result = pstmt.executeUpdate();
      } catch (SQLException e) {
         //e.printStackTrace();
      } finally {
			try {
				if (pstmt != null) pstmt.close(); // ������ ����
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
      
      if(result>0) System.out.println("���� ����");
      else System.out.println("���� ����");
   }
}