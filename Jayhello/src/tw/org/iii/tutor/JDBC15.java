package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import tw.org.iii.myclasses.Bike;

public class JDBC15 {
	
	private static final String USER = "root";
	private static final String PASSWORD = "";
	private static final String URL = "jdbc:mysql://localhost/iii";
	private static final String SQL_UPDATE_BIKE = 
			"UPDATE member SET bike = ? where id = ?";

	public static void main(String[] args) {
		
		Bike b1 = new Bike();
		b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();
		System.out.println(b1);
		
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWORD);
		try {
			Connection conn = DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt = conn.prepareStatement(SQL_UPDATE_BIKE);
			
			pstmt.setObject(1, b1);
			pstmt.setInt(2, 1);
			
			if(pstmt.executeUpdate()>0) {
				System.out.println("更新成功");
			}else {
				System.out.println("更新失敗");
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
