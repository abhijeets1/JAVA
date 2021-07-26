import javax.swing.*;
import java.awt.*;

class mainclass {
	public static void main(String[] args) {
		JFrame frame = new JFrame("FRAME");
		Container c = frame.getContentPane();
		frame.remove(c);
		frame.getContentPane().setBackground(Color.RED);
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}