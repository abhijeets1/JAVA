import java.awt.*;
class mainclass {

	public static void main(String[] args) {
		Frame f1 = new Frame();

		Scrollbar s1 = new Scrollbar();
		s1.setBounds(100,100,15,100);
		f1.add(s1);

		f1.setSize(500,800);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}