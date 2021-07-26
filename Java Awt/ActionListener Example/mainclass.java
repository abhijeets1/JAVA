import java.awt.*;
import java.awt.event.*;

 // 1st:
class mainclass extends Frame implements ActionListener{

	mainclass(Panel p) {
		super("ActionListener Example");
		super.add(p);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		Button b = new Button("CLICK ME!");
		TextField tf = new TextField("Text - -");
		b.setBounds(30,30,100,30);
		tf.setBounds(30,50,100,30);
		b.addActionListener(this);

		Panel p = new Panel();
		p.setBounds(0,0,500,500);
		p.setBackground(Color.red);

		p.add(b);
		p.add(tf);
		new mainclass(p);
	}

	// 3rd :
	public void actionPerformed(ActionEvent e) {
		tf.setText("Abhijeet Shahakar");
	}
}