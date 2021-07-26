import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



/*

	JButton with implemented ActionListener

*/


class MyButton extends JButton implements ActionListener {
	MyButton() {
		super();
		this.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		act(e);
	}

	public void act(ActionEvent e) {}
}







class mainclass {

	public static void main(String[] args) {
		JFrame f = new JFrame();

		MyButton but = new MyButton(){
			public void act(ActionEvent e) {
				f.getContentPane().setBackground(Color.RED);
			}
		};

		but.setText("Click Here!");

		f.setSize(100, 100);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(but);
	}
}