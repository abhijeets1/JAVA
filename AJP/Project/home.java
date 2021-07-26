import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class home extends JFrame implements ActionListener  {

	JLabel label;
	JButton b[];

	private home() {

		ImageIcon imageIcon = new ImageIcon("brand.png");
		label = new JLabel("", imageIcon, JLabel.CENTER);
		label.setBounds(150, 150, 400, 200);
		add(label);

		b = new JButton[4];
		String bname[] = new String[]{"Manage Medicine", "View Customer Records", "Create Bill", "Edit Account"};
		int j = 0;

		for(int i = 0; i < 4; i++) {
			b[i] = new JButton(bname[i]);
			b[i].setBounds(250, 400 + j, 200, 40);
			b[i].addActionListener(this);
			add(b[i]);
			j += 50;
		}

		setLayout(null);
		setVisible(true);
		setSize(700, 700);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == b[0]) {
			System.out.println(1);
		} else if(e.getSource() == b[1]) {
			System.out.println(2);
		} else if(e.getSource() == b[2]) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}

	public static void main(String[] args) {
		new home();
	}
}