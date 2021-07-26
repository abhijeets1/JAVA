import java.awt.*;
class mainclass extends Frame {
	mainclass(Panel p) {
		super("Panel Example");
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		add(p);
	}
	public static void main(String[] s) {
		Panel p = new Panel();
		p.setBounds(0,0,400,400);
		p.setBackground(Color.red);
		new mainclass(p);
	}
}