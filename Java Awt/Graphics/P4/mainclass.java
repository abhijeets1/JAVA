import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {
	MyFrame() {
		setSize(250,200);
		setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
	}
}

class mainclass extends MyFrame implements ActionListener {
	Button red, blue, green;
	mainclass() {
		super();
		createButtons();
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		add(red);
		add(blue);
		add(green);
	}

	public static void main(String[] args) {
		new mainclass();
	}

	void createButtons() {
		red = new Button("Red");
		red.setBounds(50,50,50,50);

		blue = new Button("Blue");
		blue.setBounds(100,50,50,50);

		green = new Button("Green");
		green.setBounds(150,50,50,50);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == red) {
			setBackground(Color.RED);
		}

		if(e.getSource() == blue) {
			setBackground(Color.BLUE);
		}

		if(e.getSource() == green) {
			setBackground(Color.GREEN);
		}
	}
}
