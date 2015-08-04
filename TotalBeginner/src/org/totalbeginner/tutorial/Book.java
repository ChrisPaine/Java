package org.totalbeginner.tutorial;

public class Book {

	String title;
	String author;
	Person person;

	public Book(String string) {
		this.title = string;
		author = "unknown author";
	}

	public void setPerson(Person p2) {
		this.person = p2;
	}

	public Person getPerson() {
		return this.person;
	}

}
