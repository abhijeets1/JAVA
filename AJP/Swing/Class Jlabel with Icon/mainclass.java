import javax.swing.*;
import java.awt.*;

class mainclass extends JFrame {

	private mainclass() {
		super("JLabel");

		ImageIcon icon = new ImageIcon("icon.jpg");
		if(icon != null){
			Image img = icon.getImage(); 
			Image newimg = img.getScaledInstance(600, 500, Image.SCALE_SMOOTH);
			icon = new ImageIcon(newimg);
		}

		JLabel iconLabel = new JLabel("Icon", icon, JLabel.CENTER);
		add(iconLabel, BorderLayout.CENTER);

		setSize(500,500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new mainclass();
	}

}