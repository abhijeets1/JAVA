import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class mainclass extends JFrame implements ActionListener {

	static mainclass frame;
	mainclass() {
		setBounds(100,100,200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
	}

	public static void main(String[] args) {
		frame = new mainclass();
		JButton b1 = new JButton("BUTTON");
		b1.setSize(50,50);
		b1.addActionListener(frame);
		frame.add(b1);
	}

	public void actionPerformed(ActionEvent e) {
		JButton b1 = new JButton("BUTTON");
		b1.setSize(50,50);
		b1.addActionListener(frame);
		frame.add(b1);	
	}
}