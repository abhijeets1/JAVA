import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class mainclass extends JFrame implements ItemListener {

	static JLabel l;
	static JComboBox c;

	mainclass() {
		l = new JLabel();
		setSize(200, 200);
		setVisible(true);
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		mainclass frame = new mainclass();

		String array[] = new String[]{"C++", "C", "Java", "Python"};
		c = new JComboBox(array);
		c.addItemListener(frame);

		frame.getContentPane().add(c);
		frame.getContentPane().add(l);
	}

	public void itemStateChanged(ItemEvent e) {
		l.setText(String.valueOf(c.getSelectedItem()));
	}

}