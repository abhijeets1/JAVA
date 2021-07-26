import javax.swing.*;
import javax.swing.UIManager;
import java.awt.*;
import java.awt.event.*; 
import oracle.jdbc.driver.*;
import java.sql.*;
import java.util.*;
import javax.swing.table.*;
import javax.swing.event.*;
class Bill extends JFrame implements KeyListener,ListSelectionListener,ActionListener
{
	JSplitPane jsp;
	JPanel p1,p2;
	JList list;
	JLabel l1;
	JLabel arr[];
	JTextField txt[];
	Vector <String> v = new Vector <String>();
	JTextField search,qty;
	JScrollPane jpane;
    JButton gen_bill;
    JLabel total_amount;
    JButton add_med;
    JTable table;
    DefaultTableModel table_model;
	Vector <Vector> rows;
    Vector <String> cols;
    OracleDriver dr;
    Connection con;
    Vector <String>med_data = new Vector<String>();
    JLabel avail_stock = new JLabel();
    GridBagConstraints gbc; 
    double bill;
    Vector <Integer>ids = new Vector<Integer>();
    int tempid;
    public static void main(String[] args) {
        Bill b = new Bill();
    }

	public Bill()
	{
		super("Generate Bill");
     
		p1 = new JPanel();
		p1.setLayout(null);

		l1 = new JLabel("Search for a Medicine: ");
		l1.setFont(new Font("Calibri",Font.BOLD,20));
		l1.setBounds(10,10,200,20);
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

        JLabel avail = new JLabel(" Available Stock: ");
        avail.setFont(new Font("Calibri",Font.PLAIN,20));
        avail .setBounds(10,400,115+30,30);
        p1.add(avail);

        avail_stock.setFont(new Font("Calibri",Font.PLAIN,20));
        avail_stock .setBounds(115+30+10,400,115-30,30);
        p1.add(avail_stock);

        JLabel qty_label = new JLabel(" Quantity: ");
        qty_label.setFont(new Font("Calibri",Font.PLAIN,20));
        qty_label.setBounds(10,450,115,30);
        p1.add(qty_label);
        
        qty = new JTextField();
        qty.setFont(new Font("Calibri",Font.PLAIN,20));
        qty.setBounds(115+10,450,115,30);
        p1.add(qty);
        qty.addKeyListener(this);

        add_med = new JButton("Add Medicine");
        add_med.addActionListener(this);
        add_med.setFont(new Font("Calibri",Font.PLAIN,20));
        add_med.setBounds(10,500,230,40);
        p1.add(add_med);

		//Panel2
        p2 = new JPanel();
	p2.setLayout(new GridBagLayout());
    Insets in = new Insets(0,0,0,0);
        String labels[] = {"  Customer Name : ","  Contant No :"};
        arr= new JLabel[labels.length];
        txt = new JTextField[labels.length];
        int y=0;
		for (int i=0;i<arr.length;i++) {
            
			arr[i] = new JLabel(labels[i]);
			arr[i].setFont(new Font("Calibri",Font.PLAIN,25));
			txt[i] = new JTextField();
            txt[i].setFont(new Font("Calibri",Font.PLAIN,25));

            gbc  = new GridBagConstraints(0,y,1,1,1.0,1.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,in,1,1);
            p2.add(arr[i],gbc);
            gbc  = new GridBagConstraints(1,y,1,1,1.0,1.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,in,1,1);
            p2.add(txt[i],gbc);
            y++;
		}
        txt[1].addKeyListener(this);
/////////////////
//Medicine Lists

        cols = new Vector <String>();
		cols.add("Medicine Name");
		cols.add("Price");
		cols.add("Quantity");
		cols.add("Total Price");
        rows = new Vector <Vector>();
        
        table_model = new DefaultTableModel(rows,cols);
		table = new JTable(table_model);

		JScrollPane table_scroll = JTable.createScrollPaneForTable(table);

		JTableHeader head = table.getTableHeader();

		head.setBackground(Color.GRAY);
        head.setForeground(Color.WHITE);
        table.setRowHeight(20);
		head.setFont(new Font("Calibri",Font.PLAIN,15));
        table.setFont(new Font("Calibri",Font.PLAIN,15));
        gbc  = new GridBagConstraints(0,2,2,2,1.0,1.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,in,0,0);
        p2.add(table_scroll,gbc);   
         
/////////////////
        total_amount = new JLabel("Total Amount: Rs. ");
        total_amount.setFont(new Font("Calibri",Font.PLAIN,25));
        gbc  = new GridBagConstraints(0,4,1,1,1.0,1.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,in,0,0);
        p2.add(total_amount,gbc);

        gen_bill = new JButton("Generate");
        gen_bill.addActionListener(this);
        gen_bill.setFont(new Font("Calibri",Font.PLAIN,25));
        gbc  = new GridBagConstraints(1,4,1,1,1.0,1.0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,in,0,0);
        p2.add(gen_bill,gbc);

		jsp = new JSplitPane(SwingConstants.VERTICAL,p1,p2);
		jsp.setDividerLocation(250);
		this.add(jsp);
		this.setSize(900,600);		
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // this.setDefaultCloseOperation(EXIT_ON_CLOSE);
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
    
    public void keyReleased(KeyEvent ke)
	{
		char ch = ke.getKeyChar();
		if(ke.getSource() == search)
		{
			if(Character.isLetter(ch) || Character.isWhitespace(ch) || Character.isISOControl(ch) )
			{  
				// search.setEditable(true); 
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
			// else {search.setEditable(false);}
        }
        else if(ke.getSource()==qty)
        {
          
            if(Character.isLetter(ch)){qty.setText("");}
            String text = qty.getText();
            if(Character.isDigit(ch)  || Character.isISOControl(ch) )
            {
                // qty.setEditable(true);
                
                int q = Integer.parseInt(text);
                if(avail_stock.getText().equals(""))
                {
                    qty.setText("");
                }
                    else
                {
                    if(q>Integer.parseInt(avail_stock.getText()) || q ==0)
                    {
                        qty.setText(avail_stock.getText());
                    }                
                    else
                    {
                        //Format is perfect
                    }
                }                
                
            }
            else
            {
                qty.setText(text.substring(0,text.length()-1));
            }
            
        }
        else if(ke.getSource()==txt[1])
        {
             if((Character.isDigit(ch)  || Character.isISOControl(ch)) &&(txt[1].getText().length())<=10)
             {
                txt[1].setEditable(true);
             }
             else
             {
                txt[1].setEditable(false);
                txt[1].setText(txt[1].getText().substring(0,txt[1].getText().length() - 1))      ;          
             }
        }
	}

    public void valueChanged(ListSelectionEvent ls)
	{
        if (!ls.getValueIsAdjusting()) {//This line prevents double events         
        
		connect();
		String f = (String)list.getSelectedValue();
		try 
		{
            
            String sql = "select * from medicine where name=? and exp > SYSDATE";
            System.out.println(sql);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,f);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
                int i = rs.getInt(1);
                tempid = i;
                String n = rs.getString(2);
                String d = rs.getString(3);
                int q = rs.getInt(4);
                double p = rs.getDouble(5);                
                avail_stock.setText(String.valueOf(q));               
                med_data.clear();
                med_data.add(n);
                med_data.add(p+"");
			}
		}
        catch(Exception mm){System.out.println("this is exception"+mm.getMessage());}
    }
	}

	public void actionPerformed(ActionEvent lol)
	{
		Object obj = lol.getActionCommand();
		// connect();
		if(obj.equals("Add Medicine"))
		{
            if(med_data.size()==2)
            {
                System.out.println("Inside block");
                med_data.add(qty.getText());
                int q = Integer.parseInt(qty.getText());
                double p = Double.parseDouble(med_data.get(1).toString());
                String tot = (q*p) +"";
                med_data.add(tot);
                Vector<String>m = (Vector<String>)med_data.clone();
                table_model.addRow(m);
                ids.add(tempid);                    
                calculateAmount();
            }                        
		}
        else if(obj.equals("Generate"))
		{
            if(txt[0].getText().equals("") || txt[1].getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"Enter both above details");
                
            }
            else
            {
                                
                            connect();
                            //txt[0]- name txt[1]- contact no,  bill - amount
                            //update into medicine minus the quantity
                            int row = table.getRowCount();
                            for(int j=0;j<row;j++)
                            {
                                int s  = Integer.parseInt(table.getValueAt(j,2).toString());
                                int idc = Integer.parseInt(ids.get(j).toString());
                            
                            try {
                                PreparedStatement st = con.prepareStatement("update medicine set qty = qty - ? where id = ?");
                                st.setInt(1,s);
                                st.setInt(2,idc);
                                int n = st.executeUpdate();
                                if(n!=0)
                                {
                                    // JOptionPane.showMessageDialog(this,"Record updated");
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(this,"Error in updation");
                                }
                            }
                            catch (Exception e) {
                                
                                System.out.println(e.getMessage());
                            }
                            }


                            //Insert

                            try {
                                PreparedStatement st = con.prepareStatement("insert into  bill(name,contact,amount,pur_date) values(?,?,?,SYSDATE)");
                                System.out.println(txt[0].getText());
                                st.setString(1,txt[0].getText());
                                System.out.println(txt[1].getText());
                                st.setString(2,txt[1].getText());
                                st.setDouble(3,bill);
                                int n = st.executeUpdate();
                                if(n!=0)
                                {
                                    // JOptionPane.showMessageDialog(this,"Record Inserted");
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(this,"Error in not Inserted");
                                }
                            }
                            catch (Exception e) {
                                
                                System.out.println(e.getMessage());
                            }


                            JOptionPane.showMessageDialog(this,"Your Amount: "+bill);



            }
        }
	}
    public void calculateAmount() //total_amount //table_model
    {
        int row = table.getRowCount();
        //Total Price
        double sum=0;
        for(int i=0;i<row;i++)
        {
            String s  = table.getValueAt(i,3).toString();
            // System.out.println(s);
            sum+=Double.parseDouble(s);
        }
        bill = sum;
        total_amount.setText("Total Amount: Rs.  "+sum);
    }
	public void keyTyped(KeyEvent ke){}
    public void keyPressed(KeyEvent ke){}
}
