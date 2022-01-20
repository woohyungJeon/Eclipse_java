package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class InsertTest {
   //Driver 등록 확인
   public InsertTest() {
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
   //3. SQL 작업 처리
   public int insertArticle() {
      Scanner sc = new Scanner(System.in);
      System.out.print("이름 입력: ");
      String name = sc.next();
      System.out.print("나이 입력: ");
      int age = sc.nextInt();
      System.out.print("키 입력: ");
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
      if(result >0) System.out.println("저장 성공");
      else System.out.println("저장 실패");
   }

}