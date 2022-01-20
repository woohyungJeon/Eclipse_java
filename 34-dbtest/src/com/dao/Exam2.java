package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class InsertTest {
   //Driver ��� Ȯ��
   public InsertTest() {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
      } catch (ClassNotFoundException e) {
         System.out.println("����̹� ���");
         e.printStackTrace();
      }
      
   }
   
   //2.connection
   //�����ͺ��̽� ���α׷��� ����
   public Connection getConnection() {
      //����Ŭ DB�������� ������ �����ϴ� Ŭ����
      Connection conn = null;
      String url = "jdbc:oracle:thin:@59.16.152.223";
      String username = "C##dbexam";
      String password = "m1234";
      try {
         conn = DriverManager.getConnection(url, username, password);
         System.out.println("���� ����");
      } catch (SQLException e) {
         System.out.println("���� ����");
         e.printStackTrace();
      }
      return conn;
   }
   //3. SQL �۾� ó��
   public int insertArticle() {
      Scanner sc = new Scanner(System.in);
      System.out.print("�̸� �Է�: ");
      String name = sc.next();
      System.out.print("���� �Է�: ");
      int age = sc.nextInt();
      System.out.print("Ű �Է�: ");
      double height = sc.nextDouble();
   
      //DB
      Connection conn = getConnection();
      String sql = "insert into dbtest values (?, ?, ?, sysdate)";
      int result = 0;
      PreparedStatement pstmt = null;
      
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, name);
         pstmt.setInt(2,age);
         pstmt.setDouble(3, height);
         result = pstmt.executeUpdate();
      }catch (SQLException e) {
         e.printStackTrace();
      }finally {
         try {
            if(pstmt != null) pstmt.close();
            if(conn != null)conn.close();
         }catch (SQLException e) {
            e.printStackTrace();
         }
      }
   return result;
   }
}
public class Exam2 {

   public static void main(String[] args) {
      InsertTest insertTest = new InsertTest();
      int result = insertTest.insertArticle();
      if(result >0) System.out.println("���� ����");
      else System.out.println("���� ����");
   }

}