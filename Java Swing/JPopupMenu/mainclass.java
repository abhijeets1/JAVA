import javax.swing.*;
import java.awt.event.*;

class mainclass extends JFrame implements MouseListener {

	JPopupMenu pmenu;
	JMenuItem copy,cut,pst;

	mainclass() {
		pmenu = new JPopupMenu();

		copy = new JMenuItem("copy");
		cut = new JMenuItem("cut");
		pst = new JMenuItem("paste");
		pmenu.add(copy);
		pmenu.add(cut);
		pmenu.add(pst);

		addMouseListener(this);
		add(pmenu);
		setSize(500,500);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new mainclass();
	}

	public void mouseClicked(MouseEvent e) {

		pmenu.show(this,e.getX(),e.getY());
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}