

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class ClassDemo {

	public static void main(String[] args) throws ClassNotFoundException{

		// creates three different Connection objects
		Connection conn1 = null;
		Connection conn2 = null;
		Connection conn3 = null;

		try {
			// connect way #1
			String url1 = "jdbc:mysql://localhost:3306/test1";
			String user = "root";
			String password = "mysql@1234";
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn11 = (Connection) DriverManager.getConnection(url1, user, password);
			if (conn11 != null) {
				System.out.println("Connected to the database test1");
			}

//			// connect way #2
//			String url2 = "jdbc:mysql://localhost:3306/test2?user=root&password=mysql@1234";
//			conn2 = DriverManager.getConnection(url2);
//			if (conn2 != null) {
//				System.out.println("Connected to the database test2");
//			}
//
//			// connect way #3
//			String url3 = "jdbc:mysql://localhost:3306/test3";
//			Properties info = new Properties();
//			info.put("user", "root");
//			info.put("password", "mysql@1234");
//
//			conn3 = DriverManager.getConnection(url3, info);
//			if (conn3 != null) {
//				System.out.println("Connected to the database test3");
//			}
		} catch (SQLException ex) {
			System.out.println("An error occurred. Maybe user/password is invalid");
			ex.printStackTrace();
		}
	
	}

}
