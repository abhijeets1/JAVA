import java.awt.*;

class mainclass {

	public static void main(String[] args) {
		
		Frame f1 = new Frame("Text Field");

		TextField t1, t2;
		t1 = new TextField("FIELD 1");
		t2 = new TextField("FIELD 2");
		t1.setBounds(70, 70, 200, 30);
		t2.setBounds(150, 150, 200, 30);

		f1.add(t1);
		f1.add(t2);
		f1.setSize(600, 600);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}