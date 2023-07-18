package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.json.JSONStringer;
import org.json.JSONWriter;

import com.mysql.cj.xdevapi.JsonString;

public class JDBC12 {

	private static final String USER = "root";
	private static final String PASSWORD = "";
	private static final String URL = "jdbc:mysql://localhost/jay";
	public static void main(String[] args) {
		String sql = "SELECT e.EmployeeID,e.FirstName,e.LastName,SUM(od.UnitPrice*od.Quantity) sum FROM orders o "
				+ "JOIN employees e ON o.EmployeeID = e.EmployeeID "
				+ "JOIN orderdetails od ON o.OrderID = od.OrderID "
				+ "GROUP BY e.EmployeeID "
				+ "ORDER BY sum DESC;";
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWORD);
		try {
			Connection conn = DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			JSONStringer js = new JSONStringer();
			JSONWriter jw = js.array();
			int rank =1;
			while(rs.next()) {
				String firStName = rs.getString("Firstname");
				String lastName = rs.getString("Lastname");
				double sum = rs.getDouble("sum");
				
				jw.object();
				jw.key("rank").value(rank++);
				jw.key("firstname").value(firStName);
				jw.key("lastname").value(lastName);
				jw.key("sum").value(sum);
				jw.endObject();
				
			}
			jw.endArray();
			
			System.out.println(jw.toString());
			
			
		
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
