// Write a Program in java to create a JProgressBar.

import javax.swing.*;
   
class prac5 extends JFrame{

	// Components Declaration
	JProgressBar probar;
	int i = 0, num = 0;

	prac5(){

		// JProgressbar
		probar = new JProgressBar(0,1000);
		probar.setBounds(100,100,160,30);
		probar.setValue(0);
		probar.setStringPainted(true);
		add(probar);

		// JFrame
		setLayout(null);
		setVisible(true);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void iterate(){
		while(i <= 1000){
			probar.setValue(i);
			i = i + 100;
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		prac5 object = new prac5();
		object.iterate();
	}
}