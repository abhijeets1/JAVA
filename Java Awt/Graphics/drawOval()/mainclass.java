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
		// drawOval(x, y, w, h);
		g.drawOval(120,120,300,200);
		g.drawOval(120,120,200,200);
		g.drawOval(120,120,100,200);
		g.drawOval(120,120,50,200);
		g.drawOval(120,120,25,200);
		g.drawOval(120,120,0,200);
	}
}