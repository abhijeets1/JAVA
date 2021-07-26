import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
// import
public class home extends JFrame implements ActionListener  {

	JLabel label;
	JButton b[];

	public home() {

		ImageIcon imageIcon = new ImageIcon("brand.png");
		label = new JLabel("", imageIcon, JLabel.CENTER);
		label.setBounds(150, 40, 400, 200);
		add(label);

		b = new JButton[4];
		String bname[] = new String[]{"Manage Medicine", "View Customer Records", "Create Bill", "Edit Account"};
		int j = 0;

		for(int i = 0; i < 4; i++) {
			b[i] = new JButton(bname[i]);
			b[i].setBounds(180, 250 + j, 350, 50);
			b[i].addActionListener(this);
			add(b[i]);
			b[i].setFocusPainted(false);
			b[i].setBackground(Color.BLACK);
			b[i].setForeground(Color.WHITE);
			b[i].setFont(new Font("Calibri",Font.PLAIN,25));
			b[i].setBorder(BorderFactory.createRaisedBevelBorder());
			j += 80;
		}

		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		setLayout(null);
		setVisible(true);
		setSize(700, 700);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == b[0]) {
			new MyFrame();
		} else if(e.getSource() == b[1]) {
			new CUS_F();
		} else if(e.getSource() == b[2]) {
			new Bill();
		} else {
			new UpdateFrame();
		}
	}

	public static void main(String[] args) {
		new home();
	}
}