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
		// drawPolygon(x[], y[], n);
		g.drawPolygon(new int[]{100, 300, 200}, new int[]{200, 100, 300}, 3);
	}
}