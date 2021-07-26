import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {
	MyFrame() {
		setSize(350, 200);
		setVisible(true);
		setLayout(null);
		setLocationRelativeTo(null);
	}
}

class mainclass extends MyFrame implements ActionListener {

	TextField t1, t2;
	Button b1;
	Label l1, l2;
	mainclass() {
		super();

		t1 = new TextField("");
		t1.setBounds(100, 100, 50, 20);

		t2 = new TextField("");
		t2.setBounds(200, 100, 50, 20);

		b1 = new Button("Click Here !!");
		b1.setBounds(100, 140, 150, 30);
		b1.addActionListener(this);

		l2 = new Label("Result :- ");
		l2.setBounds(100, 50, 100, 20);	

		l1 = new Label("__");
		l1.setBounds(210, 50, 100, 20);		

		add(t1);
		add(t2);
		add(b1);
		add(l1);
		add(l2);
	}

	public static void main(String[] args) {
		new mainclass();
	}

	public void actionPerformed(ActionEvent e) {
		Long i = 0L;
		i+=Integer.parseInt(t1.getText());
		i+=Integer.parseInt(t2.getText());
		l1.setText(String.valueOf(i));
	}
}