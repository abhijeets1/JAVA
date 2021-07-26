import java.awt.*;
class mainclass
{
	public static void main(String[] args) {
		Frame f1 = new Frame("Demonstration of Button");

		Button b1 = new Button("Click here!!");
		b1.setBounds(100,200,100,100);

		f1.add(b1);
		f1.setSize(800, 800);
		f1.setVisible(true);
		f1.setLayout(null);
	}
}