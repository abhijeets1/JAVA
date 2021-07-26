import javax.swing.*;

class mainclass {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JButton b = new JButton(); // Button 1 text
		b.setText("Click Here !!");
		b.setBounds(40, 40, 120, 70);

		JButton b2 = new JButton(new ImageIcon("121404.jpg")); // Button 2 image
		b2.setBounds(40, 120, 240, 140);

		f.add(b);
		f.add(b2);
		f.setLayout(null);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}