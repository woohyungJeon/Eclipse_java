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
	// 1. Dirver ��� Ȯ��
	public DbtestDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ��� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ��� ����");
			e.printStackTrace();
		}
	}

	// 2. connection
	// => �����ͺ��̽� ���α׷��� ����
	public Connection getConnection() {
		// ����Ŭ DB�������� ������ �����ϴ� Ŭ����
		Connection conn = null;
		String url = "jdbc:oracle:thin:@59.16.152.223";
		String username = "C##dbexam";
		String password = "m1234";
		try {
			// DriverManager.getConnection() : OracleDriver Ŭ������ �̿��ؼ� Oracle DB�� ������ �õ���
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("���� ����");
		} catch (SQLException e) {
			System.out.println("���� ����");
			e.printStackTrace();
		}
		return conn;
	}

	// 3. SQL �۾� ó��
	// insert
	public int insertArticle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("Ű �Է� : ");
		double height = sc.nextDouble();

		// DB
		Connection conn = getConnection();
		String sql = "insert into dbtest values (?, ?, ?, sysdate)";
		int result = 0;
		// ���� ��Ʈ�� Ŭ���� : Connection ��� Oracle DB�� ��û/���� ó���� �ϴ� Ŭ����
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, height);
			// pstmt.executeUpdate() : 1. ��û�ϱ� 2. ������ 3. ����ó��
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
	// => "select * from dbtest"�� ��ü �����͸� Ȯ���ϴ� ���̱� ������
	// �ڹٺ��� ��ü ������, List ��ü �����ؼ� �����ؾ�������,
	// ���⼭�� �ٷ� ����� �ؼ� Ȯ����
	// public List<�ڹٺ���> selectArticle() {}
	public List<DbtestDTO> selectArticle() {
		Connection conn = getConnection();
		String sql = "select * from dbtest";
		List<DbtestDTO> list = new ArrayList<DbtestDTO>();

		// db�� ��û/���� ó�� Ŭ����
		PreparedStatement pstmt = null;
		// pstmt�� ���� �����͸� ó���ϰ�, �� ����� ResultSet ��ü�� �����ϰ� ������
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			// pstmt.executeQuery() : 1. ��û�ϱ� 2. ������ 3. ����ó����, �� �����͸� ResultSet ��ü�� �����ϰ�
			// ������
			rs = pstmt.executeQuery();

			// rs.next() : �����Ͱ� �ִ��� Ȯ���ϰ� 1���� �����͸� �о��
			// => true : ������ ����, false : ������ ����
			while (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				double height = rs.getDouble("height");
				String logtime = rs.getString("logtime");
				// ���� ���α׷������� �̺κп���, �ڹٺ��� ��ü ������, ������ ������, List ��ü�� ����
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
	// update dbtest set age = age+1 where name = 'ȫ�浿'
	public int updateArticle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("������ Ű �Է� : ");
		double height = sc.nextDouble();
		// System.out.print("������ ���� �Է� : ");
		// int age = sc.nextInt();

		// DB
		Connection conn = getConnection();
		String sql = "update dbtest set height = ? where name = ?";
		int result = 0;
		// ���� ��Ʈ�� Ŭ����
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
			// e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close(); // ������ ����
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
