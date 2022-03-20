package akiba_banking_system.database;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connect {
	private Connection connection = null;
	public String dburl = "jdbc:mysql://localhost:3306/akibabank";
	public String dbname ="root";
	public String dbpassword = "";
	public String dbdriver ="com.mysql.cj.jdbc.Driver";
	

	public Connection getConnection() throws SQLException {
		try {

			Class.forName(dbdriver);
			connection = DriverManager.getConnection(dburl,dbname,dbpassword);

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();

		}

		return connection;

	}

}
