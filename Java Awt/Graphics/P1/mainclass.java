import java.awt.Graphics;
import java.awt.Frame;
import java.awt.Color;

class mainclass extends Frame {

	mainclass() {
		setSize(500, 500);
		setVisible(true);
		setLayout(null);

		setBackground(Color.BLACK);
		setForeground(Color.RED);
	}

	public static void main(String[] args) {
		new mainclass();	
	}

	public void paint(Graphics g) {

		int x2 = 100;
		for(int i = 0;i<=200;i++) {
			g.drawLine(100,100,x2,100);
			x2+=1;
			try {
				Thread.sleep(10);
			} catch(Exception e) {

			}
		}

		int y2 = 100;
		for(int i = 0;i<=200;i++) {
			g.drawLine(100,100,x2,y2);
			y2+=1;
			try {
				Thread.sleep(10);
			} catch(Exception e) {

			}
		}

		g.setColor(Color.GREEN);

		int y1 = 100;
		for(int i = 0;i<=201;i++) {
			g.drawLine(100,y1,x2,y2);
			y1+=1;
			try {
				Thread.sleep(10);
			} catch(Exception e) {

			}
		}
	}
}