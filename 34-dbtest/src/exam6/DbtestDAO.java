package exam6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DbtestDAO {
	// 1. Dirver 등록 확인
	public DbtestDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 등록 실패");
			e.printStackTrace();
		}
	}

	// 2. connection
	// => 데이터베이스 프로그램과 접속
	public Connection getConnection() {
		// 오라클 DB서버와의 접속을 관리하는 클래스
		Connection conn = null;
		String url = "jdbc:oracle:thin:@59.16.152.223";
		String username = "C##dbexam";
		String password = "m1234";
		try {
			// DriverManager.getConnection() : OracleDriver 클래스를 이용해서 Oracle DB에 접속을 시도함
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("접속 성공");
		} catch (SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}
		return conn;
	}

	// 3. SQL 작업 처리
	// insert
	public int insertArticle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("키 입력 : ");
		double height = sc.nextDouble();

		// DB
		Connection conn = getConnection();
		String sql = "insert into dbtest values (?, ?, ?, sysdate)";
		int result = 0;
		// 보조 스트림 클래스 : Connection 대신 Oracle DB와 요청/응답 처리를 하는 클래스
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, height);
			// pstmt.executeUpdate() : 1. 요청하기 2. 응답대기 3. 응답처리
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	// select
	// => "select * from dbtest"은 전체 데이터를 확인하는 것이기 때문에
	// 자바빈즈 객체 생성후, List 객체 저장해서 리턴해야하지만,
	// 여기서는 바로 출력을 해서 확인함
	// public List<자바빈즈> selectArticle() {}
	public List<DbtestDTO> selectArticle() {
		Connection conn = getConnection();
		String sql = "select * from dbtest";
		List<DbtestDTO> list = new ArrayList<DbtestDTO>();

		// db에 요청/응답 처리 클래스
		PreparedStatement pstmt = null;
		// pstmt가 응답 데이터를 처리하고, 그 결과를 ResultSet 객체에 저장하고 리턴함
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			// pstmt.executeQuery() : 1. 요청하기 2. 응답대기 3. 응답처리후, 그 데이터를 ResultSet 객체에 저장하고
			// 리턴함
			rs = pstmt.executeQuery();

			// rs.next() : 데이터가 있는지 확인하고 1행의 데이터를 읽어옴
			// => true : 데이터 있음, false : 데이터 없음
			while (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				double height = rs.getDouble("height");
				String logtime = rs.getString("logtime");
				// 실제 프로그램에서는 이부분에서, 자바빈즈 객체 생성후, 데이터 저장후, List 객체에 저장
				DbtestDTO dto = new DbtestDTO(name, age, height, logtime);
				list.add(dto);
				// System.out.println(name + "\t" + age + "\t" + height + "\t" + logtime);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	// update
	// update dbtest set age = age+1 where name = '홍길동'
	public int updateArticle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("수정할 키 입력 : ");
		double height = sc.nextDouble();
		// System.out.print("수정할 나이 입력 : ");
		// int age = sc.nextInt();

		// DB
		Connection conn = getConnection();
		String sql = "update dbtest set height = ? where name = ?";
		int result = 0;
		// 보조 스트림 클래스
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1, height);
			pstmt.setString(2, name);

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	// delete
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
			// e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close(); // 접속을 끊음
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
