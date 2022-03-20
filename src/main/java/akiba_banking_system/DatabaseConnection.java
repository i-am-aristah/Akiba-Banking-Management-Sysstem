package akiba_banking_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import akiba_banking_system.model.User;


import akiba_banking_system.model.User;

public class DatabaseConnection {
	
	public String dburl = "jdbc:mysql://localhost:3306/akibabank";
	public String dbname ="root";
	public String dbpassword = "";
	public String dbdriver ="com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver ) {
		
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Connection getConnection() {
		
		Connection conn =null;
		
		try {
			conn = DriverManager.getConnection(dburl,dbname,dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return conn;
	}
	
	public String insert (User user) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		
		String result = "Data inserted Succesfully";
		String sql = "insert into akibabank.user values(?,?) ";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setString(2, user.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			result ="Failed to Insert data";
		}
		
		return result;
	}

}
