// Write a Program to demonstrate the status of key on Applet window such as KeyPressed, KeyReleased, KeyUp, KeyDown.

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class prac6 extends JFrame implements KeyListener{

	// Components Declaration
	JLabel label;
	JTextArea area;

	prac6(){
		
		// JLabel and JTextArea
		label = new JLabel();
		area = new JTextArea();
		area.addKeyListener(this);
		add(label);
		add(area);
		
		// JFrame
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 1));
		setVisible(true);
	}

	public void keyPressed(KeyEvent e) {
		label.setText("Key Pressed");
	}
	public void keyReleased(KeyEvent e) {
		label.setText("Key Released");
	}
	public void keyTyped(KeyEvent e) {
		label.setText("Key Typed");
	}

	public static void main(String[] args) {
		new prac6();
	}
}