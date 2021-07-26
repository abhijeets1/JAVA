import java.awt.*;
import java.awt.event.*;
class mainclass extends Frame implements MouseListener{
	Label l;
	mainclass() {
		addMouseListener(this);  

		l = new Label();
		l.setBounds(100,100,100,30);
		add(l);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new mainclass();
	}

	public void mouseEntered(MouseEvent e) {
		l.setText("mouseEntered");
	}
	public void mouseExited(MouseEvent e) {
		l.setText("mouseExited");
	}
	public void mousePressed(MouseEvent e) {
		l.setText("mousePresed");
	}
	public void mouseReleased(MouseEvent e) {
		l.setText("mouseReleased");
	}
	public void mouseClicked(MouseEvent e) {
		l.setText("mouseClicked");
	}
}