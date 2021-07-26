import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class mainclass extends JFrame {

	mainclass() {
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 2));
	}

	public static void main(String[] args) {

		mainclass frame = new mainclass();
		JButton b[] = new JButton[5];

		for(int i = 0; i<5; i++) {
			b[i] = new JButton("but");
			frame.add(b[i]);
		}
	}
}