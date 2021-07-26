import java.awt.*;

class MyFrame extends Frame {
	MyFrame() {
		setSize(500, 470);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
	}
}

class mainclass extends MyFrame {
	mainclass() {
		super();
		setBackground(Color.BLACK);
	}

	public static void main(String[] args) {
		mainclass obj = new mainclass();
	}

	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawRoundRect(100,100,300,300,300,300);
		for(int i = 1; i<=360; i++) {
			g.setColor(Color.RED);
			g.fillArc(100,100,300,300,90,-1*i);
			try{
				Thread.sleep(2);
			}
			catch(Exception e) {

			}
		}		
	}
}