import java.awt.*;

class mainclass {

	mainclass() {

		Frame f1 = new Frame();

		MenuBar mbar = new MenuBar();
		
		Menu edit = new Menu("Edit");
		Menu ins = new Menu("Insert");
		Menu subm = new Menu("Sub Edit");

		MenuItem i1 = new MenuItem("Item 1");  
        MenuItem i2 = new MenuItem("Item 2");  
        MenuItem i3 = new MenuItem("Item 3");  
        MenuItem i4 = new MenuItem("Item 4");  
        MenuItem i5 = new MenuItem("Item 5");
        MenuItem i6 = new MenuItem("Item 6");
        MenuItem i7 = new MenuItem("Item 7");

        edit.add(i1); 
        edit.add(i2); 
        edit.add(i3);

        ins.add(i6); 
        ins.add(i7);

        subm.add(i4); 
        subm.add(i5);

        edit.add(subm);

		mbar.add(edit);
		mbar.add(ins);

		f1.setMenuBar(mbar);
		f1.setSize(500, 500);
		f1.setLayout(null);
		f1.setVisible(true);

	}

	public static void main(String[] args) {

		new mainclass();

	}
}