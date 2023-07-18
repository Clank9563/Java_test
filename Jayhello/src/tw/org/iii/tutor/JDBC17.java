package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JDBC17 {
	private static final String USER = "root";
	private static final String PASSWORD = "";
	private static final String URL = "jdbc:mysql://localhost/iii";
	private static final String SQL_QUERY = 
			"SELECT * FROM cust";

	public static void main(String[] args) {
		Properties prop= new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWORD);
		try {
			Connection conn = DriverManager.getConnection(URL,prop);
			PreparedStatement pstmt = conn.prepareStatement(
					SQL_QUERY,
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("cname");
				System.out.printf("%s:%S\n",id,name);
			}
			System.out.println("-------------");
			
			if(rs.first()) {
				System.out.println("move first ok");
				String id = rs.getString("id");
				String name = rs.getString("cname");
				System.out.printf("%s:%S\n",id,name);
				rs.absolute(4);//4包括自己
				String id1 = rs.getString("id");
				String name1 = rs.getString("cname");
				System.out.printf("%s:%S\n",id1,name1);
				
			}else {
				System.out.println("ok");
			}
			System.out.println("-----------");//更新資料
			rs.updateString("cname", "new aa");
			rs.updateString("tel", "321");
			rs.updateRow();//這裡才讓資料表commit
			System.out.println("-----------");//刪除資料
			rs.absolute(2);
			String id1 = rs.getString("id");
			String name1 = rs.getString("cname");
			System.out.printf("%s:%S\n",id1,name1);
//			rs.deleteRow();//刪完回到第一筆資料
			String id2 = rs.getString("id");
			String name2 = rs.getString("cname");
			System.out.printf("%s:%S\n",id2,name2);
			System.out.println("-----------");//新增資料
			rs.moveToInsertRow();
			rs.updateString("cname", "new row");
			rs.updateString("tel", "1234567");
			rs.updateString("birthday", "1999-01-02");
			rs.insertRow();//這裡才讓資料表新增
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
	}

}
