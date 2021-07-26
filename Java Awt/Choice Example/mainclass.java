import java.awt.*;
class mainclass {

	mainclass() {
		Frame f1 = new Frame("Choice Example !!");
		Choice cho1 = new Choice();
		cho1.setBounds(100,100,40,40);
		cho1.add("C++");
		cho1.add("Java");
		cho1.add("C");
		cho1.add("Python");

		f1.add(cho1);
		f1.setSize(500, 400);
		f1.setLayout(null);
		f1.setVisible(true);
	}

	public static void main(String[] args) {
		new mainclass();	
	}
}