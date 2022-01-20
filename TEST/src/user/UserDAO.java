package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

public class UserDAO //Data Access Object 데이터 베이스 접근 객체 
{
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;


public UserDAO() {
		try {
				String dbURL="jdbc:mysql://localhost:3306/TEST";
				String dbID = "root";
				String dbPassword = "root";
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(dbURL, dbID, dbPassword);				
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

public int login(String userID, String userPassword) {
	
	String sql = "select userPassword from user where userID = ?";
	try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userID);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			if(rs.getString(1).equals(userPassword)) {
				return 1;
			}else
				return 0;
		}
		return -1;		
	}catch (Exception e) {
		e.printStackTrace();
	}
	return -2;
	}

public int join(User user) {
	String sql = "insert into user Values(?, ?, ?, ?, ?)";
	try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, user.getUserID());
		pstmt.setString(2, user.getUserPassword());
		pstmt.setString(3, user.getUserName());
		pstmt.setString(4, user.getUserGender());
		pstmt.setString(5, user.getUserEmail());
		return pstmt.executeUpdate();		
	}catch(Exception e) {
		e.printStackTrace();
	}return -1;
}
}
