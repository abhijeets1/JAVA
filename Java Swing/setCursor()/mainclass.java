import javax.swing.*;
import java.awt.*;

class mainclass extends JFrame {

	mainclass(String s) {
		setTitle(s);
		setVisible(true);
		setSize(600, 600);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		mainclass frame = new mainclass("frame");
		frame.setCursor(new Cursor(Cursor.WAIT_CURSOR)); // HAND_CURSOR CROSSHAIR_CURSOR
	}

}
