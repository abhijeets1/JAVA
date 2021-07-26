// Practical 2 :- Write a Program using Swing to display a ScrollPane and JComboBox in an Applet with the item :- English, Marathi, Hindi, and Sanskrit.

import javax.swing.*;
import java.awt.*;

class P2 extends JFrame {

	private P2() {
		// JFrame Title
		super("ScrollPane, JComboBox");

		// For JTextArea & JScrollPane
		JTextArea textArea = new JTextArea(50, 50);  
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane, BorderLayout.CENTER);

        // For JComboBox
        String languages[] = new String[]{"Select Language", "English", "Marathi", "Hindi", "Sanskrit"};
		JComboBox comboBox = new JComboBox(languages);
		comboBox.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(comboBox, BorderLayout.SOUTH);

		// JFrame
		setVisible(true);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new P2();
	}
}