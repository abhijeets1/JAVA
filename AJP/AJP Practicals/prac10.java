// Write a Program to demonstrate the use of getter and setter method of Java Beans.

import java.io.Serializable;

public class prac10 implements Serializable {

	// Member Variable Declaration
	private int id;
	private String name;

	public prac10(){}

	// Set Id, Get Id
	public void setId(int id) {
		this.id = id;
	}
	public int getId(){
		return id;
	}

	// Set Name, Get Name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public static void main(String[] args) {

		// Creating Object
		prac10 student = new prac10();

		// Setting Object Member Variables
		student.setId(54);
		student.setName("Abhijeet Shahakar");

		// Getting Object Member Variables
		System.out.println("Student Id: " + student.getId() + "\nStudent Name: " + student.getName());
	}
}