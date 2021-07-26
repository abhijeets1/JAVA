import java.awt.*;
class mainclass {

	mainclass() {
		Frame f1 = new Frame("Choice Example !!");
		List l1 = new List();
		l1.setBounds(100,100,100,100);
		l1.add("C++");
		l1.add("Java");
		l1.add("C");
		l1.add("Python");

		f1.add(l1);
		f1.setSize(500, 400);
		f1.setLayout(null);
		f1.setVisible(true);
	}

	public static void main(String[] args) {
		new mainclass();	
	}
}