package org.totalbeginner.tutorial;

public class Person {
	// fields
	private String name; // name of the person
	private int maximunBooks; // most books can checkout

	// constructor
	public Person() {
		name = "unknown name";
		maximunBooks = 3;
	}

	// Getters/setters
	public String getName() {
		return name;
	}

	public void setName(String anyName) {
		name = anyName;
	}

	public int getMaximunBooks() {
		return maximunBooks;
	}

	public void setMaximunBooks(int maximunBooks) {
		this.maximunBooks = maximunBooks;
	}

	public String toString() {
		return this.getName() + " (" + this.getMaximunBooks() + " books)";
	}
}
