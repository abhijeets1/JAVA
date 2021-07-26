// Write a Program to demonstrate the use of WindowAdapter class.

import java.awt.*;
import java.awt.event.*;

public class prac9 extends Frame {

	prac9() {

		// Window Adapter
		this.addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent arg0) {
				System.out.println("activated");
			}
			public void windowClosed(WindowEvent arg0) {
				System.out.println("closed");
			}  
			public void windowClosing(WindowEvent arg0) {
				System.out.println("closing");
				dispose();
			}
			public void windowDeactivated(WindowEvent arg0) {
				System.out.println("deactivated");
			}
			public void windowDeiconified(WindowEvent arg0) {
				System.out.println("deiconified");
			}
			public void windowIconified(WindowEvent arg0) {
				System.out.println("iconified");
			}
			public void windowOpened(WindowEvent arg0) {
				System.out.println("opened");
			}
		});

		// Frame
		setLayout(null);
		setVisible(true);
		setSize(400,400);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new prac9();
	}
}