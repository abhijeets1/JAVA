import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class mainclass extends JFrame implements MouseListener, MouseMotionListener{
	JLabel l;
	int X,Y;
	mainclass() {
		addMouseListener(this);  
		addMouseMotionListener(this); 

		l = new JLabel();
		add(l);
		setSize(500,500);
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new mainclass();
	}

	public void mouseEntered(MouseEvent e) {
		X = e.getX();
		Y = e.getY();
		l.setText("Mouse Entered = " + X + " " + Y);

	}
	public void mouseExited(MouseEvent e) {
		X = e.getX();
		Y = e.getY();
		l.setText("Mouse Exited = " + X + " " + Y);
	}
	public void mousePressed(MouseEvent e) {
		X = e.getX();
		Y = e.getY();
		l.setText("Mouse Pressed = " + X + " " + Y);
	}
	public void mouseReleased(MouseEvent e) {
		X = e.getX();
		Y = e.getY();
		l.setText("Mouse Released = " + X + " " + Y);
	}
	public void mouseClicked(MouseEvent e) {
		X = e.getX();
		Y = e.getY();
		l.setText("Mouse Clicked = " + X + " " + Y);
	}
	public void mouseDragged(MouseEvent e) {  
		X = e.getX();
		Y = e.getY();
		l.setText("Mouse Dragged = " + X + " " + Y);
	}  
	public void mouseMoved(MouseEvent e) {
		X = e.getX();
		Y = e.getY();
		l.setText("Mouse Moved = " + X + " " + Y);
	}  
}