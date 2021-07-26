import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import javax.swing.*;

class mainclass extends JFrame {
	
	mainclass() {
		setSize(500,500);
		setVisible(true);
		setForeground(Color.RED);
		setBackground(Color.BLUE);
		setLayout(null);
	}
	public static void main(String[] args) {
		new mainclass();
	}

	@Override
	public void paint(Graphics g) {
		g.drawLine(100,100,300,300);
	}
}