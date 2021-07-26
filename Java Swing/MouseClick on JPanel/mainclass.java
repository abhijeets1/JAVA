import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Desktop;
import java.net.URI;

class mainclass extends JFrame implements MouseListener {

	JPanel pan;

	mainclass() {

		setSize(500, 500);
		setVisible(true);
		setLayout(null);
		pan = new JPanel();
		pan.setBackground(Color.red);
		pan.setBounds(100, 100,300 ,300);
		pan.addMouseListener(this);
		getContentPane().add(pan);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) {

		mainclass frame = new mainclass();

	}

	public void mouseClicked(MouseEvent e) {
		pan.setBackground(Color.GREEN);
		try {
		Desktop d1 = Desktop.getDesktop();
		d1.browse(new URI("http://bing.com"));
		} catch(Exception ex) {}
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}

}