package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

import tw.org.iii.myclasses.BCrypt;

public class JDBC09 {
	//建立帳號密碼
	private static Connection conn;
	private static final String USER = "root";
	private static final String PASSWORD = "";
	private static final String URL = "jdbc:mysql://localhost/iii";
	private static final String SQL_CHECK = "SELECT count(*) count FROM member WHERE account = ?";
	private static final String SQL_INSERT = "INSERT INTO member(account,password,email) VALUES(?,?,?)";

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Account : ");
		String account = scanner.next();

		System.out.print("Password : ");
		String passwd = scanner.next();

		System.out.print("Email : ");
		String email = scanner.next();

		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWORD);

		try {
			conn = DriverManager.getConnection(URL, prop);
			if (cheakAccount(account)) {
				if(addMember(account, passwd, email)) {
					//OK
					System.out.println("Register success");
				}else {
					System.out.println("Register failure");
					//SQL問題
				}
			}else {
				System.out.println("Account exist");
				
				//發生帳號重複
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	static boolean cheakAccount(String account) throws Exception {
		boolean ret;
		PreparedStatement pstmt = conn.prepareStatement(SQL_CHECK);
		pstmt.setString(1, account);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		ret = rs.getInt("count") == 0;
		rs.close();
		rs = null;
		return ret;
	}

	static boolean addMember(String account, String passwd, String email) throws Exception {
		boolean isOK;
		PreparedStatement pstmt = conn.prepareStatement(SQL_INSERT);
		pstmt.setString(1, account);
		pstmt.setString(2, BCrypt.hashpw(passwd, BCrypt.gensalt()));
		pstmt.setString(3, email);
		isOK = pstmt.executeUpdate() != 0;
		return isOK;
	}
}
