import java.awt.*;
import javax.swing.*;

class mainclass extends JFrame {

	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;

	mainclass() {

		b1 = new JButton("North");
		// b1.setBackground(Color.RED);
		b2 = new JButton("South");
		b3 = new JButton("East");
		b4 = new JButton("West");
		b5 = new JButton("Center");

		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.EAST);
		add(b4, BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);

		setSize(500,500);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new mainclass();

	}
}