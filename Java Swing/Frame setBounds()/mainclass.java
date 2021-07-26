import javax.swing.*;
class mainclass extends JFrame {
	mainclass() {
		setVisible(true);
		setBounds(200,200,100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		mainclass obj = new mainclass();	
	}
}