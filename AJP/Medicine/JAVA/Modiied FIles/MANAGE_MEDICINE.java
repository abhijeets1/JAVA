import javax.swing.*;
import javax.swing.UIManager;
import java.awt.*;
import java.awt.event.*; 
import oracle.jdbc.driver.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.*;
import javax.swing.event.*;
import java.text.*;  
import javax.swing.text.*;  
import java.text.SimpleDateFormat;
import java.util.Date;
class DateCompare
{
	public static boolean valid(String d1)
	{
		 try{
		 		DateFormat nf = new SimpleDateFormat("dd-MMM-yyyy");
		 		Date date1 = nf.parse(d1);       
				Date sysdate = new Date();				
				// System.out.println(sysdate.compareTo(date1) < 0);
				return sysdate.before(date1); //< 0;
		 }	catch(Exception ex){ex.printStackTrace();};
		 return false;
			
	}
}
class Frame1 extends JInternalFrame implements ActionListener, KeyListener
{
	JTextField f[];
	JButton btn;
	JLabel l; 
	Connection con;
	OracleDriver dr;
	MaskFormatter mask;
	JFormattedTextField dateTextField;
    public Frame1()
	{
		super("Insert Medicine",false,false,false,false);

		try
		{
			dr = new OracleDriver();
			DriverManager.registerDriver(dr);
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","sahil");
			mask = new MaskFormatter("##-UUU-####");
		}
        catch(Exception ex){System.out.println(ex.getMessage());}
        
        GridLayout lay = new GridLayout(6,2);
        lay.setHgap(15);
        lay.setVgap(10);
		this.setLayout(lay);
		String labels[] = {"Medicine name: ","Quantity: ","Price : "};
		f = new JTextField[4];
		for (int i=0;i<3;i++ ) {

			l = new JLabel(labels[i]);
			l.setFont(new Font("Calibri",Font.PLAIN,25));
			this.add(l);
			f[i] = new JTextField();
			f[i].setFont(new Font("Calibri",Font.PLAIN,25));
			f[i].addKeyListener(this);
			this.add(f[i]);
		}
		JLabel date_l = new JLabel("Expiry date: ");
		date_l.setFont(new Font("Calibri",Font.PLAIN,25));
		dateTextField = new JFormattedTextField(mask);
		this.add(date_l);
		dateTextField.setFont(new Font("Calibri",Font.PLAIN,25));
		this.add(dateTextField);

		btn = new JButton("Insert Medicine");
		this.add(btn);
		btn.setFont(new Font("Calibri",Font.PLAIN,25));
		btn.addActionListener(this);
		btn = new JButton("Clear");
		this.add(btn);

		btn.setFont(new Font("Calibri",Font.PLAIN,25));
		btn.addActionListener(this);
		l = new JLabel("");
		this.add(l);
		this.setVisible(true);
	     this.setBounds(100,100,550,300);
         
         

	}
	public void keyPressed(KeyEvent kef)
	{
		Character key_t = kef.getKeyChar();
		if (kef.getSource() == f[1]) 
		{
			if(Character.isDigit(key_t) || Character.isISOControl(key_t))
			{  
				f[1].setEditable(true); 
			}
			else
			{
				f[1].setEditable(false); 
			}	
		}
		else if (kef.getSource() == f[2]) {

			if(Character.isDigit(key_t) || Character.isISOControl(key_t)  ||  key_t.equals('.')&& (!f[2].getText().contains(".")) )
			{  
				f[2].setEditable(true); 
			}
			else
			{
				f[2].setEditable(false); 
			}
		}

	}
	public void keyTyped(KeyEvent ke){}
	public void keyReleased(KeyEvent ke){}

	public void actionPerformed(ActionEvent ae)
	{

     	if(ae.getActionCommand().equals("Insert Medicine"))
		{
			String name = f[0].getText();
			String qty = f[1].getText();
			String price = f[2].getText();
			String exp_date = dateTextField.getText();
			if(!DateCompare.valid(exp_date))
			{
				JOptionPane.showMessageDialog(this,"Invalid Date");
				dateTextField.setText("");
			}
			else
			{
				 try
				{

						PreparedStatement st = con.prepareStatement("insert into medicine(name, qty, price, exp) values(?,?,?,?)");
						st.setString(1,name);
						st.setString(2,qty);
						st.setString(3,price);
						st.setString(4,exp_date);
						int a_r = st.executeUpdate();
						if(a_r!=0)
							l.setText("Record inserted");
						else
							l.setText("Fail in insertion");
				}

				catch(Exception er){System.out.println(er.getMessage());}
			}
           
		}
		else if(ae.getActionCommand().equals("Clear"))
		{
			f[0].setText("");
			f[1].setText("");
			f[2].setText("");
			dateTextField.setText("");
			l.setText("");
		}
	}
}
class Frame2 extends JInternalFrame implements KeyListener,ListSelectionListener,ActionListener
{
	JSplitPane jsp;
	JPanel p1,p2;
	JList list;
	JLabel l1;
	JLabel arr[];
	JTextField txt[];
	Vector <String> v = new Vector <String>();
	JTextField search;
	JScrollPane jpane;
	JButton b[];
	int RowID = -1;
    OracleDriver dr;
	Connection con;
	JFormattedTextField dateTextField;
	MaskFormatter mask;
	public Frame2()
	{

		super("Search Update Delete",false,false,false,false);

		try
		{
			mask = new MaskFormatter("##-UUU-####");
		}
		catch(Exception forma)
		{System.out.println(forma);}

		p1 = new JPanel();
		p1.setLayout(null);

		l1 = new JLabel("Search Medicine: ");
		l1.setFont(new Font("Calibri",Font.BOLD,20));
		l1.setBounds(10,10,180,20);
		p1.add(l1);

		search = new JTextField();
		search.setBounds(10,30,230,30);
		search.setFont(new Font("Calibri",Font.PLAIN,20));
		search.addKeyListener(this);
		list = new JList(v);
		list.setFont(new Font("Calibri",Font.PLAIN,25));
		list.addListSelectionListener(this);
		getTableData();

        jpane = new JScrollPane(list);
		jpane.setBounds(10,80,230,300);
		p1.add(jpane);
		p1.add(search);
		//Panel2
        p2 = new JPanel();
        GridLayout lay2 = new GridLayout(6,2);
        lay2.setHgap(15);
        lay2.setVgap(10);
        p2.setLayout(lay2);
		arr= new JLabel[3];
		txt = new JTextField[3];

		String labels[] = {"  Name","  Quantity","  Price"};

		for (int i=0;i<arr.length;i++) {

			arr[i] = new JLabel(labels[i]);
			arr[i].setFont(new Font("Calibri",Font.PLAIN,25));
			txt[i] = new JTextField();
			txt[i].setFont(new Font("Calibri",Font.PLAIN,25));
			txt[i].addKeyListener(this);
			p2.add(arr[i]);
			p2.add(txt[i]);
		}
		JLabel date_l = new JLabel("Expiry date");
		date_l.setFont(new Font("Calibri",Font.PLAIN,25));
		p2.add(date_l);
		dateTextField = new JFormattedTextField(mask);
		dateTextField.setFont(new Font("Calibri",Font.PLAIN,25));
		p2.add(dateTextField);

		String b_l[] = {"Update","Delete"};

     	b = new JButton[2];
		for (int i=0;i<b.length;i++) {

			b[i] = new JButton(b_l[i]);
			b[i].setFont(new Font("Calibri",Font.PLAIN,25));
			b[i].addActionListener(this);
			b[i].setFocusPainted(false);
			b[i].setBorderPainted(false);
			p2.add(b[i]);

		}

		jsp = new JSplitPane(SwingConstants.VERTICAL,p1,p2);
		jsp.setDividerLocation(250);
		this.add(jsp);
		this.setSize(200,200);
		this.setBounds(370,10,530,300);
		this.setVisible(true);

	}

	public void getTableData()
	{
		try
		{	

			connect();

			PreparedStatement st = con.prepareStatement("select name from medicine");

			ResultSet rs = st.executeQuery();

			while(rs.next())
			{
     			String name = rs.getString(1);
    			v.add(name);
			}

			list.setListData(v);

		}

		catch(Exception la){System.out.println(la.getMessage());}

	}

	public void connect()

	{
		try

		{
			dr = new OracleDriver();
			DriverManager.registerDriver(dr);
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","sahil");
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public void keyPressed(KeyEvent ke)
	{
		char ch = ke.getKeyChar();
		if(ke.getSource() == search)
		{
			if(Character.isLetter(ch) || Character.isWhitespace(ch) || Character.isISOControl(ch))
			{  
				search.setEditable(true); 
				try
				{

					PreparedStatement st = con.prepareStatement("select name from medicine where name like '"+search.getText()+"%'");

					ResultSet rs = st.executeQuery();

					Vector <String> v = new Vector <String>();

					while(rs.next())

					{

						String name = rs.getString(1);

						v.add(name);

					}

					list.setListData(v);

				}
				catch(Exception la)
				{System.out.println(la.getMessage());}
			}
			else {search.setEditable(false);}
		}
	}
	public void valueChanged(ListSelectionEvent ls)
	{

		connect();
		txt[0].setEditable(false);
		txt[1].setEditable(false);
		txt[2].setEditable(false);
		String f = (String)list.getSelectedValue();
		try 
		{
			PreparedStatement st = con.prepareStatement("select id,name,qty,price,exp from medicine where name=?");

			st.setString(1,f);

			ResultSet rs = st.executeQuery();

			while(rs.next())

			{
				RowID = Integer.parseInt(rs.getString(1));
				String n1 = rs.getString("name");
				String q1 = rs.getString("qty");
				String p1 = rs.getString("price");
				String d1 = rs.getString("exp");
				d1 = d1.substring(0,10);
			   
			    DateFormat of = new SimpleDateFormat("yyyy-mm-dd");
	 			DateFormat nf = new SimpleDateFormat("dd-MMM-yyyy");
	 			Date date1 = of.parse(d1);
	 			// Dat
	 			String xx = nf.format(date1);
	 			d1=xx;

				txt[0].setText(n1);
				txt[1].setText(q1);
				txt[2].setText(p1);
				dateTextField.setText(d1);
				txt[0].setEditable(true); dateTextField.setEditable(true); txt[1].setEditable(true);	txt[2].setEditable(true);	
			}

		}
		catch(Exception mm){System.out.println("ex" + mm.getMessage());}
	}

	public void actionPerformed(ActionEvent lol)

	{

		Object obj = lol.getSource();

		connect();

		if(obj==b[0])

		{

			String n = txt[0].getText();
			String q = txt[1].getText();
			String p = txt[2].getText();
			String d = dateTextField.getText();
			if(!DateCompare.valid(d))
			{
				JOptionPane.showMessageDialog(this,"Invalid Date");
				// dateTextField.setText("");
			}
			else
			{
				try

					{

						PreparedStatement st = con.prepareStatement("update medicine set name=?,qty=?,price=?,exp=? where id=?");

						st.setString(1,n);

						st.setString(2,q);

						st.setString(3,p);

						st.setString(4,d);

						st.setInt(5,RowID);
						// RowID=-1;
						int no_a = st.executeUpdate();

						if(no_a!=0)

						{
							v.clear();
							getTableData();
							JOptionPane.showMessageDialog(this,"Record updated");
						}
						else
						{
							JOptionPane.showMessageDialog(this,"Error in updation");
						}
					}
					catch(Exception mc){System.out.println(mc.getMessage());}
			}		
		}

		else if(obj==b[1])
		{
			String o = txt[0].getText();


			try

			{

				PreparedStatement st = con.prepareStatement("delete from medicine where id=?");

				st.setInt(1,RowID);
				RowID=-1;

				int n = st.executeUpdate();

				txt[0].setText("");

				txt[1].setText("");

				txt[2].setText("");

				dateTextField.setText("");

				if(n!=0)

				{

					v.clear();

					getTableData();

					JOptionPane.showMessageDialog(this,"Record deleted");

				}

				else

				{

					JOptionPane.showMessageDialog(this,"Error in deletion");

				}

			}

			catch(Exception oye){System.out.println(oye.getMessage());}

		}

	}

	public void keyTyped(KeyEvent ke1){

				Character key_t2 = ke1.getKeyChar();
				// char k = key_t2;
				if(ke1.getSource() == txt[1]) 
				{
					
					if(Character.isDigit(key_t2) || Character.isISOControl(key_t2) )
					{  
						txt[1].setEditable(true); 
					}
					else
					{
						txt[1].setEditable(false); 
					}	
				}
				else if (ke1.getSource() == txt[2]) 
				{				
					if(Character.isDigit(key_t2) || Character.isISOControl(key_t2) ||  key_t2.equals('.')&& (!txt[2].getText().contains(".")) )
					{  
						txt[2].setEditable(true); 
					}
					else
					{
						txt[2].setEditable(false); 
					}
				}

	}
	public void keyReleased(KeyEvent ke){}
}

class Frame3 extends JInternalFrame 
{
	OracleDriver dr;
	Connection con;
	JTable table;
	Vector <Vector> rows;
	Vector <String> cols;
	public Frame3()
	{
		super("All Employees",false,false,false,false);
		try
		{
			dr = new OracleDriver();
			DriverManager.registerDriver(dr);
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","sahil");
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		cols = new Vector <String>();
		cols.add("Medicine name");
		cols.add("Medicine qty");
		cols.add("Medicine price");
		cols.add("Medicine exp");

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

			PreparedStatement st = con.prepareStatement("select * from medicine order by name asc");

			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				String name = rs.getString("name");
				String j = rs.getString("qty");
				String s = rs.getString("price");
				String da = rs.getString("exp");
				Vector <String> sr = new Vector <String>();

			    DateFormat of = new SimpleDateFormat("yyyy-mm-dd");
				Date date1 = of.parse(da.substring(0,10));       		 					   
	 			DateFormat nf = new SimpleDateFormat("dd-MMM-yyyy");
	 			da = nf.format(date1);
	 			
				sr.add(name);
				sr.add(j);
				sr.add(s);
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
	}
} 

class MyFrame extends JFrame implements ActionListener

{
	JDesktopPane dpane;
	JToolBar toolb;
	JButton b;
	Frame1 f1;
    Frame2 f2;
	Frame3 f3;
	JTable l;
	JMenuBar bar;
	JMenu Themes;
	JMenuItem t1,t2,t3;
    CardLayout crd = new CardLayout();
	public MyFrame()
	{
		super("Shree Pharma");
		// this.setUndecorated(true);
		bar = new JMenuBar();
		this.setJMenuBar(bar);
		Themes = new JMenu("Options");
		bar.add(Themes);

		t1 = new JMenuItem("Exit");
		t1.setFont(new Font("Calibri",Font.PLAIN,16));
		t1.addActionListener(this);
		Themes.add(t1);

        toolb = new JToolBar(JToolBar.HORIZONTAL);
		toolb.setLayout(new GridLayout(1,4));
		toolb.setFloatable(false);

        String str[] = {"Insert Medicine","Update Delete","View Medicines"};

        for (int i=0;i<str.length;i++ ) {
	
			b = new JButton(str[i]);
			b.setFont(new Font("Calibri",Font.PLAIN,25));
			b.setFocusPainted(false);
            b.setBorderPainted(false);
            b.setBackground(Color.LIGHT_GRAY);
            b.setForeground(Color.BLACK);
			if(i==1 && i==2)
				toolb.addSeparator();
			b.addActionListener(this);
			toolb.add(b);			
		}
		this.add(toolb,BorderLayout.NORTH);
		dpane = new JDesktopPane();
        this.add(dpane);
        dpane.setLayout(new BorderLayout());
        dpane.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
		this.setVisible(true);	
		this.setSize(900,600);
        this.setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent e)
	{
     
		byte cnt=0;
		String c = e.getActionCommand();
		if(c.equals("Insert Medicine"))
		{	
			int k=0;	
			JInternalFrame arr[] = dpane.getAllFrames();
			dpane.setBackground(Color.LIGHT_GRAY);
			for (int i=0;i<arr.length;i++) {
				if (f1==arr[i]) {
					k++;
					break;
				}
			}

			if(k==0)			//for start check here as there are no JInternalFrames the value of k=0 and f1=null;
            		f1=null;
            
			if(f1 == null)
    		{
                dpane.removeAll();
                f1 = new Frame1();
                dpane.add(f1);
			 	
			}
			else
			{
                
				JOptionPane.showMessageDialog(this,"This frame is already open.","Warning",JOptionPane.WARNING_MESSAGE);
            }
            
            dpane.repaint();
		}
		else if(c.equals("Update Delete"))
		{
			int k=0;
			JInternalFrame arr[] = dpane.getAllFrames();
			for (int i=0;i<arr.length;i++) {
				if(f2==arr[i])
				{
					k++;
					break;
				}
			}
			if(k==0)
				f2=null;
			
           
			if(f2 == null)
    		{
                dpane.removeAll();
                f2 = new Frame2();
                dpane.add(f2);
			}
			else
			{
               
				JOptionPane.showMessageDialog(this,"This frame is already open.","Warning",JOptionPane.WARNING_MESSAGE);
            }
            
            dpane.repaint();
		}
		else if(c.equals("View Medicines"))
		{
			int k=0;	
			JInternalFrame arr[] = dpane.getAllFrames();

			for (int i=0;i<arr.length;i++) {
				if (f3==arr[i]) {
					k++;
					break;
				}
			}

			if(k==0)			//for start check here as there are no JInternalFrames the value of k=0 and f1=null;
            		f3=null;
            
    		if(f3 == null)
			{
                dpane.removeAll();
                f3 = new Frame3();
                dpane.add(f3);
			}
			else
			{			 	
				JOptionPane.showMessageDialog(this,"This frame is already open.","Warning",JOptionPane.WARNING_MESSAGE);
            }
            dpane.repaint();
		}
		else if (c.equals("Exit")) {
			this.dispose();
		}
	}
}			  

public class MANAGE_MEDICINE
{
	public static void main(String[] args) {
		new MyFrame();
	}
}