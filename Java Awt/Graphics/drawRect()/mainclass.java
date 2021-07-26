import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

class mainclass extends JFrame {

	mainclass() {
		setSize(250,250);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setForeground(Color.BLACK);
	}

	public static void main(String[] args) {
		new mainclass();
	}

	public void paint(Graphics g) {
		g.drawRect(60,60,100,100);
	}

}