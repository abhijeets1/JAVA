import javax.swing.*;
import java.awt.event.*;

class mainclass extends JFrame implements ActionListener{
	JRadioButton r1,r2;
	ButtonGroup bgrp;
	JButton b;
	mainclass() {
		r1 = new JRadioButton("C++",true);
		r2 = new JRadioButton("Java");
		r1.setBounds(40,40,60,60);
		r2.setBounds(120,40,60,60);

		bgrp = new ButtonGroup();
		bgrp.add(r1);
		bgrp.add(r2);

		b = new JButton("Click to Submit");
		b.setBounds(30,100,130,30);
		b.addActionListener(this);
		add(r1);
		add(r2);
		add(b);
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
			JOptionPane.showMessageDialog(this,"C++");
		}
		if(r2.isSelected()) {
			JOptionPane.showMessageDialog(this,"Java");	
		}
	}
}