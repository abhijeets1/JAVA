import java.awt.*;

class mainclass extends Frame {

	mainclass(Panel p) {

		super("Frame");
		add(p);
		setSize(500,500);
		setLayout(null);
		setVisible(true);

	}

	static void fun() {
		Button b = new Button("CLICK ME!");
		TextField tf = new TextField("Text - -");
		b.setBounds(50,50,100,20);
		tf.setBounds(50,90,150,20);

		Panel p = new Panel();
		p.setBounds(0,0,500,500);
		p.setBackground(Color.white);

		p.add(b);
		p.add(tf);
		p.setLayout(null);
		new mainclass(p);
	}

	public static void main(String[] args) {

		fun();
		fun();

	}

}