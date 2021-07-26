import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame {
	MyFrame() {
		setSize(500, 500);
		setVisible(true);
		setLayout(null);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

class mainclass extends MyFrame{

	mainclass() {
		setBackground(Color.BLACK);
	}

	public static void main(String a[]) {
		new mainclass();
	}

	public void paint(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillArc(125, 125, 250, 250, 0, 180);
		g.setColor(Color.BLACK);
		g.fillArc(160, 150, 200, 200, 0, 180);

		
		g.setColor(Color.RED);
		g.fillRect(125, 125, 5, 5);
		g.fillRect(375-5, 375-5, 5, 5);
		g.fillRect(125-5, 375-5, 5, 5);
		g.fillRect(375-5, 125-5, 5, 5);
	}
}