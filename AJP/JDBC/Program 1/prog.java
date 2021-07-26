import java.sql.*;

public class prog {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded");
			Connection conn = DriverManager.getConnection(url, "system", "system");
			System.out.println("Connection Established");
		} catch(ClassNotFoundException ex) {
			System.out.println(ex);
		} catch(SQLException ex) {
			System.out.println(ex);
		}
	}
}