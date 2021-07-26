import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class mainclass extends JFrame implements ActionListener {

	mainclass() {
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
	}
	public static void main(String[] args) {
		mainclass frame = new mainclass();
		JButton b1 = new JButton("B1");
		b1.addActionListener(new mainclass());
		JButton b2 = new JButton("B2");
		b2.addActionListener(new mainclass());
		frame.add(b1);
		frame.add(b2);
	}

	public void actionPerformed(ActionEvent e) {
		dispose();
	}
}