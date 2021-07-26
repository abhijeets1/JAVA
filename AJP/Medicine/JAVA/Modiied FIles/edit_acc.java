import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;
public class edit_acc
{
	public static void main(String args[])
	{ new UpdateFrame(); }

}
class UpdateFrame extends JFrame implements ActionListener
{							
	private static final long serialVersionUID = 1L;
	JTextField tb1;
    JLabel l1,l2;
	JButton b1;    JTextField pf;
	public Connection con_obj;
	public UpdateFrame()
	{
		super("Shree Medical");


		this.setLayout(null);
		l1 = new JLabel("Enter new Username");
		this.add(l1);
		l1.setFont(new Font("Consolas",Font.PLAIN,22));
		l1.setBounds(30, -100, 300, 300);
		
		tb1 = new JTextField(22);
		this.add(tb1);
		tb1.setFont(new Font("Consolas",Font.PLAIN,22));
		tb1.setBounds(30, 70, 300, 30);
		tb1.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));


		l2 = new JLabel("Enter new Password");
		this.add(l2);
		l2.setFont(new Font("Consolas",Font.PLAIN,22));
		l2.setBounds(30, 130, 300, 30);


		pf = new JTextField(22);
		this.add(pf);
		pf.setFont(new Font("Consolas",Font.PLAIN,22));
		pf.setBounds(30, 160, 300, 30);
		pf.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));


		b1 = new JButton("Update",new ImageIcon("user.png"));
		this.add(b1);
		b1.setFont(new Font("Verdana",Font.PLAIN,20));
		b1.setFocusPainted(false);
		b1.setBounds(40, 250, 270, 30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

		Container con_p = this.getContentPane();
		con_p.setBackground(Color.WHITE);

		connect();

		this.setVisible(true);
		this.setSize(379,400);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		b1.addActionListener(this);

	}
	public void connect()
	{
		try {		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con_obj = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","sahil");
			PreparedStatement stmt = con_obj.prepareStatement("select * from login");
			ResultSet rs_o = stmt.executeQuery();
			String user =""; String pass_db ="";
			while(rs_o.next())
			{
					user = rs_o.getString("username");
					pass_db = rs_o.getString("password");
			}
			tb1.setText(user);
			pf.setText(pass_db);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error in database connection","Error",JOptionPane.WARNING_MESSAGE);
			this.dispose();
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		String new_user = tb1.getText();
		String new_pass = pf.getText();
			try {
					PreparedStatement stmt = con_obj.prepareStatement("update login set username=?, password=?");
					stmt.setString(1, new_user);
					stmt.setString(2, new_pass);
					int no_r_a = stmt.executeUpdate();
					if(no_r_a!=0){
						JOptionPane.showMessageDialog(this, "Username and Password updated","Shree Pharma",JOptionPane.INFORMATION_MESSAGE);
						this.dispose();
					}
			} 
			catch (Exception exp) {
				JOptionPane.showMessageDialog(this, "Error","Shree Pharma",JOptionPane.WARNING_MESSAGE);
			}
	}
	
}