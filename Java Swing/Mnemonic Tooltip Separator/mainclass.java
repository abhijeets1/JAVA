import javax.swing.*;

class mainclass extends JFrame{
	JMenuBar mbar;
	JMenu f, smenu;
	JMenuItem i1, i2, i3, i4, i5;
	mainclass() {
		mbar = new JMenuBar();
			f = new JMenu("File");
			smenu = new JMenu("SubMenu");
				i1 = new JMenuItem("Item1");
				i2 = new JMenuItem("Item2");
				i3 = new JMenuItem("Item3");
				i4 = new JMenuItem("Item4");
				i5 = new JMenuItem("Item5");
				f.add(i1);
				f.addSeparator();
				f.add(i2);
				f.addSeparator();
				f.add(smenu);
				smenu.add(i3);
				smenu.add(i4);
				smenu.add(i5);
			mbar.add(f);
		setJMenuBar(mbar);

		f.setMnemonic('F');
		smenu.setMnemonic('S');
		f.setToolTipText("File");

		setVisible(true);
		setLayout(null);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		new mainclass();
	}
}