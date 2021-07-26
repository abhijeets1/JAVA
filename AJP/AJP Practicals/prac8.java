// Write a Program to demonstrate the function of JLabel, JTextField and JPasswordField Using Listener Interface.

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class prac8 extends JFrame implements ActionListener {

	// Components Declaration
	JLabel label, idlabel, passlabel;
	JTextField textfield;
	JPasswordField passwordfield;
	JButton button;

	prac8() {
		
		// Form Label
		label = new JLabel("Login");
		label.setBounds(100,100,100,30);
		add(label);

		// Id Field
		idlabel = new JLabel("Enter Id: ");
		idlabel.setBounds(100,150,100,30);
		textfield = new JTextField();
		textfield.setBounds(200,150,100,30);
		add(idlabel);
		add(textfield);

		// Password Field
		passlabel = new JLabel("Enter Password: ");
		passlabel.setBounds(100,200,100,30);
		passwordfield = new JPasswordField();
		passwordfield.setBounds(200,200,100,30);
		add(passlabel);
		add(passwordfield);

		// Submit Button
		button = new JButton("Submit");
		button.setBounds(200,250,100,30);
		button.addActionListener(this);
		add(button);

		// JFrame
		setLayout(null);
		setVisible(true);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		String user_id = textfield.getText();
		String user_pass = String.valueOf(passwordfield.getPassword());
		System.out.println("Id: " + user_id + "\nPassword: " + user_pass);
		System.exit(0);
	}

	public static void main(String[] args) {
		new prac8();
	}
}