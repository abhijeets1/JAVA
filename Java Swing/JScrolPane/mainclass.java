import javax.swing.*;
import java.awt.*;

class mainclass {
	public static void main(String[] args) {
		JFrame f1 = new JFrame("Frame");
		JPanel p1 = new JPanel();
		JScrollPane pane = new JScrollPane(p1);
		f1.setContentPane(pane); // f1.getContentPane().add(pane);
		p1.setLayout(new FlowLayout());
		JButton b1 = new JButton("B1");
		JButton b2 = new JButton("B2");
		p1.add(b1);
		p1.add(b2);


		f1.setSize(500, 500);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}