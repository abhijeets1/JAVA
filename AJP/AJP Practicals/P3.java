// Practical 3 :- Write a Program in java to create a JTree.

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

class P3 extends JFrame {

	private P3() {
		// JFrame Title
		super("JTree");

		// JTree Nodes
		DefaultMutableTreeNode treeNodes[] = new DefaultMutableTreeNode[3];
		treeNodes[0] = new DefaultMutableTreeNode("India");
		treeNodes[1] = new DefaultMutableTreeNode("Maharashtra");
		treeNodes[2] = new DefaultMutableTreeNode("Cities");
		treeNodes[0].add(treeNodes[1]);
		treeNodes[1].add(treeNodes[2]);

		String cities_name[] = {"Amravati", "Nagpur", "Nashik", "Pune"};
		for(String city_name : cities_name) {
			treeNodes[2].add(new DefaultMutableTreeNode(city_name));
		}

		// JTree
		JTree jTree = new JTree(treeNodes[0]);
		add(jTree);

		// JFrame
		setVisible(true);
		setSize(200, 200);
		setLayout(new GridLayout(1, 1));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new P3();
	}

}