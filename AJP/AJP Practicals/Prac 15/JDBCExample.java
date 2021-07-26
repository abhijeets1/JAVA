import java.sql.*;
import myPackage.credentials;

public class JDBCExample {

	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String username = credentials.getUsername();
	static String password = credentials.getPassword();
	static Connection conn;
	static Statement st;

	static void initialize() throws ClassNotFoundException, SQLException{
		// Loading Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// Establishing Database Connection
		conn = DriverManager.getConnection(url, username, password);
		st = conn.createStatement();
	}

	public static void main(String[] args) {
		String sql = "";
		try {
			initialize();

			// Executing Insert Query
			sql = "INSERT INTO students VALUES(0, 'Abhijeet', 'Shahakar', 'M', 19)";
			st.executeQuery(sql);
			System.out.println("Data Inserted:-");

			displayData();

			// Executing Update Query
			sql = "UPDATE students SET Age = 20 Where Firstname = 'Abhijeet'";
			st.executeQuery(sql);
			System.out.println("Data Updated:-");

			displayData();

			// Executing DELETE Query
			sql = "DELETE FROM students";
			ResultSet rs = st.executeQuery(sql);
			System.out.println("Data Deleted:-");

			displayData();

			// Closing Connection
			conn.close();

		} catch(ClassNotFoundException ex) {
			System.out.println(ex);
		} catch(SQLException ex) {
			System.out.println(ex);
		}
	}

	static void displayData() {
		try {
			// Executing SELECT Query
			String sql = "SELECT * FROM students";
			ResultSet rs = st.executeQuery(sql);

			// Displaying ResultSet
			System.out.println("Id | Name | Gender | Age");
			while(rs.next()) {
				System.out.print(rs.getInt(1) + " " + rs.getString(2));
				System.out.print(" " + rs.getString(3) + " " + rs.getString(4));
				System.out.println(" " + rs.getInt(5));
			}
			System.out.println();
		} catch(SQLException ex) {
			System.out.println(ex);
		}
	}
}