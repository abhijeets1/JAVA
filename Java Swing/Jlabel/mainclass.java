import javax.swing.*;

class mainclass {
	public static void main(String[] args) {
		JFrame f = new JFrame();

		JLabel l = new JLabel();
		l.setText("Abhijeet");
		l.setBounds(50,50,100,30);

		JLabel l2 = new JLabel(new ImageIcon("D:\\Study\\JAVA\\Java Swing\\Jbutton\\121404.jpg"));
		l2.setBounds(50,150,100,30);

		f.add(l);
		f.add(l2);

		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		System.out.println(l.getText());
		System.out.println(l.getHorizontalAlignment());


	}
}