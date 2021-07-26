// Practical 1 :- Write a Program to demonstrate the use of JLabel and ImageIcon, JTextField and JPasswordField.

import javax.swing.*;
import java.awt.*;

class P1 extends JFrame {

	private P1() {
		// JFrame Title
		super("JLabel, JTextField, JPasswordField");

		// Id JLabel & JTextField
		JLabel id_label = new JLabel("Enter Id : ");
		id_label.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(id_label);
		add(new JTextField(""));

		// Password JLabel & JPasswordField
		JLabel pass_label = new JLabel("Enter Password : ");
		pass_label.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(pass_label);
		add(new JPasswordField(""));

		// Submit JButton
		add(new JLabel(""));
		add(new JButton("Submit"));

		// JFrame
		setVisible(true);
		setSize(400, 150);
		setLayout(new GridLayout(3, 2));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new P1();
	}

}
