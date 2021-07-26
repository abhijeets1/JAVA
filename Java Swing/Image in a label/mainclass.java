import javax.swing.*;
import java.awt.*;

class mainclass extends JFrame {
	mainclass() {
		setSize(800, 800);
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		mainclass mainframe = new mainclass();
		ImageIcon img = new ImageIcon("image.JPG");
		JLabel l = new JLabel(img);
		l.setSize(img.getIconWidth(), img.getIconWidth()); // getIconHeight();
		mainframe.getContentPane().add(l);
	}
} 