// Practical 1 :- Write a Program to demonstrate the use of JLabel and ImageIcon, JTextField and JPasswordField.

import javax.swing.*;
import java.awt.*;

class P1b extends JFrame {

	private P1b() {
		// JFrame Title
		super("ImageIcon");

		// Login Label & Image
		ImageIcon imageIcon = new ImageIcon("icon.jpg");
		JLabel label = new JLabel("", imageIcon, JLabel.CENTER);
		add(label);

		// JFrame
		setVisible(true);
		setSize(400, 320);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new P1b();
	}

}