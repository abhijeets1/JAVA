import java.awt.*;
class mainclass
{
	mainclass() {
		Frame f1 = new Frame("Labels");

		Label l1 = new Label("Hello");
				// X-co Y-co
		l1.setBounds(10,20,100,30);
		Label l2 = new Label("World");
		l2.setBounds(150,150,100,30);
		f1.add(l1);
		f1.add(l2);

		f1.setSize(400, 400);
		f1.setLayout(null);
		f1.setVisible(true);
	}
	public static void main(String[] args) {
		new mainclass();
	}
}