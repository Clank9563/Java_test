package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class JDBC13 {
	
	private static final String USER = "root";
	private static final String PASSWORD = "";
	private static final String URL = "jdbc:mysql://localhost/iii";
	private static final String SQL_UPDATE_ICON = 
			"UPDATE member SET icon = ? where id = ?";

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWORD);
		try {
			Connection conn = DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt = conn.prepareStatement(SQL_UPDATE_ICON);
			
			 FileInputStream fin  = new FileInputStream("dir1/ball1.png");//只能容量為64k檔案
			pstmt.setBinaryStream(1, fin);//非文字檔都是2進制檔
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
