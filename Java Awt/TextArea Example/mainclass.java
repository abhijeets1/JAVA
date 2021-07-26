import java.awt.*;

class mainclass {

	public static void main(String[] args) {
		
		Frame f1 = new Frame("Text Field");

		TextArea area1 = new TextArea("Welcome !!");
		area1.setBounds(150, 150, 200, 200);

		f1.add(area1);
		f1.setSize(600, 600);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}