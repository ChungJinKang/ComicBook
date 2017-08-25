package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DBUtil {
	public static String myIp = "70.12.110.63";
	// 연결
	public static Connection getConn() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@" + myIp + ":1521:xe";
		String user="jin";
		String password="jin";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 해제
	public static void dbClose(Connection conn, Statement st, ResultSet rs) {
		try {
			if(rs != null) rs.close();
			if(st!=null) st.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	// java.util.Date -> java.sql.Date
	public static java.sql.Date convertDate(java.util.Date d) {
		java.sql.Date d2 = new java.sql.Date(d.getTime());
		return d2;
	}

	// String ->java.sql.Date
	public static java.sql.Date stringToDate(String sdate) {
		java.sql.Date d = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			java.util.Date d2 = sdf.parse(sdate);
			d = convertDate(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// d2 return해도 상관 없대
		return d;
	}
}
