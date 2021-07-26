import javax.swing.*;
import java.awt.event.*;

class mainclass extends JFrame implements ActionListener{
	JRadioButton r1,r2,r3,r4;
	ButtonGroup bg,sub_bg;
	JLabel l;
	mainclass() {
		r1 = new JRadioButton("Yes",false);
		r1.setBounds(70,50,60,60);
		r2 = new JRadioButton("No",false);
		r2.setBounds(140,50,60,60);
		r1.addActionListener(this);
		r2.addActionListener(this);
		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		r3 = new JRadioButton("Male",false);
		r3.setBounds(70,120,60,60);
		r4 = new JRadioButton("Female",false);
		r4.setBounds(140,120,60,60);
		r3.addActionListener(this);
		r4.addActionListener(this);
		sub_bg = new ButtonGroup();
		sub_bg.add(r3);
		sub_bg.add(r4);
		r3.setVisible(false);
		r4.setVisible(false);

		l = new JLabel("Want to Specify your gender ?");
		l.setBounds(60,25,1000,30);

		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(l);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new mainclass();
	}

	public void actionPerformed(ActionEvent e) {
		if(r1.isSelected()) {
			r3.setVisible(true);
			r4.setVisible(true);
			if(r3.isSelected()) {
				JOptionPane.showMessageDialog(this,"Male");
			}
			if(r4.isSelected()) {
				JOptionPane.showMessageDialog(this,"Female");
			}
		}

		if(r2.isSelected()) {
			r3.setVisible(false);
			r4.setVisible(false);
		}
		
	}
}