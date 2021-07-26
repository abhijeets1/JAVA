import java.awt.*;

class mainclass {

	public static void main(String[] args) {
		
		Frame f1 = new Frame("Checkbox");

		Checkbox c1 = new Checkbox("Hello");
		Checkbox c2 = new Checkbox("World",true);
		c1.setBounds(100,150,50,50);
		c2.setBounds(100,250,50,50);

		f1.add(c1); f1.add(c2);
		f1.setSize(600, 600);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}