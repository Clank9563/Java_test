package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC03 {

	public static void main(String[] args) {
		
		
		try {
			Connection conn= DriverManager.getConnection(
					"jdbc:mysql://localhost/iii",
					"root","");
			//資料庫預設阜號3306
			//url使用?隔開
			//嵾數參數之間用&隔開
			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO cust(cname,tel,birthday)VALUES ('aa','123','1991-01-02')";
			
			int count = stmt.executeUpdate(sql);
			System.out.println(count);
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

}
