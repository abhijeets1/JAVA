package medicine;
import java.sql.*;

public class med {

	Connection conn;
	Statement st;

	public med() {

		try {
			// Credentials
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String username = "SYSTEM";
			String password = "root";

			// Load Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Establish Database Connection
			conn = DriverManager.getConnection(url, username, password);

			// Create Statement Object
			st = conn.createStatement();
		} catch(ClassNotFoundException ex){
			System.out.println(ex);
		} catch(SQLException ex) {
			System.out.println(ex);
		}

	}

	public void insertMed(int id, String name, String expdate, int quantity, float price) {
		try {
			// Execute INSERT Query
			String sql = "INSERT INTO medicines VALUES(" + id + ", '" + name + "', '" + expdate + "', " + quantity + ", " + price + ")";
			ResultSet rs = st.executeQuery(sql);

		} catch(SQLException ex) {
			System.out.println(ex);
		}
	}

	public void deleteMed(int id) {
		try {
			// Execute DELETE Query
			String sql = "DELETE FROM medicines";
			if(id != 0) {
				 sql += " WHERE id = " + id;
			}
			ResultSet rs = st.executeQuery(sql);

		} catch(SQLException ex) {
			System.out.println(ex);
		}
	}

	// public void updateMed(int id) {
	// 	try {

	// 		// Get Table
	// 		ResultSet rs = this.getMed(id);
	// 		if(rs.next()) {
	// 			int id = rs.getInt(1);
	// 			String name = rs.getString(2);
	// 			String expdate = rs.getString(3);
	// 			int quantity = rs.getString(4);
	// 			float price = rs.getFloat(5);
	// 		}

	// 		// Execute DELETE Query
	// 		String sql = "UPDATE medicines  WHERE id = " + id;
	// 		ResultSet rs = st.executeQuery(sql);

	// 	} catch(SQLException ex) {
	// 		System.out.println(ex);
	// 	}
	// }

	public ResultSet getMed(int id) {
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM medicines";
			if(id != 0) {
				sql += " WHERE id = " + id;
			}
			sql += " ORDER BY id";

			// Execute SELECT Query
			rs = st.executeQuery(sql);

			// Return Table
			return rs;

		} catch(SQLException ex) {
			System.out.println(ex);
		}
		return rs;
	}
}