import java.sql.*;
import myPackage.credentials;

public class JDBCExample {
	private JDBCExample() {
	}
	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = credentials.getUsername();
		String password = credentials.getPassword();
		try {

			// Loading Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded");

			// Establishing Database Connection
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established");

			// Executing Insert Query
			String sql = "INSERT INTO students VALUES(0, 'Abhijeet', 'Shahakar', 'M', 19)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.executeQuery();
			System.out.println("Insert Query Executed");

			// Executing SELECT Query
			sql = "Select * FROM students";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			System.out.println("Select Query Executed");

			// Displaying ResultSet
			System.out.println("\nId | Name | Gender | Age");
			while(rs.next()) {
				System.out.print(rs.getInt(1) + " " + rs.getString(2));
				System.out.print(" " + rs.getString(3) + " " + rs.getString(4));
				System.out.println(" " + rs.getInt(5));
			}
			System.out.println();

			// Closing Connection
			conn.close();
			System.out.println("Connection Closed");

		} catch(ClassNotFoundException ex) {
			System.out.println(ex);
		} catch(SQLException ex) {
			System.out.println(ex);
		}
	}
}