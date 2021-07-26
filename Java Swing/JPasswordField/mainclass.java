import javax.swing.*;
class mainclass extends JFrame{

	private JPasswordField pf;

	mainclass() {
		pf = new JPasswordField("",100);
		pf.setBounds(40,40,100,50);
		add(pf);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		mainclass obj = new mainclass();
		String s = String.valueOf(obj.pf.getPassword());
		System.out.println(s);
	}
}