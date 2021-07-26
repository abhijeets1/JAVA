import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;
public class Login
{
	public static void main(String args[])
	{ new LoginFrame(); }

}
class LoginFrame extends JFrame implements ActionListener
{							
	private static final long serialVersionUID = 1L;
	JTextField tb1;
    JLabel l1,l2;
	JButton b1;    JPasswordField pf;
	public Connection con_obj;
	public LoginFrame()
	{
		super("Shree Medical");

		this.setLayout(null);
		l1 = new JLabel("Username");
		this.add(l1);
		l1.setFont(new Font("Consolas",Font.PLAIN,22));
		l1.setBounds(30, -100, 300, 300);
		
		tb1 = new JTextField(22);
		this.add(tb1);
		tb1.setFont(new Font("Consolas",Font.PLAIN,22));
		tb1.setBounds(30, 70, 300, 30);

		l2 = new JLabel("Password");
		this.add(l2);
		l2.setFont(new Font("Consolas",Font.PLAIN,22));
		l2.setBounds(30, 130, 100, 30);

		pf = new JPasswordField(22);
		this.add(pf);
		pf.setFont(new Font("Consolas",Font.PLAIN,22));
		pf.setBounds(30, 160, 300, 30);

		b1 = new JButton("Authenticate",new ImageIcon("user.png"));
		this.add(b1);
		b1.setFont(new Font("Verdana",Font.PLAIN,20));
		b1.setFocusPainted(false);
		b1.setBounds(40, 250, 270, 30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

		Container con_p = this.getContentPane();
		con_p.setBackground(Color.WHITE);

		this.setVisible(true);
		this.setSize(379,400);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		b1.addActionListener(this);
		connect();
	}
	public void connect()
	{
		try {		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con_obj = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","sahil");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error in database connection","Error",JOptionPane.WARNING_MESSAGE);
			this.dispose();
		}
	}
	public void actionPerformed(ActionEvent e)
	{
			try {
					PreparedStatement stmt = con_obj.prepareStatement("select * from login");
					ResultSet rs_o = stmt.executeQuery();
					String user =""; String pass_db ="";
					while(rs_o.next())
					{
							user = rs_o.getString("username");
							pass_db = rs_o.getString("password");
					}
					String ip_user = tb1.getText();
					char pass_get[] = pf.getPassword();
					String pass="";
					for(int i=0;i<pass_get.length;i++)
					{
							pass += pass_get[i];
					}
					String ip_pass = pass;

					if((user.equals(ip_user)) && (pass_db.equals(ip_pass)))
					{
							// JOptionPane.showMessageDialog(this, "Login success !!", "Shree Medical", JOptionPane.INFORMATION_MESSAGE);
							new home();
					}
					else
					{
							JOptionPane.showMessageDialog(this, "Invalid credentials","Shree Medical",JOptionPane.WARNING_MESSAGE);
					}
			} catch (Exception exp) {
				JOptionPane.showMessageDialog(this, "Error","Shree Medical",JOptionPane.WARNING_MESSAGE);
			}
	}
	
}			 
