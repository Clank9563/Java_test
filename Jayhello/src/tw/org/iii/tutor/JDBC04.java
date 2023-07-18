package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.xdevapi.PreparableStatement;

public class JDBC04 {

	public static void main(String[] args) {
		
		
		try {
			Properties prop = new Properties();
			prop.put("user","root");
			prop.put("password","");
			Connection conn= DriverManager.getConnection(
					"jdbc:mysql://localhost/iii",
					prop);
		
			String sql = "INSERT INTO cust (cname,tel,birthday)values (?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "Jay");
			pstmt.setString(2, "345");
			pstmt.setString(3, "1998-03-04");
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
