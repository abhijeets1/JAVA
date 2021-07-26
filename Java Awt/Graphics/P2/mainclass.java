import java.awt.Graphics;
import java.awt.Frame;
import java.awt.Color;
import java.util.Random;

class mainclass extends Frame {

	mainclass() {
		setSize(500, 500);
		setVisible(true);
		setLayout(null);

		setBackground(Color.BLACK);
	}

	public static void main(String[] args) {
		new mainclass();	
	}

	public void paint(Graphics g) {
		while(true) {
			g.setColor(new Color(1 + new Random().nextInt(255),
								 1 + new Random().nextInt(255),
								 1 + new Random().nextInt(255)));
			arc(0, g);
			g.setColor(new Color(1 + new Random().nextInt(255), 
								 1 + new Random().nextInt(255),
								 1 + new Random().nextInt(255)));
			arc(90, g);
			g.setColor(new Color(1 + new Random().nextInt(255),
								 1 + new Random().nextInt(255),
								 1 + new Random().nextInt(255)));
			arc(180, g);
			g.setColor(new Color(1 + new Random().nextInt(255),
								 1 + new Random().nextInt(255),
								 1 + new Random().nextInt(255)));
			arc(270, g);
		}
	}

	public static void arc(int loc, Graphics g) {
		for(int i = 0;i<=90;i++) {
			g.drawArc(125, 125, 250, 250, loc, i);
			try {
				Thread.sleep(5);
			} catch(Exception e) {

			}
		}	
	}
}