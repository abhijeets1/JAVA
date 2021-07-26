import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class mainclass extends JFrame {

	static mainclass frame;
	mainclass() {
		setBounds(100,100,200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
	}

	public static void main(String[] args) {
		frame = new mainclass(); // frame
		buttonsOnFrame();
	}

	static void buttonsOnFrame() {
		JButton b1 = new JButton("BUTTON1"); // Button : 1
		b1.setSize(50,50);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("BUTTON1");
			}
		});

		JButton b2 = new JButton("BUTTON2"); // Button : 2
		b2.setSize(50,50);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("BUTTON2");
			}
		});

		frame.add(b1);
		frame.add(b2);
	}
}