import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import oracle.jdbc.driver.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.*;
import javax.swing.event.*;
class CUS_F extends JFrame 
{
	OracleDriver dr;
	Connection con;
	JTable table;
	Vector <Vector> rows;
	Vector <String> cols;
	public CUS_F()
	{
		super("Customers records");
		try
		{
			dr = new OracleDriver();
			DriverManager.registerDriver(dr);
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","sahil");
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		cols = new Vector <String>();
		cols.add("Customer name");
		cols.add("Customer contact");
		cols.add("Total amount");
		cols.add("Purchase date");
		rows = new Vector <Vector>();
		table = new JTable(rows,cols);

		JScrollPane jsp = JTable.createScrollPaneForTable(table);

		JTableHeader head = table.getTableHeader();

		head.setBackground(Color.GRAY);
        head.setForeground(Color.WHITE);
        table.setRowHeight(30);
		head.setFont(new Font("Calibri",Font.PLAIN,20));
		table.setFont(new Font("Calibri",Font.PLAIN,20));
		this.add(jsp,BorderLayout.CENTER);
		try
		{

			PreparedStatement st = con.prepareStatement("select * from bill order by name asc");

			ResultSet rs = st.executeQuery();
			while(rs.next())

			{

				String name = rs.getString("name");
				String j = rs.getString("contact");
				int s = rs.getInt("amount");
				String da = rs.getString("pur_date");
				Vector <String> sr = new Vector <String>();

				sr.add(name);
				sr.add(j);
				sr.add(s+"");
				sr.add(da);
				rows.add(sr);

			}
				rs.close();
				st.close();
				con.close();	
		}
		catch(Exception ee){System.out.println(ee.getMessage());}
		this.setBounds(20,320,850,200);
		this.setVisible(true);
		this.setExtendedState(6);
	}
} 
public class Customer 
{
	public static void main(String[] args) {
		new CUS_F();
	}
}