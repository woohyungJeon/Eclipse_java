package com.dao;
/* DB ������ ���� */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class UpdateTest {
   // 1. Driver ��� Ȯ��
   public UpdateTest() {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
      } catch (ClassNotFoundException e) {
         System.out.println("����̹� ��� ����");
         //e.printStackTrace();
      }
   }
   
   // 2. Connection
   public Connection getConnection() {
      Connection conn = null;
      String url = "jdbc:oracle:thin:@59.16.152.223";
      String username = "C##dbexam";
      String password = "m1234";
      
      try {
         conn = DriverManager.getConnection(url, username, password);
      } catch (SQLException e) {
         System.out.println("���� ����");
         //e.printStackTrace();
      }
      return conn;
   }
   
   // 3. SQL �۾� ó��
   // update dbtest set age = age+1 where name = 'ȫ�浿'
   public int updateArticle() {
      Scanner sc = new Scanner(System.in);
      System.out.print("�̸� �Է� : ");
      String name = sc.next();
      System.out.print("������ ���� �Է� : ");
      int age = sc.nextInt();
      
      // DB
      Connection conn = getConnection();
      String sql = "update dbtest set age = ? where name = ?";
      int result = 0;
      // ���� ��Ʈ�� Ŭ����
      PreparedStatement pstmt = null;
      
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, age);
         pstmt.setString(2, name);
         
         result = pstmt.executeUpdate();
      } catch (SQLException e) {
         //e.printStackTrace();
      } finally {
         try {
            if(pstmt != null) pstmt.close();
            if(conn != null) conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
      return result;
   }
}

public class Exam4 {
   public static void main(String[] args) {
      UpdateTest updateTest = new UpdateTest();
      
      int result = updateTest.updateArticle();
      
      if(result > 0) System.out.println("���� ����");
      else System.out.println("���� ����");
   }
}