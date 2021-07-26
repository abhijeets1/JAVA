import medicine.*;
import java.sql.*;

class dbaccess {

	// Medicine Object
	static med object = new med();

	public static void main(String[] args) {

		// Delete already inserted medicines
		object.deleteMed(0);
		
		// Insert Medicine
		object.insertMed(1, "Para", "12-2-22", 100, 12.33f);
		object.insertMed(2, "Cough", "23-7-21", 250, 2.00f);
		object.insertMed(3, "Fever", "6-4-21", 250, 1.45f);
		displayMed();

		// Delete Medicine
		object.deleteMed(2);
		displayMed();
	}

	private static void displayMed() {
		try {
			ResultSet rs = object.getMed(0);
			System.out.println("\nId | Name | Expdate | Quantity | Price");
			while(rs.next()) {
				System.out.print(rs.getInt(1) + " " + rs.getString(2));
				System.out.print(" " + rs.getString(3) + " " + rs.getString(4));
				System.out.println(" " + rs.getFloat(5));
			}
			System.out.println();
		} catch(SQLException ex) {
			System.out.println(ex);
		}
	}
}