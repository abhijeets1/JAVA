// Write a Program to demonstrate the various Mouse events using MouseListener and MouseMotionListener Interface.

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class prac7 extends JFrame implements MouseListener, MouseMotionListener {

	// Components Declaration
	JLabel label;

	prac7() {
		
		// JLabel
		label = new JLabel();
		label.setBounds(100,100,200,20);
		add(label);

		// Adding Listener to JFrame
		addMouseListener(this);
		addMouseMotionListener(this);
		
		// JFrame
		setLayout(null);
		setVisible(true);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void mouseClicked(MouseEvent e) {
		label.setText("Mouse Clicked");
	}
	public void mouseEntered(MouseEvent e) {
		label.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent e) {
		label.setText("Mouse Exited");
	}
	public void mousePressed(MouseEvent e) {
		label.setText("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent e) {
		label.setText("Mouse Released");
	}

	public void mouseDragged(MouseEvent e) {
		label.setText("Mouse Dragged");
	}  
	public void mouseMoved(MouseEvent e) {
		label.setText("Mouse Moved");
	}

	public static void main(String[] args) {
		new prac7();
	}
}