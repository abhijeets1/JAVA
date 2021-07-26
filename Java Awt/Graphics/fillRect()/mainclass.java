import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

class mainclass extends JFrame {

	mainclass() {
		setSize(350,700);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new mainclass();
	}

	public void paint(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(60,50,100,100);
		g.setColor(Color.GREEN);
		g.fillRect(60,200,100,100);
		g.setColor(Color.BLACK);
		g.fillRect(60,350,100,100);
	}

}