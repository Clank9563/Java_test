package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC01 {

	public static void main(String[] args) {
		//1.Load Driver載入驅動程式
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			Connection conn= DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/iii?user=root&password=");
			//資料庫預設阜號3306(可省略)
			//url使用?隔開
			//嵾數參數之間用&隔開
			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO cust(cname,tel,birthday)VALUES ('aa','123','1991-01-02')";
//			if(stmt.execute(sql)) {
//				System.out.println("Query");
//			}else {
//				System.out.println("Update");
//				
//			}
			int count = stmt.executeUpdate(sql);
			System.out.println(count);
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

}
