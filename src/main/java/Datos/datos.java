package Datos;

import java.sql.*;

public class datos {
	
	private static final String url = "jdbc:mysql://localhost:3306/persona";
	private static final String user ="root";
	private static final String pass ="admin";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,user,pass);
	}
	
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement ps) {
		try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
}
