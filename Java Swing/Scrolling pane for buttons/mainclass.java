import javax.swing.*;
import java.awt.*;


class mainclass extends JFrame{

	mainclass() {
		setSize(800, 600);
		setVisible(true);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		mainclass frame = new mainclass();
		JPanel pane = new JPanel();
		JScrollPane scpane = new JScrollPane(pane);
		scpane.setBounds(100, 100, 400, 400);
		pane.setBackground(Color.RED);
		pane.setBounds(100, 100, 400, 400);
		pane.setLayout(new FlowLayout());

		JButton b[] = new JButton[100];

		for(int i = 0;i<100;i++) {
			b[i] = new JButton("Button");
			pane.add(b[i]);
		}
		

		frame.getContentPane().add(scpane);

	}
}