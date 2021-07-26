import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;

class mainclass extends JFrame {

	mainclass() {
		setSize(500,500);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Font obj = new Font("",Font.PLAIN,50);
		setFont(new Font("Bradley Hand ITC",Font.ITALIC,50)); // Font.BOLD Font.PLAIN
	}

	public static void main(String[] args) {
		new mainclass();
	}

	public void paint(Graphics g) {
		g.drawString("Abhijeet",100,200);
	}
}