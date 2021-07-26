import javax.swing.*;
import java.awt.Graphics;

class mainclass extends JFrame {
	mainclass() {
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new mainclass() {
			public void paint(Graphics g) {
				g.drawLine(200,200,300,300);
			}
		};
	}
	public void paint(Graphics g) {}

}