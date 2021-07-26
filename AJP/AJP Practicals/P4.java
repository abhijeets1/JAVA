// Practical 4 :- Write a Program in java to create a JTable.

import javax.swing.*;

class P4 extends JFrame {

    private P4() {
        // JFrame Title
        super("JTable");

        // JTable Rows & Column
    	String column[] = {"ID","NAME","SALARY"};
    	String rows[][] = {{"1", "Abhijeet", "80000"},
						 {"2", "Raghav", "78000"},
    	                 {"3", "Sachin", "70000"}};

        // JTable
    	JTable jTable = new JTable(rows, column);
    	JScrollPane scrollPane = new JScrollPane(jTable);
    	add(scrollPane);

        // JFrame
    	setVisible(true);
    	setSize(500, 150);
    	setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
    	new P4();
	}

}