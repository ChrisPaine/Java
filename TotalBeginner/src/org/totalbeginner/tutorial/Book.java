package org.totalbeginner.tutorial;

public class Book {
	int test = 1;
	String title;
	String author;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

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
