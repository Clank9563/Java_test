package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC02 {

	public static void main(String[] args) {
		
		
		try {//推薦使用
			Properties prop = new Properties();
			prop.put("user","root");
			prop.put("password","");
			Connection conn= DriverManager.getConnection(
					"jdbc:mysql://localhost/iii",
					prop);
			
			Statement stmt = conn.createStatement();
			String sql = "Delete from cust where id=5";
			
			int count = stmt.executeUpdate(sql);
			System.out.println(count);
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

}
