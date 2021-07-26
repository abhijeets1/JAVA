import java.awt.Graphics;
import javax.swing.*;

class mainclass extends JFrame{

	mainclass() {
		setSize(600, 600);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new mainclass();
	}

	public void paint(Graphics g) {
		// drawArc(x, y, w, h, starting angle, moving angle);
		g.drawArc(120, 120, 200, 200, 0, 180);
	}
}