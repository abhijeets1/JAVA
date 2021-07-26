import javax.swing.*;
import java.awt.event.*;

class mainclass extends JFrame implements KeyListener {

	JLabel l;
	JTextArea a;
	mainclass() {
		l = new JLabel();
		l.setBounds(10,20,2250,30);
		a = new JTextArea();
		a.setBounds(10,50,225,160);
		a.addKeyListener(this);

		add(l);
		add(a);
		setSize(250,250);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	public static void main(String[] args) {
		new mainclass();
	}
	public void keyPressed(KeyEvent e) {
		String s = a.getText();
		l.setText("Key Pressed " + s);
	}
	public void keyReleased(KeyEvent e) {
		String s = a.getText();
		l.setText("Key Released " + s);
	}
	public void keyTyped(KeyEvent e) {
		String s = a.getText();
		l.setText("Key Typed " + s);
	}
}