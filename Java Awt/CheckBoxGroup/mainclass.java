import java.awt.*;
class mainclass {
	mainclass() {
		Frame f1 = new Frame();
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox c1 = new Checkbox("C++", cbg, true);
		Checkbox c2 = new Checkbox("Java", cbg, false);
		c1.setBounds(30,30,40,40);
		c2.setBounds(90,90,40,40);
		f1.add(c1); f1.add(c2);

		f1.setSize(500,400);
		f1.setLayout(null);
		f1.setVisible(true);
	}
	public static void main(String[] args) {
		new mainclass();
	}
}